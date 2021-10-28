package com.wj.oa.auth.service;

import com.wj.oa.auth.model.UserRoleInfo;

public interface UserRoleInfoService {
	
	public void addRoleInfo(UserRoleInfo userRoleInfo);
	
	public void deleteRoleInfo(Long id);
	
	public UserRoleInfo findById(Long id);

}
