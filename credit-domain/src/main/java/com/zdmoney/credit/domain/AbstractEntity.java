package com.zdmoney.credit.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PK_SEQUENCE")
	private Long id;//主键id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
