package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdAppCatDO;
import org.springframework.stereotype.Repository;

/** 
 * CdAppCat
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdAppCatMapper {

    Integer add(CdAppCatDO cdAppCat);

    Integer update(CdAppCatDO cdAppCat);

    CdAppCatDO get(Long id);

    List<CdAppCatDO> list(CdAppCatDO cdAppCat);

    List<CdAppCatDO> listByPage(CdAppCatDO cdAppCat);

    Integer count(CdAppCatDO cdAppCat);

    Integer delete(Long id);

}
