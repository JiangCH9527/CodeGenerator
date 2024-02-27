package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdAppLifecycleHttpgetParamDO;
import org.springframework.stereotype.Repository;

/** 
 * CdAppLifecycleHttpgetParam
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdAppLifecycleHttpgetParamMapper {

    Integer add(CdAppLifecycleHttpgetParamDO cdAppLifecycleHttpgetParam);

    Integer update(CdAppLifecycleHttpgetParamDO cdAppLifecycleHttpgetParam);

    CdAppLifecycleHttpgetParamDO get(Long id);

    List<CdAppLifecycleHttpgetParamDO> list(CdAppLifecycleHttpgetParamDO cdAppLifecycleHttpgetParam);

    List<CdAppLifecycleHttpgetParamDO> listByPage(CdAppLifecycleHttpgetParamDO cdAppLifecycleHttpgetParam);

    Integer count(CdAppLifecycleHttpgetParamDO cdAppLifecycleHttpgetParam);

    Integer delete(Long id);

}
