package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ProjectDO;
import org.springframework.stereotype.Repository;

/** 
 * Project
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface ProjectMapper {

    Integer add(ProjectDO project);

    Integer update(ProjectDO project);

    ProjectDO get(Long Id);

    List<ProjectDO> list(ProjectDO project);

    List<ProjectDO> listByPage(ProjectDO project);

    Integer count(ProjectDO project);

    Integer delete(Long Id);

}
