package com.nt.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="H02_MAN")
public class Man {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	private String name;
	
	/*@OneToOne
	private Sleeper sleep;*/
	
	/*	@OneToMany(mappedBy = "man")
		private List<Sleeper> list;*/
	
	@ManyToMany
	private List<Sleeper> sleeperList;
	

	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Sleeper> getList() {
		return sleeperList;
	}
	public void setList(List<Sleeper> list) {
		this.sleeperList = list;
	}


	
	

}
