package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdAppCat
 * 
 * AutoCreated on 2024-02-27
 */
public class CdAppCatDO implements Serializable {
    private static final long serialVersionUID = -6130179663950229205L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 部署关系id
	 */
	private Long cdAppEnvClusterId;

    /**
	 * cat服务端地址
	 */
	private String catServerIp;

    /**
	 * cat版本
	 */
	private String catVersion;

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
    public String getCatServerIp() {
		return catServerIp;
	}
    public void setCatServerIp(String catServerIp) {
		this.catServerIp = catServerIp;
	}
    public String getCatVersion() {
		return catVersion;
	}
    public void setCatVersion(String catVersion) {
		this.catVersion = catVersion;
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
