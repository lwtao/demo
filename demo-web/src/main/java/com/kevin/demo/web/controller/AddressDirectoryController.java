package com.kevin.demo.web.controller;

import com.kevin.demo.dao.po.AddressDirectoryPO;
import com.kevin.demo.service.AddressDirectoryService;
import com.kevin.common.biz.Page;
import com.kevin.common.biz.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 *
 * @author liuwentao
 * @since 2016/1/12 10:13
 * @history 2016/1/12 liuwentao 新建
 */
@Controller
@RequestMapping("/address")
public class AddressDirectoryController {

    @Resource
    private AddressDirectoryService addressDirectoryService;


    @RequestMapping("list")
    @ResponseBody
    public Result findAddress(AddressDirectoryPO addressDirectoryPO) {
        addressDirectoryPO.setPageSize(10);
        Result result = new Result();
        result.setRet(Result.SUCCESS);
        result.setData(addressDirectoryService.findAddress(addressDirectoryPO));
        Page page = new Page(1, 1, 10);
        result.setPage(page);
        return result;
    }


}
