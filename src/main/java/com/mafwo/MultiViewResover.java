package com.mafwo;

import java.util.Locale;
import java.util.Map;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;


/**
 * 
 * Project Name:祥云
 * ClassName:MultiViewResover 
 * Function: TODO 
 * date: 2015年1月29日 下午4:46:48 
 * @author: zp(zhoupeng@gaiay.cn)
 * @version :v1.0
 */
public class MultiViewResover implements ViewResolver {
	//private static Logger log = LoggerFactory.getLogger(MultiViewResover.class);
	
	private Map<String,ViewResolver> resolvers;
	
	public View resolveViewName(String viewName, Locale locale)
			throws Exception {
		// viewName(modelAndView中的名字)看其有没有下划线  
		int n = viewName.lastIndexOf(".");
		String suffix = ""; 
		// 没有默认使用jsp方式 解析,有的话截取下划线后面的字符串 这里一般是jsp,ftl与配置文件中的<entry key="ftl">的key匹配
		if (n == (-1)) {  
            suffix = "jsp";
        }else{
        	suffix = viewName.substring(n + 1); 
        	// 取下划线前面的部分 那时真正的资源名.比如我们要使用hello.jsp 那viewName就应该是hello_jsp  
            viewName = viewName.substring(0, n);  
        } 
		
		// 根据下划线后面的字符串去获取托管的视图解析类对象  
        ViewResolver resolver = resolvers.get(suffix);  
        if (resolver != null) {  
            return resolver.resolveViewName(viewName, locale);  
        }else {  
            return null;  
        }  
	}

	public Map<String, ViewResolver> getResolvers() {
		return resolvers;
	}

	public void setResolvers(Map<String, ViewResolver> resolvers) {
		this.resolvers = resolvers;
	}
}