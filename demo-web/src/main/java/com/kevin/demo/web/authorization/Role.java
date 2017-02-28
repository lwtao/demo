package com.kevin.demo.web.authorization;

import java.util.ArrayList;
import java.util.List;


public class Role {

	private Integer id;
	private String roleName;
	private List<Permission> permissionList;//一个角色对应多个权限
	private List<User> userList;//一个角色对应多个用户
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Permission> getPermissionList() {
		return permissionList;
	}
	public void setPermissionList(List<Permission> permissionList) {
		this.permissionList = permissionList;
	}

	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<String> getPermissionsName(){
		List<String> list=new ArrayList<String>();
		List<Permission> perlist=getPermissionList();
		for (Permission per : perlist) {
			list.add(per.getPermissionName());
		}
		return list;
	}
}