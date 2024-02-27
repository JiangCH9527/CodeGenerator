package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdAppEnvClusterRelation
 * 
 * AutoCreated on 2024-02-27
 */
public class CdAppEnvClusterRelationDO implements Serializable {
    private static final long serialVersionUID = -4961929769735031018L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 应用
	 */
	private String appName;

    /**
	 * 环境
	 */
	private String env;

    /**
	 * 子环境
	 */
	private String subEnv;

    /**
	 * 集群id
	 */
	private Long clusterId;

    /**
	 * 创建人
	 */
	private String createUser;

    /**
	 * 修改人
	 */
	private String updateUser;

    /**
	 * 创建时间
	 */
	private Date createTime;

    /**
	 * 修改时间
	 */
	private Date updateTime;

    /**
	 * 乐观锁版本号
	 */
	private Long version;

    /**
	 * 是否删除标识 (1是，0否 )
	 */
	private Integer isDeleted;

    public Long getId() {
		return id;
	}
    public void setId(Long id) {
		this.id = id;
	}
    public String getAppName() {
		return appName;
	}
    public void setAppName(String appName) {
		this.appName = appName;
	}
    public String getEnv() {
		return env;
	}
    public void setEnv(String env) {
		this.env = env;
	}
    public String getSubEnv() {
		return subEnv;
	}
    public void setSubEnv(String subEnv) {
		this.subEnv = subEnv;
	}
    public Long getClusterId() {
		return clusterId;
	}
    public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}
    public String getCreateUser() {
		return createUser;
	}
    public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
    public String getUpdateUser() {
		return updateUser;
	}
    public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
    public Date getCreateTime() {
		return createTime;
	}
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    public Date getUpdateTime() {
		return updateTime;
	}
    public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
    public Long getVersion() {
		return version;
	}
    public void setVersion(Long version) {
		this.version = version;
	}
    public Integer getIsDeleted() {
		return isDeleted;
	}
    public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
}
