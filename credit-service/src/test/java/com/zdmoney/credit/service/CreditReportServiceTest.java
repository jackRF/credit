package com.zdmoney.credit.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.zdmoney.credit.domain.pbccrc.CreditReport;
import com.zdmoney.credit.service.CreditReportService;

@RunWith(SpringRunner.class)
@TestPropertySource("classpath:application-test.properties")
@EntityScan({"com.zdmoney.credit.domain"})
@ComponentScan("com.zdmoney.credit")
@EnableJpaRepositories(basePackages = "com.zdmoney.credit.dao")
@SpringBootApplication
@Transactional
@Ignore
public class CreditReportServiceTest {
	
	@Autowired
	private CreditReportService creditReportService;
	@Test
	public void testQueryById() {
		CreditReport creditReport=creditReportService.queryById(100031l);
		if(creditReport==null){
			return ;
		}
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
	private void log(Object msg){
		System.out.println(msg);
	}
}
