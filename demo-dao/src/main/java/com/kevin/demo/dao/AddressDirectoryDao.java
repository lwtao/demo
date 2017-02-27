package com.kevin.demo.dao;

import com.kevin.demo.dao.po.AddressDirectoryPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressDirectoryDao {

    int updateDelStatus(String id);

    int insert(AddressDirectoryPO record);

    AddressDirectoryPO selectByAddressId(String id);

    int update(AddressDirectoryPO record);

    int updateParentName(@Param("parentName") String parentName, @Param("parentId") String parentId);

    int updateHasChild(@Param("hasChild") int hasChild, @Param("addressId") String addressId);

    List<AddressDirectoryPO> findAddress(AddressDirectoryPO addressDirectoryPO);

    List<AddressDirectoryPO> findAddressByParentId(String parentId);

    int countAddress(AddressDirectoryPO addressDirectoryPO);

    List<AddressDirectoryPO> findAddressNotIn(@Param("parentId") String parentId,
                                              @Param("addressIds") List<String> addressIds,
                                              @Param("startRecord") int currentPage,
                                              @Param("pageSize") int pageSize);

    int countAddressNotIn(@Param("parentId") String parentId, @Param("addressIds") List<String> addressIds);

}