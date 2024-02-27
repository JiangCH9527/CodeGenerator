package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ResourceDO;
import org.apache.ibatis.annotations.Mapper;

/** 
 * Resource
 * 
 * AutoCreated on 2024-02-27
 */
@Mapper
public interface ResourceMapper {

    Integer insert(ResourceDO resource);

    Integer update(ResourceDO resource);

    ResourceDO get(Long id);

    List<ResourceDO> list(ResourceDO resource);

    List<ResourceDO> listByPage(ResourceDO resource);

    Integer count(ResourceDO resource);

    Integer delete(Long id);

}
