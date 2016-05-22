package com.hp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stp_rule_dtl")
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int rule_Id;
	private String rule_type;
	
	@Id
	@Column(name = "rd_id")
	public int getRule_Id() {
		return rule_Id;
	}
	
	public void setRule_Id(int rule_Id) {
		this.rule_Id = rule_Id;
	}
	
	@Column(name = "rd_calc_rule_type")
	public String getRule_type() {
		return rule_type;
	}
	
	public void setRule_type(String rule_type) {
		this.rule_type = rule_type;
	}
		
}
