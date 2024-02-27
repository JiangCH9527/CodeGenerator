package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdDeployNoteDO;
import org.springframework.stereotype.Repository;

/** 
 * CdDeployNote
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdDeployNoteMapper {

    Integer add(CdDeployNoteDO cdDeployNote);

    Integer update(CdDeployNoteDO cdDeployNote);

    CdDeployNoteDO get(Long Id);

    List<CdDeployNoteDO> list(CdDeployNoteDO cdDeployNote);

    List<CdDeployNoteDO> listByPage(CdDeployNoteDO cdDeployNote);

    Integer count(CdDeployNoteDO cdDeployNote);

    Integer delete(Long Id);

}
