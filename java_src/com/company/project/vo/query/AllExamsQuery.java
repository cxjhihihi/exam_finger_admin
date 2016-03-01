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


public class AllExamsQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** examrommid */
	private java.lang.Integer examrommid;
	/** examid */
	private java.lang.Integer examid;
	/** stuid */
	private java.lang.Integer stuid;
	/** score */
	private java.lang.Float score;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getExamrommid() {
		return this.examrommid;
	}
	
	public void setExamrommid(java.lang.Integer value) {
		this.examrommid = value;
	}
	
	public java.lang.Integer getExamid() {
		return this.examid;
	}
	
	public void setExamid(java.lang.Integer value) {
		this.examid = value;
	}
	
	public java.lang.Integer getStuid() {
		return this.stuid;
	}
	
	public void setStuid(java.lang.Integer value) {
		this.stuid = value;
	}
	
	public java.lang.Float getScore() {
		return this.score;
	}
	
	public void setScore(java.lang.Float value) {
		this.score = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

