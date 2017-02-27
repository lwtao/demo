package com.kevin.demo.service.impl;

import com.kevin.demo.dao.AddressDirectoryDao;
import com.kevin.demo.dao.po.AddressDirectoryPO;
import com.kevin.demo.service.AddressDirectoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuwentao
 * @history 2016/1/9 liuwentao 新建
 * @since 2016/1/9 12:28
 */
@Service
public class AddressDirectoryServiceImpl implements AddressDirectoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressDirectoryServiceImpl.class);

    @Resource
    private TransactionTemplate transactionTemplate;

    @Resource
    private AddressDirectoryDao addressDirectoryDao;


    @Override
    public List<AddressDirectoryPO> findAddress(AddressDirectoryPO addressDirectoryPO) {
        return addressDirectoryDao.findAddress(addressDirectoryPO);
    }
}
