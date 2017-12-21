package com.zdmoney.credit.domain.pbccrc;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.zdmoney.credit.domain.AbstractEntity;

@Entity
@Table(name="T_PBCCRC_CREDIT_RECORD")
@SequenceGenerator(name="PK_SEQUENCE",sequenceName="SEQ_PBCCRC_CREDIT_RECORD",initialValue=1,allocationSize=1)
public class CreditRecord extends AbstractEntity {
	private Long reportId;
	private String type;
	private String content;
	private Integer recordNum;
	public Long getReportId() {
		return reportId;
	}
	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getRecordNum() {
		return recordNum;
	}
	public void setRecordNum(Integer recordNum) {
		this.recordNum = recordNum;
	}
	
}
