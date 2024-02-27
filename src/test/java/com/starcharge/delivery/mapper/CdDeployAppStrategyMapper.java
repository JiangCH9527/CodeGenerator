package com.starcharge.delivery.mapper;

import java.util.List;

import com.starcharge.delivery.domain.CdDeployAppStrategyDO;
import org.springframework.stereotype.Repository;

/** 
 * CdDeployAppStrategy
 * 
 * AutoCreated on 2024-02-27
 */
@Repository
public interface CdDeployAppStrategyMapper {

    Integer add(CdDeployAppStrategyDO cdDeployAppStrategy);

    Integer update(CdDeployAppStrategyDO cdDeployAppStrategy);

    CdDeployAppStrategyDO get(Long id);

    List<CdDeployAppStrategyDO> list(CdDeployAppStrategyDO cdDeployAppStrategy);

    List<CdDeployAppStrategyDO> listByPage(CdDeployAppStrategyDO cdDeployAppStrategy);

    Integer count(CdDeployAppStrategyDO cdDeployAppStrategy);

    Integer delete(Long id);

}
