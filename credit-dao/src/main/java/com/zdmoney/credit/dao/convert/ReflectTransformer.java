package com.zdmoney.credit.dao.convert;

import java.util.List;

import org.hibernate.transform.ResultTransformer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapperImpl;

public class ReflectTransformer implements ResultTransformer{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Class<?> elementClass;
	public ReflectTransformer(Class<?> elementClass){
		this.elementClass=elementClass;
	}
	@Override
	public Object transformTuple(Object[] tuple, String[] aliases) {
		BeanWrapperImpl beanWrapper=new BeanWrapperImpl(BeanUtils.instantiate(elementClass));
		StringBuilder sb=new StringBuilder();
		for ( int i=0; i<tuple.length; i++ ) {
			String property =columnToProperty(aliases[i],sb);
			if(beanWrapper.isWritableProperty(property)){
				beanWrapper.setPropertyValue(property, tuple[i]);
			}
		}
		return beanWrapper.getRootInstance();
	}
	private static String columnToProperty(String alias,StringBuilder sb){
		sb.setLength(0);
		boolean underlineBefore=false;
		for(int i=0;i<alias.length();i++){
			char c=alias.charAt(i);
			if(c=='_'){
				underlineBefore=true;
				continue;
			}
			if(underlineBefore){
				if(c>='a'&& c<='z'){
					c=(char) (c-('a'-'A'));
				}
				underlineBefore=false;
			}else if(c>='A' && c<='Z'){
				c=(char) (c+('a'-'A'));
			}
			sb.append(c);
		}
		return sb.toString();
		
	}
	@SuppressWarnings("rawtypes")
	@Override
	public List transformList(List collection) {
		return collection;
	}
}
