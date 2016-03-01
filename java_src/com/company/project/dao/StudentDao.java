/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.company.project.dao;

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


import static cn.org.rapid_framework.util.ObjectUtils.*;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao extends BaseHibernateDao<Student,java.lang.Integer>{

	public Class getEntityClass() {
		return Student.class;
	}
	
	public Page findPage(StudentQuery query) {
        //XsqlBuilder syntax,please see http://code.google.com/p/rapid-xsqlbuilder
        // [column]为字符串拼接, {column}为使用占位符. [column]为使用字符串拼接,如username='[username]',偷懒时可以使用字符串拼接 
        // [column] 为PageRequest的属性
		String sql = "select t from Student t where 1=1 "
			  	+ "/~ and t.username = {username} ~/"
			  	+ "/~ and t.password = {password} ~/"
			  	+ "/~ and t.cardnum = {cardnum} ~/"
			  	+ "/~ and t.mobile = {mobile} ~/"
			  	+ "/~ and t.address = {address} ~/"
			  	+ "/~ and t.fingernum = {fingernum} ~/"
			  	+ "/~ and t.grade = {grade} ~/"
			  	+ "/~ and t.classNo = {classNo} ~/"
				+ "/~ order by [sortColumns] ~/";

        //生成sql2的原因是为了不喜欢使用xsqlbuilder的同学，请修改生成器模板，删除本段的生成
        StringBuilder sql2 = new StringBuilder("select t from Student t where 1=1 ");
        if(isNotEmpty(query.getStuid())) {
            sql2.append(" and  t.stuid = :stuid ");
        }
        if(isNotEmpty(query.getUsername())) {
            sql2.append(" and  t.username = :username ");
        }
        if(isNotEmpty(query.getPassword())) {
            sql2.append(" and  t.password = :password ");
        }
        if(isNotEmpty(query.getCardnum())) {
            sql2.append(" and  t.cardnum = :cardnum ");
        }
        if(isNotEmpty(query.getMobile())) {
            sql2.append(" and  t.mobile = :mobile ");
        }
        if(isNotEmpty(query.getAddress())) {
            sql2.append(" and  t.address = :address ");
        }
        if(isNotEmpty(query.getFingernum())) {
            sql2.append(" and  t.fingernum = :fingernum ");
        }
        if(isNotEmpty(query.getGrade())) {
            sql2.append(" and  t.grade = :grade ");
        }
        if(isNotEmpty(query.getClassNo())) {
            sql2.append(" and  t.classNo = :classNo ");
        }
        if(isNotEmpty(query.getSortColumns())) {
            sql2.append(" order by :sortColumns ");
        }	
        
		return pageQuery(sql,query);
	}
	

}
