package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ClusterInfoDO;
import org.apache.ibatis.annotations.Mapper;

/** 
 * ClusterInfo
 * 
 * AutoCreated on 2024-02-27
 */
@Mapper
public interface ClusterInfoMapper {

    Integer insert(ClusterInfoDO clusterInfo);

    Integer update(ClusterInfoDO clusterInfo);

    ClusterInfoDO get(Long id);

    List<ClusterInfoDO> list(ClusterInfoDO clusterInfo);

    List<ClusterInfoDO> listByPage(ClusterInfoDO clusterInfo);

    Integer count(ClusterInfoDO clusterInfo);

    Integer delete(Long id);

}
