package com.jiangchenhui.exam.dao.mapper;

import java.util.List;

import com.jiangchenhui.exam.domain.ApplicationDO;
import org.springframework.stereotype.Repository;

/** 
 * Application
 * AutoCreated on 2024-02-26
 */
@Repository
public interface ApplicationMapper {

    Integer add(ApplicationDO application);

    Integer update(ApplicationDO application);

    ApplicationDO get(Long id);

    List<ApplicationDO> list(ApplicationDO application);

    List<ApplicationDO> listByPage(ApplicationDO application);

    Integer count(ApplicationDO application);

    Integer delete(Long id);

}
