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
public class AllExamsDao extends BaseHibernateDao<AllExams,java.lang.Integer>{

	public Class getEntityClass() {
		return AllExams.class;
	}
	
	public Page findPage(AllExamsQuery query) {
        //XsqlBuilder syntax,please see http://code.google.com/p/rapid-xsqlbuilder
        // [column]为字符串拼接, {column}为使用占位符. [column]为使用字符串拼接,如username='[username]',偷懒时可以使用字符串拼接 
        // [column] 为PageRequest的属性
		String sql = "select t from AllExams t where 1=1 "
			  	+ "/~ and t.examrommid = {examrommid} ~/"
			  	+ "/~ and t.examid = {examid} ~/"
			  	+ "/~ and t.stuid = {stuid} ~/"
			  	+ "/~ and t.score = {score} ~/"
				+ "/~ order by [sortColumns] ~/";

        //生成sql2的原因是为了不喜欢使用xsqlbuilder的同学，请修改生成器模板，删除本段的生成
        StringBuilder sql2 = new StringBuilder("select t from AllExams t where 1=1 ");
        if(isNotEmpty(query.getId())) {
            sql2.append(" and  t.id = :id ");
        }
        if(isNotEmpty(query.getExamrommid())) {
            sql2.append(" and  t.examrommid = :examrommid ");
        }
        if(isNotEmpty(query.getExamid())) {
            sql2.append(" and  t.examid = :examid ");
        }
        if(isNotEmpty(query.getStuid())) {
            sql2.append(" and  t.stuid = :stuid ");
        }
        if(isNotEmpty(query.getScore())) {
            sql2.append(" and  t.score = :score ");
        }
        if(isNotEmpty(query.getSortColumns())) {
            sql2.append(" order by :sortColumns ");
        }	
        
		return pageQuery(sql,query);
	}
	

}
