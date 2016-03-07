/**
 * 
 */
package javacommon.filter;

import java.io.IOException;

import javacommon.util.Utils;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;

/** 
 * 
 *@ClassName: LoginFilter 
 *
 *@描述:
 *
 *@author hzcaixinjia
 * 
 *@date 2016-3-3 
 * 
 */

public class LoginFilter implements Filter{

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(HttpServletRequest request, HttpServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		HttpSession session =request.getSession();
		String loginUser=(String) request.getAttribute("loginUser");
		if(StringUtils.isEmpty(loginUser)){
			JSONObject jv = new JSONObject();
			jv.put("message", "not_login");
			Utils.writeBack(request, response, jv);
			return;
		}
		filterChain.doFilter(request, response);
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		doFilter((HttpServletRequest)arg0,(HttpServletResponse) arg1, arg2);
		
	}

}
