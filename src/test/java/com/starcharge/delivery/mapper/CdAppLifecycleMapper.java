package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdAppLifecycleDO;
import org.springframework.stereotype.Repository;

/** 
 * CdAppLifecycle
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdAppLifecycleMapper {

    Integer add(CdAppLifecycleDO cdAppLifecycle);

    Integer update(CdAppLifecycleDO cdAppLifecycle);

    CdAppLifecycleDO get(Long Id);

    List<CdAppLifecycleDO> list(CdAppLifecycleDO cdAppLifecycle);

    List<CdAppLifecycleDO> listByPage(CdAppLifecycleDO cdAppLifecycle);

    Integer count(CdAppLifecycleDO cdAppLifecycle);

    Integer delete(Long Id);

}
