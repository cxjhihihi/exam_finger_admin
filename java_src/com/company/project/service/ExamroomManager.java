/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.company.project.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

@Service
@Transactional
public class ExamroomManager extends BaseManager<Examroom,java.lang.Integer>{

	private ExamroomDao examroomDao;
	/**增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	public void setExamroomDao(ExamroomDao dao) {
		this.examroomDao = dao;
	}
	public EntityDao getEntityDao() {
		return this.examroomDao;
	}
	
	@Transactional(readOnly=true)
	public Page findPage(ExamroomQuery query) {
		return examroomDao.findPage(query);
	}
	
	public List<Examroom> findAll(){
		return examroomDao.findAll();
	}
	
}
