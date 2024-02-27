package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdDeployAppDO;
import org.springframework.stereotype.Repository;

/** 
 * CdDeployApp
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdDeployAppMapper {

    Integer add(CdDeployAppDO cdDeployApp);

    Integer update(CdDeployAppDO cdDeployApp);

    CdDeployAppDO get(Long Id);

    List<CdDeployAppDO> list(CdDeployAppDO cdDeployApp);

    List<CdDeployAppDO> listByPage(CdDeployAppDO cdDeployApp);

    Integer count(CdDeployAppDO cdDeployApp);

    Integer delete(Long Id);

}
