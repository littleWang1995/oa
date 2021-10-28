package com.wj.oa.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wj.oa.auth.model.UserRoleInfo;
import com.wj.oa.auth.service.UserRoleInfoService;

@ContextConfiguration("classpath:application-organ.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRoleInfoTest {
	
	@Autowired
	UserRoleInfoService userRoleInfoService;
	
	@Test
	public void testAddInfo() {
		UserRoleInfo userRoleInfo = new UserRoleInfo();
		userRoleInfo.setEmployeeId(1L);
		userRoleInfo.setRoleId(1L);
		userRoleInfoService.addRoleInfo(userRoleInfo);
	}
	
	
	@Test
	public void testFindInfo() {
		UserRoleInfo userRoleInfo = new UserRoleInfo();
		userRoleInfo.setId(2L);
		UserRoleInfo findById = userRoleInfoService.findById(userRoleInfo.getId());
		System.out.println(findById);
	}

	@Test
	public void testDeleteInfo() {
		UserRoleInfo userRoleInfo = new UserRoleInfo();
		userRoleInfo.setId(1L);
		userRoleInfoService.deleteRoleInfo(userRoleInfo.getId());
	}
}
