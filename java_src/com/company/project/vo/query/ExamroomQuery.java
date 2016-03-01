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


public class ExamroomQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** examroomid */
	private java.lang.Integer examroomid;
	/** roomaddress */
	private java.lang.String roomaddress;
	/** isUsedTime */
	private java.lang.String isUsedTime;
	private java.lang.Integer roomNum;

	public java.lang.Integer getExamroomid() {
		return this.examroomid;
	}
	
	public void setExamroomid(java.lang.Integer value) {
		this.examroomid = value;
	}
	
	public java.lang.String getRoomaddress() {
		return this.roomaddress;
	}
	
	public void setRoomaddress(java.lang.String value) {
		this.roomaddress = value;
	}
	/**
	 * @return the roomNum
	 */
	public java.lang.Integer getRoomNum() {
		return roomNum;
	}
	/**
	 * @param roomNum the roomNum to set
	 */
	public void setRoomNum(java.lang.Integer roomNum) {
		this.roomNum = roomNum;
	}
	public java.lang.String getIsUsedTime() {
		return this.isUsedTime;
	}
	
	public void setIsUsedTime(java.lang.String value) {
		this.isUsedTime = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

