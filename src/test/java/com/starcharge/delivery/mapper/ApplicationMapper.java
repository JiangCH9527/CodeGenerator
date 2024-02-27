package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ApplicationDO;
import org.springframework.stereotype.Repository;

/** 
 * Application
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface ApplicationMapper {

    Integer add(ApplicationDO application);

    Integer update(ApplicationDO application);

    ApplicationDO get(Long id);

    List<ApplicationDO> list(ApplicationDO application);

    List<ApplicationDO> listByPage(ApplicationDO application);

    Integer count(ApplicationDO application);

    Integer delete(Long id);

}
