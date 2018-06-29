package org.smart4j.framework;

import org.smart4j.framework.helper.AopHelper;
import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.ControllerHelper;
import org.smart4j.framework.helper.IocHelper;

import cn.hutool.core.util.ClassUtil;

/**
 * 加载相应的Helper类
 * @author wanggang
 * 2018年6月29日 上午10:21:15
 */
public class HelperLoader {
	
	public static void init() {
		Class<?>[] classList = {
				ClassHelper.class,
				BeanHelper.class,
				AopHelper.class,
				IocHelper.class,
				ControllerHelper.class
		};
		for(Class<?> cls : classList) {
			ClassUtil.loadClass(cls.getName(), true);
		}
	}
	
}
