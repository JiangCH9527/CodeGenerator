package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdAppEnvClusterRelationDO;
import org.springframework.stereotype.Repository;

/** 
 * CdAppEnvClusterRelation
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdAppEnvClusterRelationMapper {

    Integer add(CdAppEnvClusterRelationDO cdAppEnvClusterRelation);

    Integer update(CdAppEnvClusterRelationDO cdAppEnvClusterRelation);

    CdAppEnvClusterRelationDO get(Long Id);

    List<CdAppEnvClusterRelationDO> list(CdAppEnvClusterRelationDO cdAppEnvClusterRelation);

    List<CdAppEnvClusterRelationDO> listByPage(CdAppEnvClusterRelationDO cdAppEnvClusterRelation);

    Integer count(CdAppEnvClusterRelationDO cdAppEnvClusterRelation);

    Integer delete(Long Id);

}
