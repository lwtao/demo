package com.kevin.demo.dao.po;


import com.kevin.common.biz.BasePO;

public class AddressDirectoryPO extends BasePO {

    private static final long serialVersionUID = 3620425056570534029L;

    private String addressId;

    private String addressCode;

    private String addressType;

    private String addressName;

    private String parentId;

    private String parentName;

    private String namePath;

    private String addressIdPath;

    private Integer hasChild;

    private String countryCode;

    private String countryId;

    public String getAddressIdPath() {
        return addressIdPath;
    }

    public void setAddressIdPath(String addressIdPath) {
        this.addressIdPath = addressIdPath;
    }

    public Integer getHasChild() {
        return hasChild;
    }

    public void setHasChild(Integer hasChild) {
        this.hasChild = hasChild;
    }

    public String getNamePath() {
        return namePath;
    }

    public void setNamePath(String namePath) {
        this.namePath = namePath;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode == null ? null : addressCode.trim();
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType == null ? null : addressType.trim();
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName == null ? null : addressName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

}