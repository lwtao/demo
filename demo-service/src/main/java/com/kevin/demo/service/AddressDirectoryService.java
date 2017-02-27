package com.kevin.demo.service;

import com.kevin.demo.dao.po.AddressDirectoryPO;

import java.util.List;

public interface AddressDirectoryService {

    List<AddressDirectoryPO> findAddress(AddressDirectoryPO addressDirectoryPO);
}
