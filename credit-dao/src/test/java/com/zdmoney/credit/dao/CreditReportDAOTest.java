package com.zdmoney.credit.dao;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.zdmoney.credit.dao.CreditRecordRepository;
import com.zdmoney.credit.dao.CreditReportRepository;
import com.zdmoney.credit.dao.convert.ReflectTransformer;
import com.zdmoney.credit.domain.pbccrc.CreditRecord;
import com.zdmoney.credit.domain.pbccrc.CreditReport;
import com.zdmoney.credit.domain.view.CreditReportVIEW;
import com.zdmoney.credit.domain.view.ReportInfoVIEW;

@RunWith(SpringRunner.class)
@TestPropertySource("classpath:application-test.properties")
@EntityScan({"com.zdmoney.credit.domain"})
@EnableJpaRepositories(basePackages="com.zdmoney.credit.dao")
@SpringBootApplication
@Transactional
@Ignore
public class CreditReportDAOTest {
	@Autowired
	private CreditReportRepository creditReportDAO;
	@Autowired
	private CreditRecordRepository creditRecordDAO;
	@Autowired
	private EntityManager em;
	@Test
	public void testQueryCreditReport(){
		CreditReport creditReport=creditReportDAO.queryById(100031l);
		log(creditReport.getId());
		log(creditReport.getName());
		log(creditReport.getCertType());
		log(creditReport.getCertNo());
		log(creditReport.getQueryTime());
		log(creditReport.getReportTime());
		log(creditReport.getMaritalStatus());
		log(creditReport.getReportNo());
		log(creditReport.getDescription());
		log(creditReport.getCreditRecordDescription());
		log(creditReport.getQueryRecordDescription());
		log(creditReport.getCommonRecordDescription());
		log(creditReport.getCommonRecordDetail());
		log(creditReport.getCreditRecordSummary());
		log(creditReport.getCreditCardTotal());
		log(creditReport.getCreditCardActive());
		log(creditReport.getCreditCardOverdue());
		log(creditReport.getCreditCardSeriousOverdue());
		log(creditReport.getCreditCardGuarantee());
		log(creditReport.getHousingLoanTotal());
		log(creditReport.getHousingLoanActive());
		log(creditReport.getHousingLoanOverdue());
		log(creditReport.getHousingLoanSeriousOverdue());
		log(creditReport.getHousingLoanGuarantee());
		log(creditReport.getOtherLoanTotal());
		log(creditReport.getOtherLoanActive());
		log(creditReport.getOtherLoanOverdue());
		log(creditReport.getOtherLoanSeriousOverdue());
		log(creditReport.getOtherLoanGuarantee());
		log(creditReport.getCreateTime());
		log(creditReport.getCreatorId());
		log(creditReport.getModifyTime());
		log(creditReport.getModifierId());
		log(creditReport.getCustomerIdCard());
		log(creditReport.getErrorMsg());
		log(creditReport.getCustomerName());
		log(creditReport.getAssetTotal());
		log(creditReport.getRepaymentTotal());
		log(creditReport.getAppNo());
	    
	}
	@Test
	public void testQueryReportInfoVO(){
		ReportInfoVIEW creditReportVO=creditReportDAO.queryReportInfoVIEWById(100031l);
		log(creditReportVO.getClass());
		log(creditReportVO.getName());
		log(creditReportVO.getCertType());
		log(creditReportVO.getCertNo());
	}
	@Test
	public void testQueryCreditReportVO(){
		CreditReportVIEW creditReportVO=creditReportDAO.queryCreditReportVIEWById(100031l);
		log(creditReportVO.getClass());
		log(creditReportVO.getName());
		log(creditReportVO.getCertType());
		log(creditReportVO.getCertNo());
	}
	@Test
	public void testUpdateCreditReport(){
		CreditReport creditReport=creditReportDAO.queryById(100029l);
		log(creditReport.getName());
		
		creditReport.setName("testk8798");
		creditReportDAO.save(creditReport);
	}
	@Test
//	@Rollback(false)
	public void testInsertCreditReport(){
		CreditReport creditReport=creditReportDAO.queryById(100031l);
		CreditReport newCreditReport=new CreditReport();
		BeanUtils.copyProperties(creditReport, newCreditReport,"id");
		log(newCreditReport.getId());
		log(newCreditReport.getName());
		log(newCreditReport.getCertType());
		log(newCreditReport.getCertNo());
		creditReportDAO.save(newCreditReport);
		log(newCreditReport.getId());
	}
	@Test
	public void testInsertCreditRecord(){
		CreditRecord creditRecord=creditRecordDAO.findOne(100176l);
		log(creditRecord.getReportId());
		log(creditRecord.getType());
		log(creditRecord.getContent());
		log(creditRecord.getRecordNum());
		CreditRecord newCreditRecord=new CreditRecord();
		BeanUtils.copyProperties(creditRecord, newCreditRecord,"id");
		creditRecordDAO.save(newCreditRecord);
		log(newCreditRecord.getId());
	}
	@Test
	public void testInsertCredit(){
		testInsertCreditReport();
		testInsertCreditRecord();
	}
	@Test
//	@Rollback(false)
	public void testDeleteCreditReport(){
		creditReportDAO.delete(101830l);
	}
	@Test
	public void testNativeQuery(){
		String sql ="select id,NAME,CERT_TYPE,CERT_NO from T_PBCCRC_REPORT where id in(:ids)";
		Query query = em.createNativeQuery(sql);
		query.unwrap(SQLQuery.class).setResultTransformer(new ReflectTransformer(CreditReportVIEW.class));
		List<Long> ids=new ArrayList<Long>();
		ids.add(100031l);
		query.setParameter("ids", ids);
		CreditReportVIEW creditReportVIEW = (CreditReportVIEW) query.getSingleResult();
		log(creditReportVIEW.getName());
		log(creditReportVIEW.getCertType());
		log(creditReportVIEW.getCertNo());
		log("--------------");
		ids.add(100030l);
//		query.setParameter("id", 100030l);
		@SuppressWarnings("unchecked")
		List<CreditReportVIEW> creditReportVOs= query.getResultList();
		for(CreditReportVIEW creditReportItem:creditReportVOs){
			log(creditReportItem.getName());
			log(creditReportItem.getCertType());
			log(creditReportItem.getCertNo());
		}
	}
	private void log(Object msg){
		System.out.println(msg);
	}
}
