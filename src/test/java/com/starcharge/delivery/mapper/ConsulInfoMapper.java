package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ConsulInfoDO;
import org.apache.ibatis.annotations.Mapper;

/** 
 * ConsulInfo
 * 
 * AutoCreated on 2024-02-27
 */
@Mapper
public interface ConsulInfoMapper {

    Integer insert(ConsulInfoDO consulInfo);

    Integer update(ConsulInfoDO consulInfo);

    ConsulInfoDO get(Long id);

    List<ConsulInfoDO> list(ConsulInfoDO consulInfo);

    List<ConsulInfoDO> listByPage(ConsulInfoDO consulInfo);

    Integer count(ConsulInfoDO consulInfo);

    Integer delete(Long id);

}
