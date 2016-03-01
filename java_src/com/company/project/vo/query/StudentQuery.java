/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.company.project.vo.query;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

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


public class StudentQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** stuid */
	private java.lang.Integer stuid;
	/** username */
	private java.lang.String username;
	/** password */
	private java.lang.String password;
	/** cardnum */
	private java.lang.String cardnum;
	/** mobile */
	private java.lang.String mobile;
	/** address */
	private java.lang.String address;
	/** fingernum */
	private java.lang.String fingernum;
	/** grade */
	private java.lang.Integer grade;
	/** classNo */
	private java.lang.String classNo;

	public java.lang.Integer getStuid() {
		return this.stuid;
	}
	
	public void setStuid(java.lang.Integer value) {
		this.stuid = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getPassword() {
		return this.password;
	}
	
	public void setPassword(java.lang.String value) {
		this.password = value;
	}
	
	public java.lang.String getCardnum() {
		return this.cardnum;
	}
	
	public void setCardnum(java.lang.String value) {
		this.cardnum = value;
	}
	
	public java.lang.String getMobile() {
		return this.mobile;
	}
	
	public void setMobile(java.lang.String value) {
		this.mobile = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
	
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getFingernum() {
		return this.fingernum;
	}
	
	public void setFingernum(java.lang.String value) {
		this.fingernum = value;
	}
	
	public java.lang.Integer getGrade() {
		return this.grade;
	}
	
	public void setGrade(java.lang.Integer value) {
		this.grade = value;
	}
	
	public java.lang.String getClassNo() {
		return this.classNo;
	}
	
	public void setClassNo(java.lang.String value) {
		this.classNo = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

