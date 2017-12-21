package com.zdmoney.credit.domain.view;


public class CreditReportVIEW {
	private String name;//解析得到的姓名，非关联客户姓名
    private String certType;//证件类型
    private String certNo;//证件号码
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
}
