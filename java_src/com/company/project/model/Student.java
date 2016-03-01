/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.company.project.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;

import javacommon.base.*;
import javacommon.util.*;

import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.company.project.model.*;
import com.company.project.dao.*;
import com.company.project.service.*;
import com.company.project.vo.query.*;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


@Entity
@Table(name = "student")
public class Student extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Student";
	public static final String ALIAS_STUID = "stuid";
	public static final String ALIAS_USERNAME = "username";
	public static final String ALIAS_PASSWORD = "password";
	public static final String ALIAS_CARDNUM = "cardnum";
	public static final String ALIAS_MOBILE = "mobile";
	public static final String ALIAS_ADDRESS = "address";
	public static final String ALIAS_FINGERNUM = "fingernum";
	public static final String ALIAS_GRADE = "grade";
	public static final String ALIAS_CLASS_NO = "classNo";
	
	//date formats
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * stuid       db_column: stuid 
     */ 	
	
	private java.lang.Integer stuid;
    /**
     * username       db_column: username 
     */ 	
	@Length(max=255)
	private java.lang.String username;
    /**
     * password       db_column: password 
     */ 	
	@Length(max=255)
	private java.lang.String password;
    /**
     * cardnum       db_column: cardnum 
     */ 	
	@Length(max=255)
	private java.lang.String cardnum;
    /**
     * mobile       db_column: mobile 
     */ 	
	@Length(max=255)
	private java.lang.String mobile;
    /**
     * address       db_column: address 
     */ 	
	@Length(max=255)
	private java.lang.String address;
    /**
     * fingernum       db_column: fingernum 
     */ 	
	@Length(max=255)
	private java.lang.String fingernum;
    /**
     * grade       db_column: grade 
     */ 	
	
	private java.lang.Integer grade;
    /**
     * classNo       db_column: class_no 
     */ 	
	@Length(max=255)
	private java.lang.String classNo;
	//columns END


	public Student(){
	}

	public Student(
		java.lang.Integer stuid
	){
		this.stuid = stuid;
	}

	

	public void setStuid(java.lang.Integer value) {
		this.stuid = value;
	}
	
	@Id @GeneratedValue(generator="custom-id")
	@GenericGenerator(name="custom-id", strategy = "increment")
	@Column(name = "stuid", unique = true, nullable = false, insertable = true, updatable = true, length = 10)
	public java.lang.Integer getStuid() {
		return this.stuid;
	}
	
	@Column(name = "username", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getUsername() {
		return this.username;
	}
	
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	@Column(name = "password", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getPassword() {
		return this.password;
	}
	
	public void setPassword(java.lang.String value) {
		this.password = value;
	}
	
	@Column(name = "cardnum", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getCardnum() {
		return this.cardnum;
	}
	
	public void setCardnum(java.lang.String value) {
		this.cardnum = value;
	}
	
	@Column(name = "mobile", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getMobile() {
		return this.mobile;
	}
	
	public void setMobile(java.lang.String value) {
		this.mobile = value;
	}
	
	@Column(name = "address", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getAddress() {
		return this.address;
	}
	
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	@Column(name = "fingernum", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getFingernum() {
		return this.fingernum;
	}
	
	public void setFingernum(java.lang.String value) {
		this.fingernum = value;
	}
	
	@Column(name = "grade", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public java.lang.Integer getGrade() {
		return this.grade;
	}
	
	public void setGrade(java.lang.Integer value) {
		this.grade = value;
	}
	
	@Column(name = "class_no", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getClassNo() {
		return this.classNo;
	}
	
	public void setClassNo(java.lang.String value) {
		this.classNo = value;
	}
	

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Stuid",getStuid())
			.append("Username",getUsername())
			.append("Password",getPassword())
			.append("Cardnum",getCardnum())
			.append("Mobile",getMobile())
			.append("Address",getAddress())
			.append("Fingernum",getFingernum())
			.append("Grade",getGrade())
			.append("ClassNo",getClassNo())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getStuid())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student == false) return false;
		if(this == obj) return true;
		Student other = (Student)obj;
		return new EqualsBuilder()
			.append(getStuid(),other.getStuid())
			.isEquals();
	}
}

