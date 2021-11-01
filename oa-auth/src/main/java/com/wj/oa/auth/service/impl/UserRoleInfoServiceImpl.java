package com.wj.oa.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.oa.auth.mapper.RoleUserInfoMapper;
import com.wj.oa.auth.model.UserRoleInfo;
import com.wj.oa.auth.service.UserRoleInfoService;

@Service("userRoleInfoService")
public class UserRoleInfoServiceImpl implements UserRoleInfoService{
	
	@Autowired
	RoleUserInfoMapper mapper;

	@Override
	public void addRoleInfo(UserRoleInfo userRoleInfo) {
		mapper.addRoleInfo(userRoleInfo);
	}

	@Override
	public void deleteRoleInfo(Long id) {
		mapper.deleteRoleInfo(id);
	}

	@Override
	public UserRoleInfo findById(Long id) {
		System.out.println("findById-bugfix");
		UserRoleInfo findById = mapper.findById(id);
		return findById;
	}

}
