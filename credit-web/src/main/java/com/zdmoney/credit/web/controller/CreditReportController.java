package com.zdmoney.credit.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zdmoney.credit.domain.pbccrc.CreditReport;
import com.zdmoney.credit.service.CreditReportService;

@RestController
@RequestMapping("/creditReport")
public class CreditReportController {
	@Autowired
	private CreditReportService creditReportService;
	
	@RequestMapping("queryInfo.json")
	public CreditReport queryInfo(long reportId) {
		return creditReportService.queryById(reportId);
	}
}
