package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ResourceDO;
import org.springframework.stereotype.Repository;

/** 
 * Resource
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface ResourceMapper {

    Integer add(ResourceDO resource);

    Integer update(ResourceDO resource);

    ResourceDO get(Long id);

    List<ResourceDO> list(ResourceDO resource);

    List<ResourceDO> listByPage(ResourceDO resource);

    Integer count(ResourceDO resource);

    Integer delete(Long id);

}
