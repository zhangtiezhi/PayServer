package com.zhang.zhang.api.server;

import javax.annotation.Resource;

import com.zhang.zhang.entity.BjUser;
import com.zhang.zhang.service.BjUserService;

public class ICBCBank {
	
	@Resource
	private BjUserService bjUserService;
	
	public void calcu(String id) {
		BjUser byId = bjUserService.getById("1069982406023548930");
		System.out.println(byId.getBlogCover()+"====<");
	}
}
