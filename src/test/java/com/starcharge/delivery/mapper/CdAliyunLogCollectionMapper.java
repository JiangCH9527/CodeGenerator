package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdAliyunLogCollectionDO;
import org.springframework.stereotype.Repository;

/** 
 * CdAliyunLogCollection
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdAliyunLogCollectionMapper {

    Integer add(CdAliyunLogCollectionDO cdAliyunLogCollection);

    Integer update(CdAliyunLogCollectionDO cdAliyunLogCollection);

    CdAliyunLogCollectionDO get(Long Id);

    List<CdAliyunLogCollectionDO> list(CdAliyunLogCollectionDO cdAliyunLogCollection);

    List<CdAliyunLogCollectionDO> listByPage(CdAliyunLogCollectionDO cdAliyunLogCollection);

    Integer count(CdAliyunLogCollectionDO cdAliyunLogCollection);

    Integer delete(Long Id);

}
