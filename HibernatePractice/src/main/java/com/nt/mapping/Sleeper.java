package com.nt.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="H02_SLEEPER")
public class Sleeper {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String clr;
	
	/*	@OneToOne(mappedBy = "sleep")
		private Man man;*/
	
	/*@ManyToOne
	private Man man;*/
	
	@ManyToMany(mappedBy = "sleeperList")
	private List<Man> manList;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getClr() {
		return clr;
	}
	public void setClr(String clr) {
		this.clr = clr;
	}
	public List<Man> getList() {
		return manList;
	}
	public void setList(List<Man> list) {
		this.manList = list;
	}
	
	
	
	
	

}
