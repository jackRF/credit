package com.zdmoney.credit.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zdmoney.credit.dao.CreditRecordRepository;
import com.zdmoney.credit.dao.CreditReportRepository;
import com.zdmoney.credit.domain.pbccrc.CreditReport;
import com.zdmoney.credit.service.CreditReportService;
@Transactional
@Service
public class CreditReportServiceImpl implements CreditReportService {
	
	@Autowired
	private CreditRecordRepository creditRecordRepository;
	@Autowired
	private CreditReportRepository creditReportRepository;
	
	@Override
	public CreditReport queryById(Long id) {
		return creditReportRepository.queryById(id);
	}
}
