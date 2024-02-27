package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdAppLifecycleHttpgetParam
 * 
 * AutoCreated on 2024-02-27
 */
public class CdAppLifecycleHttpgetParamDO implements Serializable {
    private static final long serialVersionUID = -6372512415468685967L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * app_lifecycle_id
	 */
	private Long appLifecycleId;

    /**
	 * path
	 */
	private String path;

    /**
	 * port
	 */
	private String port;

    /**
	 * scheme
	 */
	private String scheme;

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
    public Long getAppLifecycleId() {
		return appLifecycleId;
	}
    public void setAppLifecycleId(Long appLifecycleId) {
		this.appLifecycleId = appLifecycleId;
	}
    public String getPath() {
		return path;
	}
    public void setPath(String path) {
		this.path = path;
	}
    public String getPort() {
		return port;
	}
    public void setPort(String port) {
		this.port = port;
	}
    public String getScheme() {
		return scheme;
	}
    public void setScheme(String scheme) {
		this.scheme = scheme;
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
