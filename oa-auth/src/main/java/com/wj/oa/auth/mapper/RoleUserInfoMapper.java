package com.wj.oa.auth.mapper;

import com.wj.oa.auth.model.UserRoleInfo;

public interface RoleUserInfoMapper {
	
	public void addRoleInfo(UserRoleInfo userRoleInfo);
	
	public void deleteRoleInfo(Long id);
	
	public UserRoleInfo findById(Long id);

}
