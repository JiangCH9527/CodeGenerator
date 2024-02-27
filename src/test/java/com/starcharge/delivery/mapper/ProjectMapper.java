package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.ProjectDO;
import org.apache.ibatis.annotations.Mapper;

/** 
 * Project
 * 
 * AutoCreated on 2024-02-27
 */
@Mapper
public interface ProjectMapper {

    Integer insert(ProjectDO project);

    Integer update(ProjectDO project);

    ProjectDO get(Long id);

    List<ProjectDO> list(ProjectDO project);

    List<ProjectDO> listByPage(ProjectDO project);

    Integer count(ProjectDO project);

    Integer delete(Long id);

}
