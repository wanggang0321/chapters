package org.smart4j.chapter4.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.proxy.AspectProxy;

import java.lang.reflect.Method;

/**
 * 拦截Controller所有方法
 */
public class ControllerAspect extends AspectProxy {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    private long begin;

    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
        LOGGER.debug("----------- begin -----------");
        LOGGER.debug(String.format("class: %s", cls.getName()));
        LOGGER.debug(String.format("method: %s", method.getName()));
        begin = System.currentTimeMillis();
    }

    public void after(Class<?> cls, Method method, Object[] params, Object result) throws Throwable {
        LOGGER.debug(String.format("time: %dms", System.currentTimeMillis() - begin));
        LOGGER.debug("----------- end -----------");
    }

}
