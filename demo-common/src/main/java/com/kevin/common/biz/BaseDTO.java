package com.kevin.common.biz;

import java.util.Date;

public class BaseDTO implements IBaseDTO {

	private static final long serialVersionUID = 1L;

	private Integer userId;

	private String userIp;
	
	private String createUserNum;
	
	private String createUser;
	
	private Date createTime;

	private String modifyUserNum;
	
	private String modifyUser;
	
	private Date updateTime;

	private String logId;
	
	private String language;
	
	private String country;

	private Integer currentPage = 1;

	private Integer pageSize = 15;
	
	private String appClientId;
	
	private String deviceId;
	
	private String deviceType;

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Integer getUserId(){
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getCreateUserNum() {
		return createUserNum;
	}

	public void setCreateUserNum(String createUserNum) {
		this.createUserNum = createUserNum;
	}

	public String getModifyUserNum() {
		return modifyUserNum;
	}

	public void setModifyUserNum(String modifyUserNum) {
		this.modifyUserNum = modifyUserNum;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAppClientId() {
		return appClientId;
	}

	public void setAppClientId(String appClientId) {
		this.appClientId = appClientId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
}