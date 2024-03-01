package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdArgoClusterRelationDO;
import org.apache.ibatis.annotations.Mapper;

/** 
 * CdArgoClusterRelation
 * 
 * AutoCreated on 2024-03-01
 */
@Mapper
public interface CdArgoClusterRelationMapper {

    Integer insert(CdArgoClusterRelationDO cdArgoClusterRelation);

    Integer update(CdArgoClusterRelationDO cdArgoClusterRelation);

    CdArgoClusterRelationDO get(Long id);

    List<CdArgoClusterRelationDO> list(CdArgoClusterRelationDO cdArgoClusterRelation);

    List<CdArgoClusterRelationDO> listByPage(CdArgoClusterRelationDO cdArgoClusterRelation);

    Integer count(CdArgoClusterRelationDO cdArgoClusterRelation);

    Integer delete(Long id);

}
