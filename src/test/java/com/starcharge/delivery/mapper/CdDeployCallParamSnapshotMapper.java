package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdDeployCallParamSnapshotDO;
import org.springframework.stereotype.Repository;

/** 
 * CdDeployCallParamSnapshot
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdDeployCallParamSnapshotMapper {

    Integer add(CdDeployCallParamSnapshotDO cdDeployCallParamSnapshot);

    Integer update(CdDeployCallParamSnapshotDO cdDeployCallParamSnapshot);

    CdDeployCallParamSnapshotDO get(Long Id);

    List<CdDeployCallParamSnapshotDO> list(CdDeployCallParamSnapshotDO cdDeployCallParamSnapshot);

    List<CdDeployCallParamSnapshotDO> listByPage(CdDeployCallParamSnapshotDO cdDeployCallParamSnapshot);

    Integer count(CdDeployCallParamSnapshotDO cdDeployCallParamSnapshot);

    Integer delete(Long Id);

}
