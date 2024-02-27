package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ClusterInfoDO;
import org.springframework.stereotype.Repository;

/** 
 * ClusterInfo
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface ClusterInfoMapper {

    Integer add(ClusterInfoDO clusterInfo);

    Integer update(ClusterInfoDO clusterInfo);

    ClusterInfoDO get(Long Id);

    List<ClusterInfoDO> list(ClusterInfoDO clusterInfo);

    List<ClusterInfoDO> listByPage(ClusterInfoDO clusterInfo);

    Integer count(ClusterInfoDO clusterInfo);

    Integer delete(Long Id);

}
