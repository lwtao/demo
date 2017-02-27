package com.kevin.common.biz;

import java.io.Serializable;
import java.util.Date;

public interface IBaseDTO extends Serializable{

	public Integer getUserId();

	public void setUserId(Integer userId);

	public Date getCreateTime();

	public void setCreateTime(Date createTime);

	public Date getUpdateTime();

	public void setUpdateTime(Date updateTime);

	public String getLogId();

	public void setLogId(String logId);

	public Integer getCurrentPage();

	public void setCurrentPage(Integer currentPage);

	public Integer getPageSize();

	public void setPageSize(Integer pageSize);

	public String getUserIp();

	public void setUserIp(String userIp);

	public String getCreateUserNum();

	public void setCreateUserNum(String createUserNum);

	public String getModifyUserNum();

	public void setModifyUserNum(String modifyUserNum);

	public String getLanguage();

	public void setLanguage(String language);

	public String getCountry();

	public void setCountry(String country);
	
	public String getAppClientId() ;

	public void setAppClientId(String appClientId);

	public String getDeviceId();

	public void setDeviceId(String deviceId);

	public String getDeviceType();

	public void setDeviceType(String deviceType);
}