package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdJvmCustomDO;
import org.springframework.stereotype.Repository;

/** 
 * CdJvmCustom
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdJvmCustomMapper {

    Integer add(CdJvmCustomDO cdJvmCustom);

    Integer update(CdJvmCustomDO cdJvmCustom);

    CdJvmCustomDO get(Long Id);

    List<CdJvmCustomDO> list(CdJvmCustomDO cdJvmCustom);

    List<CdJvmCustomDO> listByPage(CdJvmCustomDO cdJvmCustom);

    Integer count(CdJvmCustomDO cdJvmCustom);

    Integer delete(Long Id);

}
