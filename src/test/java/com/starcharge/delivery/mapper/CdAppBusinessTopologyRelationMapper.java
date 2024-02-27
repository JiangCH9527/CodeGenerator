package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdAppBusinessTopologyRelationDO;
import org.springframework.stereotype.Repository;

/** 
 * CdAppBusinessTopologyRelation
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdAppBusinessTopologyRelationMapper {

    Integer add(CdAppBusinessTopologyRelationDO cdAppBusinessTopologyRelation);

    Integer update(CdAppBusinessTopologyRelationDO cdAppBusinessTopologyRelation);

    CdAppBusinessTopologyRelationDO get(Long id);

    List<CdAppBusinessTopologyRelationDO> list(CdAppBusinessTopologyRelationDO cdAppBusinessTopologyRelation);

    List<CdAppBusinessTopologyRelationDO> listByPage(CdAppBusinessTopologyRelationDO cdAppBusinessTopologyRelation);

    Integer count(CdAppBusinessTopologyRelationDO cdAppBusinessTopologyRelation);

    Integer delete(Long id);

}
