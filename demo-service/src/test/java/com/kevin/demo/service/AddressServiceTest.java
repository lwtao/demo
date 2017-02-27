package com.kevin.demo.service;

import org.junit.Test;

import javax.annotation.Resource;

public class AddressServiceTest extends SpringTest {

    @Resource
    private AddressDirectoryService addressDirectoryService;

    @Test
    public void testSelectWithCurrencyByIds() throws Exception {
        addressDirectoryService.findAddress(null);
    }

}