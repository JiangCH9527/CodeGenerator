package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdAliyunLogCollection
 * 
 * AutoCreated on 2024-02-27
 */
public class CdAliyunLogCollectionDO implements Serializable {
    private static final long serialVersionUID = -5588883141330153713L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 部署关系id
	 */
	private Long cdAppEnvClusterId;

    /**
	 * project
	 */
	private String project;

    /**
	 * logstore
	 */
	private String logstore;

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
    public Long getCdAppEnvClusterId() {
		return cdAppEnvClusterId;
	}
    public void setCdAppEnvClusterId(Long cdAppEnvClusterId) {
		this.cdAppEnvClusterId = cdAppEnvClusterId;
	}
    public String getProject() {
		return project;
	}
    public void setProject(String project) {
		this.project = project;
	}
    public String getLogstore() {
		return logstore;
	}
    public void setLogstore(String logstore) {
		this.logstore = logstore;
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
