package org.smart4j.framework.helper;

import java.util.HashMap;
import java.util.Map;

/**
 * Bean 助手类
 */
public final class BeanHelper {
	
	private static Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();
	
	/**
	 * 设置Bean实例
	 */
	public static void setBean(Class<?> cls, Object obj) {
		BEAN_MAP.put(cls, obj);
	}
	
}
