package com.kevin.common.biz;

import java.io.Serializable;

/**
 * Created by allen lei on 2015/12/30.
 * 封装分页逻辑和一些技术属性
 *
 */
public class BasePO implements Serializable {

    /**
     * 起始行数
     */
    private Integer startRecord;

    /**
     * 页数
     */
    private Integer pageSize;

    /**
     * 排序字段
     */
    private String sort;

    /**
     * 正序|反序(例DESC|ASC)
     */
    private String order;

    private Long createTime;
    private Long modifyTime;

    private String creatorId;
    private String modifierId;

    private Integer id;

    private Integer version;

    public Integer getStartRecord() {
        int poCurrentPage = 1;
        if (pageSize != null){
            return (poCurrentPage - 1) * pageSize;
        }
        return null;
    }

    public void setStartRecord(Integer startRecord) {
        this.startRecord = startRecord;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BasePO buildSort(String sort){
        setSort(sort);
        return this;
    }

    public BasePO buildOrder(String order){
        setOrder(order);
        return this;
    }

    public void buildCreatorInfo(String creatorId,Long now){
        this.creatorId = creatorId;
        this.createTime = now;
    }

    public void buildModifierInfo(String modifierId,Long now){
        this.modifierId = modifierId;
        this.modifyTime = now;

    }

}
