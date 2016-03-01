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
@Table(name = "all_exams")
public class AllExams extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "AllExams";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_EXAMROMMID = "examrommid";
	public static final String ALIAS_EXAMID = "examid";
	public static final String ALIAS_STUID = "stuid";
	public static final String ALIAS_SCORE = "score";
	
	//date formats
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */ 	
	
	private java.lang.Integer id;
    /**
     * examrommid       db_column: examrommid 
     */ 	
	
	private java.lang.Integer examrommid;
    /**
     * examid       db_column: examid 
     */ 	
	
	private java.lang.Integer examid;
    /**
     * stuid       db_column: stuid 
     */ 	
	
	private java.lang.Integer stuid;
    /**
     * score       db_column: score 
     */ 	
	
	private java.lang.Float score;
	//columns END


	public AllExams(){
	}

	public AllExams(
		java.lang.Integer id
	){
		this.id = id;
	}

	

	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	@Id @GeneratedValue(generator="custom-id")
	@GenericGenerator(name="custom-id", strategy = "increment")
	@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true, length = 10)
	public java.lang.Integer getId() {
		return this.id;
	}
	
	@Column(name = "examrommid", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public java.lang.Integer getExamrommid() {
		return this.examrommid;
	}
	
	public void setExamrommid(java.lang.Integer value) {
		this.examrommid = value;
	}
	
	@Column(name = "examid", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public java.lang.Integer getExamid() {
		return this.examid;
	}
	
	public void setExamid(java.lang.Integer value) {
		this.examid = value;
	}
	
	@Column(name = "stuid", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public java.lang.Integer getStuid() {
		return this.stuid;
	}
	
	public void setStuid(java.lang.Integer value) {
		this.stuid = value;
	}
	
	@Column(name = "score", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
	public java.lang.Float getScore() {
		return this.score;
	}
	
	public void setScore(java.lang.Float value) {
		this.score = value;
	}
	

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Examrommid",getExamrommid())
			.append("Examid",getExamid())
			.append("Stuid",getStuid())
			.append("Score",getScore())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof AllExams == false) return false;
		if(this == obj) return true;
		AllExams other = (AllExams)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

