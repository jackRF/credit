package com.zdmoney.credit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.zdmoney.credit.domain.pbccrc.CreditReport;
import com.zdmoney.credit.domain.view.CreditReportVIEW;
import com.zdmoney.credit.domain.view.ReportInfoVIEW;
public interface CreditReportRepository extends  JpaRepository<CreditReport,Long>,JpaSpecificationExecutor<CreditReport>{
	@Query("select r from CreditReport r where r.id=?1")
	CreditReport queryById(Long id);
	
	@Query("select r.name as name,r.certType as certType ,r.certNo as certNo from CreditReport r where r.id=?1")
//	@Query("select name,certType ,certNo from CreditReport r where r.id=?1")
	ReportInfoVIEW queryReportInfoVIEWById(Long id);
	@Query("select r.name as name,r.certType as certType ,r.certNo as certNo from CreditReport r where r.id=?1")
	CreditReportVIEW queryCreditReportVIEWById(Long id);
}
