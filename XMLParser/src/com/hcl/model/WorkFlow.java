package com.hcl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CI_ETL_TL_OBJ")
public class WorkFlow implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CI_ETL_OBJ_ID")
	private int Id;
	
	@Column(name = "CI_DESC")
	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
