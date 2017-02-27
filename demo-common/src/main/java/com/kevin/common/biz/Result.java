package com.kevin.common.biz;

import java.io.Serializable;

/**
 * 结果对象
 * <p>
 * 主要用于系统间传递，系统内部传递使用。当结果是成功时，错误码可能为空。返回的数据可能是为空的，视业务场景而定。
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -6888435435963799184L;

    /**
     * 返回标志 1:成功 0：失败
     */
    private String ret;

    /**
     * 返回的错误码
     */
    private String errCode;

    /**
     * 返回的错误消息
     */
    private String errMsg;

    /**
     * 返回的数据
     * <p>
     * 成功或者失败都有可能有数据
     */
    private Object data;

    /**
     * 待废弃，没看懂为啥命名为defaultdata，如果有分页，直接给{@link #page}赋值即可。
     */


    /**
     * Page页面对象 用于列表分页，没有分页则为<code>NULL</code>
     */
    private Page page;

    public Result() {

    }

    public Result(String ret) {
        this.ret = ret;
    }

    public Result(String ret, Object data) {
        this.ret = ret;
        this.data = data;
    }

    public Result(String ret, Object data, Page page) {
        this(ret, data);
        this.page = page;
    }

    public Result(String ret, String errCode, String errMsg) {
        this.ret = ret;
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Result(String ret, String errCode, String errMsg, Object data) {
        this(ret, errCode, errMsg);
        this.data = data;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }


    /**
     * 成功 SUCCESS = "1"
     */
    public static final String SUCCESS = "1";

    /**
     * 失败 FAIL = "0"
     */
    public static final String FAIL = "0";
}
