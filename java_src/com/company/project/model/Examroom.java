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
@Table(name = "examroom")
public class Examroom extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Examroom";
	public static final String ALIAS_EXAMROOMID = "examroomid";
	public static final String ALIAS_ROOMADDRESS = "roomaddress";
	public static final String ALIAS_IS_USED_TIME = "isUsedTime";
	public static final String ALIAS_ROOM_NUM="roomNUM";
	
	//date formats
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * examroomid       db_column: examroomid 
     */ 	
	
	private java.lang.Integer examroomid;
    /**
     * roomaddress       db_column: roomaddress 
     */ 	
	@Length(max=255)
	private java.lang.String roomaddress;
    /**
     * isUsedTime       db_column: is_used_time 
     */ 	
	@Length(max=255)
	private java.lang.String isUsedTime;
	//columns END
	@Length(max=11)
	private java.lang.Integer roomNum;

	public Examroom(){
	}

	public Examroom(
		java.lang.Integer examroomid
	){
		this.examroomid = examroomid;
	}

	

	public void setExamroomid(java.lang.Integer value) {
		this.examroomid = value;
	}
	
	@Id @GeneratedValue(generator="custom-id")
	@GenericGenerator(name="custom-id", strategy = "increment")
	@Column(name = "examroomid", unique = true, nullable = false, insertable = true, updatable = true, length = 10)
	public java.lang.Integer getExamroomid() {
		return this.examroomid;
	}
	
	@Column(name = "roomaddress", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getRoomaddress() {
		return this.roomaddress;
	}
	
	public void setRoomaddress(java.lang.String value) {
		this.roomaddress = value;
	}
	
	@Column(name = "is_used_time", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getIsUsedTime() {
		return this.isUsedTime;
	}
	
	public void setIsUsedTime(java.lang.String value) {
		this.isUsedTime = value;
	}
	/**
	 * @return the roomNum
	 */
	@Column(name = "room_num", unique = false, nullable = true, insertable = true, updatable = true, length = 11)
	public java.lang.Integer getRoomNum() {
		return roomNum;
	}
	/**
	 * @param roomNum the roomNum to set
	 */
	public void setRoomNum(java.lang.Integer roomNum) {
		this.roomNum = roomNum;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Examroomid",getExamroomid())
			.append("Roomaddress",getRoomaddress())
			.append("IsUsedTime",getIsUsedTime())
			.append("RoomNum",getRoomNum())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getExamroomid())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Examroom == false) return false;
		if(this == obj) return true;
		Examroom other = (Examroom)obj;
		return new EqualsBuilder()
			.append(getExamroomid(),other.getExamroomid())
			.isEquals();
	}
}

