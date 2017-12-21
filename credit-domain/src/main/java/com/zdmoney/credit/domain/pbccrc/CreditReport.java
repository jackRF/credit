package com.zdmoney.credit.domain.pbccrc;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.zdmoney.credit.domain.AbstractEntity;

@Entity
@Table(name="T_PBCCRC_REPORT")
@SequenceGenerator(name="PK_SEQUENCE",sequenceName="SEQ_PBCCRC_REPORT",initialValue=1,allocationSize=1)
public class CreditReport extends AbstractEntity{
	
	private String name;//解析得到的姓名，非关联客户姓名
    private String certType;//证件类型
    private String certNo;//证件号码
    private Date queryTime;//查询时间
    private Date reportTime;//报告时间
    private String maritalStatus;//婚姻状况
    private String reportNo;//报告编号
    private String description;//说明
    private String creditRecordDescription;//信贷记录说明
    private String queryRecordDescription;//查询记录说明
    private String commonRecordDescription;//公共记录说明
    private String commonRecordDetail;//公共记录详细内容
    private String creditRecordSummary;//信贷记录信息概要
    private Integer creditCardTotal;//信用卡-账户数
    private Integer creditCardActive;//信用卡-未结清/未销户账户数
    private Integer creditCardOverdue;//信用卡-发生过逾期的账户数
    private Integer creditCardSeriousOverdue;//信用卡-发生过90天以上逾期的账户数
    private Integer creditCardGuarantee;//信用卡-为他人担保笔数
    private Integer housingLoanTotal;//购房贷款-账户数
    private Integer housingLoanActive;//购房贷款-未结清/未销户账户数
    private Integer housingLoanOverdue;//购房贷款-发生过逾期的账户数
    private Integer housingLoanSeriousOverdue;//购房贷款-发生过90天以上逾期的账户数
    private Integer housingLoanGuarantee;//购房贷款-为他人担保笔数
    private Integer otherLoanTotal;//其他贷款-账户数
    private Integer otherLoanActive;//其他贷款-未结清/未销户账户数
    private Integer otherLoanOverdue;//其他贷款-发生过逾期的账户数
    private Integer otherLoanSeriousOverdue;//其他贷款-发生过90天以上逾期的账户数
    private Integer otherLoanGuarantee;//其他贷款-为他人担保笔数
    private Date createTime;//创建时间
    private String creatorId;//创建者工号
    private Date modifyTime;//修改时间
    private String modifierId;//修改者工号
    private String customerIdCard;//关联客户身份证号
    private String errorMsg;//解析出错信息
    private String customerName;//关联客户姓名
    private Integer assetTotal;//资产处置信息数量
    private Integer repaymentTotal;//保证人代偿信息数量
	private String appNo;//征审系统申请件编号
	
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

	public Date getQueryTime() {
		return queryTime;
	}

	public void setQueryTime(Date queryTime) {
		this.queryTime = queryTime;
	}

	public Date getReportTime() {
		return reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreditRecordDescription() {
		return creditRecordDescription;
	}

	public void setCreditRecordDescription(String creditRecordDescription) {
		this.creditRecordDescription = creditRecordDescription;
	}

	public String getQueryRecordDescription() {
		return queryRecordDescription;
	}

	public void setQueryRecordDescription(String queryRecordDescription) {
		this.queryRecordDescription = queryRecordDescription;
	}

	public String getCommonRecordDescription() {
		return commonRecordDescription;
	}

	public void setCommonRecordDescription(String commonRecordDescription) {
		this.commonRecordDescription = commonRecordDescription;
	}

	public String getCommonRecordDetail() {
		return commonRecordDetail;
	}

	public void setCommonRecordDetail(String commonRecordDetail) {
		this.commonRecordDetail = commonRecordDetail;
	}

	public String getCreditRecordSummary() {
		return creditRecordSummary;
	}

	public void setCreditRecordSummary(String creditRecordSummary) {
		this.creditRecordSummary = creditRecordSummary;
	}

	public Integer getCreditCardTotal() {
		return creditCardTotal;
	}

	public void setCreditCardTotal(Integer creditCardTotal) {
		this.creditCardTotal = creditCardTotal;
	}

	public Integer getCreditCardActive() {
		return creditCardActive;
	}

	public void setCreditCardActive(Integer creditCardActive) {
		this.creditCardActive = creditCardActive;
	}

	public Integer getCreditCardOverdue() {
		return creditCardOverdue;
	}

	public void setCreditCardOverdue(Integer creditCardOverdue) {
		this.creditCardOverdue = creditCardOverdue;
	}

	public Integer getCreditCardSeriousOverdue() {
		return creditCardSeriousOverdue;
	}

	public void setCreditCardSeriousOverdue(Integer creditCardSeriousOverdue) {
		this.creditCardSeriousOverdue = creditCardSeriousOverdue;
	}

	public Integer getCreditCardGuarantee() {
		return creditCardGuarantee;
	}

	public void setCreditCardGuarantee(Integer creditCardGuarantee) {
		this.creditCardGuarantee = creditCardGuarantee;
	}

	public Integer getHousingLoanTotal() {
		return housingLoanTotal;
	}

	public void setHousingLoanTotal(Integer housingLoanTotal) {
		this.housingLoanTotal = housingLoanTotal;
	}

	public Integer getHousingLoanActive() {
		return housingLoanActive;
	}

	public void setHousingLoanActive(Integer housingLoanActive) {
		this.housingLoanActive = housingLoanActive;
	}

	public Integer getHousingLoanOverdue() {
		return housingLoanOverdue;
	}

	public void setHousingLoanOverdue(Integer housingLoanOverdue) {
		this.housingLoanOverdue = housingLoanOverdue;
	}

	public Integer getHousingLoanSeriousOverdue() {
		return housingLoanSeriousOverdue;
	}

	public void setHousingLoanSeriousOverdue(Integer housingLoanSeriousOverdue) {
		this.housingLoanSeriousOverdue = housingLoanSeriousOverdue;
	}

	public Integer getHousingLoanGuarantee() {
		return housingLoanGuarantee;
	}

	public void setHousingLoanGuarantee(Integer housingLoanGuarantee) {
		this.housingLoanGuarantee = housingLoanGuarantee;
	}

	public Integer getOtherLoanTotal() {
		return otherLoanTotal;
	}

	public void setOtherLoanTotal(Integer otherLoanTotal) {
		this.otherLoanTotal = otherLoanTotal;
	}

	public Integer getOtherLoanActive() {
		return otherLoanActive;
	}

	public void setOtherLoanActive(Integer otherLoanActive) {
		this.otherLoanActive = otherLoanActive;
	}

	public Integer getOtherLoanOverdue() {
		return otherLoanOverdue;
	}

	public void setOtherLoanOverdue(Integer otherLoanOverdue) {
		this.otherLoanOverdue = otherLoanOverdue;
	}

	public Integer getOtherLoanSeriousOverdue() {
		return otherLoanSeriousOverdue;
	}

	public void setOtherLoanSeriousOverdue(Integer otherLoanSeriousOverdue) {
		this.otherLoanSeriousOverdue = otherLoanSeriousOverdue;
	}

	public Integer getOtherLoanGuarantee() {
		return otherLoanGuarantee;
	}

	public void setOtherLoanGuarantee(Integer otherLoanGuarantee) {
		this.otherLoanGuarantee = otherLoanGuarantee;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifierId() {
		return modifierId;
	}

	public void setModifierId(String modifierId) {
		this.modifierId = modifierId;
	}

	public String getCustomerIdCard() {
		return customerIdCard;
	}

	public void setCustomerIdCard(String customerIdCard) {
		this.customerIdCard = customerIdCard;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getAssetTotal() {
		return assetTotal;
	}

	public void setAssetTotal(Integer assetTotal) {
		this.assetTotal = assetTotal;
	}

	public Integer getRepaymentTotal() {
		return repaymentTotal;
	}

	public void setRepaymentTotal(Integer repaymentTotal) {
		this.repaymentTotal = repaymentTotal;
	}

	public String getAppNo() {
		return appNo;
	}

	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}
    
}
