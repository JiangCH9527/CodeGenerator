package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdArgoClusterRelation
 * 
 * AutoCreated on 2024-03-01
 */
public class CdArgoClusterRelationDO implements Serializable {
    private static final long serialVersionUID = -7151810574435266380L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 集群id
	 */
	private Long clusterId;

    /**
	 * 账户
	 */
	private String account;

    /**
	 * Argo账户token
	 */
	private String token;

    /**
	 * Argo地址
	 */
	private String server;

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
    public Long getClusterId() {
		return clusterId;
	}
    public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}
    public String getAccount() {
		return account;
	}
    public void setAccount(String account) {
		this.account = account;
	}
    public String getToken() {
		return token;
	}
    public void setToken(String token) {
		this.token = token;
	}
    public String getServer() {
		return server;
	}
    public void setServer(String server) {
		this.server = server;
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
