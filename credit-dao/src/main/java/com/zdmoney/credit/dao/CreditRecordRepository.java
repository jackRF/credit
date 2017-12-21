package com.zdmoney.credit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zdmoney.credit.domain.pbccrc.CreditRecord;
public interface CreditRecordRepository extends JpaRepository<CreditRecord,Long>  {
	
}
