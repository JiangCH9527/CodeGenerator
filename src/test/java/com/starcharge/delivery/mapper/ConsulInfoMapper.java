package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ConsulInfoDO;
import org.springframework.stereotype.Repository;

/** 
 * ConsulInfo
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface ConsulInfoMapper {

    Integer add(ConsulInfoDO consulInfo);

    Integer update(ConsulInfoDO consulInfo);

    ConsulInfoDO get(Long Id);

    List<ConsulInfoDO> list(ConsulInfoDO consulInfo);

    List<ConsulInfoDO> listByPage(ConsulInfoDO consulInfo);

    Integer count(ConsulInfoDO consulInfo);

    Integer delete(Long Id);

}
