package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdResourceDO;
import org.springframework.stereotype.Repository;

/** 
 * CdResource
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdResourceMapper {

    Integer add(CdResourceDO cdResource);

    Integer update(CdResourceDO cdResource);

    CdResourceDO get(Long Id);

    List<CdResourceDO> list(CdResourceDO cdResource);

    List<CdResourceDO> listByPage(CdResourceDO cdResource);

    Integer count(CdResourceDO cdResource);

    Integer delete(Long Id);

}
