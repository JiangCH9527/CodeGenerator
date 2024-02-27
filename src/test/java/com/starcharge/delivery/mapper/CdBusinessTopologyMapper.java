package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdBusinessTopologyDO;
import org.springframework.stereotype.Repository;

/** 
 * CdBusinessTopology
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdBusinessTopologyMapper {

    Integer add(CdBusinessTopologyDO cdBusinessTopology);

    Integer update(CdBusinessTopologyDO cdBusinessTopology);

    CdBusinessTopologyDO get(Long id);

    List<CdBusinessTopologyDO> list(CdBusinessTopologyDO cdBusinessTopology);

    List<CdBusinessTopologyDO> listByPage(CdBusinessTopologyDO cdBusinessTopology);

    Integer count(CdBusinessTopologyDO cdBusinessTopology);

    Integer delete(Long id);

}
