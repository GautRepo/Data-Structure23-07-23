package com.nt.pojo;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name="H01_HIBERNATE")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class HibernatePrac {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hid;
	@Column(name="H01_COUNT")
	private Long hcount;
	
	private Name name;
	
	@Temporal(TemporalType.DATE)
	private Date hdate;
	
	@Transient
	private int x;
	
	@Lob
	private byte[] image;

	

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public Long getHcount() {
		return hcount;
	}

	public void setHcount(Long hcount) {
		this.hcount = hcount;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Date getDate() {
		return hdate;
	}

	public void setDate(Date date) {
		this.hdate = date;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "HibernatePrac [hid=" + hid + ", hcount=" + hcount + ", name=" + name + ", hdate=" + hdate + ", x=" + x
				+ ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
	
	
	

}
