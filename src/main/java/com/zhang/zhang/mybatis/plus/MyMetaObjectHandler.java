package com.zhang.zhang.mybatis.plus;

import java.util.Date;

import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

	protected final static Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);
	
	@Override
	public void insertFill(MetaObject metaObject) {
		logger.debug("新增的时候干点不可描述的事情");
		Date date = new Date();
		// 设置创建时间
		setFieldValByName("createDate", date, metaObject);
		// 设置更新时间
		setFieldValByName("updateDate", date, metaObject);
	}

	@Override
	public void updateFill(MetaObject metaObject) {
		logger.debug("更新的时候干点不可描述的事情");
		Date date = new Date();
		// 设置更新时间
		setFieldValByName("updateDate", date, metaObject);

	}

}
