package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ApplicationDO;
import org.apache.ibatis.annotations.Mapper;

/** 
 * Application
 * 
 * AutoCreated on 2024-02-27
 */
@Mapper
public interface ApplicationMapper {

    Integer insert(ApplicationDO application);

    Integer update(ApplicationDO application);

    ApplicationDO get(Long id);

    List<ApplicationDO> list(ApplicationDO application);

    List<ApplicationDO> listByPage(ApplicationDO application);

    Integer count(ApplicationDO application);

    Integer delete(Long id);

}
