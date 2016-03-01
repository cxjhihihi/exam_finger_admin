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
@Table(name = "exam")
public class Exam extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Exam";
	public static final String ALIAS_EXAMID = "examid";
	public static final String ALIAS_EXAMNAME = "examname";
	public static final String ALIAS_MEMO = "memo";
	
	//date formats
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * examid       db_column: examid 
     */ 	
	
	private java.lang.Integer examid;
    /**
     * examname       db_column: examname 
     */ 	
	@Length(max=255)
	private java.lang.String examname;
    /**
     * memo       db_column: memo 
     */ 	
	@Length(max=255)
	private java.lang.String memo;
	//columns END


	public Exam(){
	}

	public Exam(
		java.lang.Integer examid
	){
		this.examid = examid;
	}

	

	public void setExamid(java.lang.Integer value) {
		this.examid = value;
	}
	
	@Id @GeneratedValue(generator="custom-id")
	@GenericGenerator(name="custom-id", strategy = "increment")
	@Column(name = "examid", unique = true, nullable = false, insertable = true, updatable = true, length = 10)
	public java.lang.Integer getExamid() {
		return this.examid;
	}
	
	@Column(name = "examname", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getExamname() {
		return this.examname;
	}
	
	public void setExamname(java.lang.String value) {
		this.examname = value;
	}
	
	@Column(name = "memo", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
	public java.lang.String getMemo() {
		return this.memo;
	}
	
	public void setMemo(java.lang.String value) {
		this.memo = value;
	}
	

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Examid",getExamid())
			.append("Examname",getExamname())
			.append("Memo",getMemo())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getExamid())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Exam == false) return false;
		if(this == obj) return true;
		Exam other = (Exam)obj;
		return new EqualsBuilder()
			.append(getExamid(),other.getExamid())
			.isEquals();
	}
}

