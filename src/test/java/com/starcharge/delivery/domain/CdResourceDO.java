package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdResource
 * 
 * AutoCreated on 2024-02-27
 */
public class CdResourceDO implements Serializable {
    private static final long serialVersionUID = -7364600121104853563L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 部署关系id
	 */
	private Long cdAppEnvClusterId;

    /**
	 * 实例副本数
	 */
	private Integer replicas;

    /**
	 * cpu核数
	 */
	private String cpu;

    /**
	 * 内存单位（M）
	 */
	private String memory;

    /**
	 * 端口
	 */
	private String port;

    /**
	 * 其他端口
	 */
	private String otherPort;

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
    public Integer getReplicas() {
		return replicas;
	}
    public void setReplicas(Integer replicas) {
		this.replicas = replicas;
	}
    public String getCpu() {
		return cpu;
	}
    public void setCpu(String cpu) {
		this.cpu = cpu;
	}
    public String getMemory() {
		return memory;
	}
    public void setMemory(String memory) {
		this.memory = memory;
	}
    public String getPort() {
		return port;
	}
    public void setPort(String port) {
		this.port = port;
	}
    public String getOtherPort() {
		return otherPort;
	}
    public void setOtherPort(String otherPort) {
		this.otherPort = otherPort;
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
