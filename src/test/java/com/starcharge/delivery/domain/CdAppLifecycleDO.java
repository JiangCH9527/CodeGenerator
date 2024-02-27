package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdAppLifecycle
 * 
 * AutoCreated on 2024-02-27
 */
public class CdAppLifecycleDO implements Serializable {
    private static final long serialVersionUID = -6433896952105882178L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 部署关系id
	 */
	private Long cdAppEnvClusterId;

    /**
	 * 探针类型(1就绪/2存活/3启动探针)
	 */
	private Integer callType;

    /**
	 * initialDelayeconds
	 */
	private String initialDelayeconds;

    /**
	 * periodSeconds
	 */
	private String periodSeconds;

    /**
	 * successTheshold
	 */
	private String successTheshold;

    /**
	 * tiomeoutSenconds
	 */
	private String tiomeoutSenconds;

    /**
	 * failureThreshold
	 */
	private String failureThreshold;

    /**
	 * 模式（默认：httpGet）
	 */
	private String mode;

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
    public Integer getCallType() {
		return callType;
	}
    public void setCallType(Integer callType) {
		this.callType = callType;
	}
    public String getInitialDelayeconds() {
		return initialDelayeconds;
	}
    public void setInitialDelayeconds(String initialDelayeconds) {
		this.initialDelayeconds = initialDelayeconds;
	}
    public String getPeriodSeconds() {
		return periodSeconds;
	}
    public void setPeriodSeconds(String periodSeconds) {
		this.periodSeconds = periodSeconds;
	}
    public String getSuccessTheshold() {
		return successTheshold;
	}
    public void setSuccessTheshold(String successTheshold) {
		this.successTheshold = successTheshold;
	}
    public String getTiomeoutSenconds() {
		return tiomeoutSenconds;
	}
    public void setTiomeoutSenconds(String tiomeoutSenconds) {
		this.tiomeoutSenconds = tiomeoutSenconds;
	}
    public String getFailureThreshold() {
		return failureThreshold;
	}
    public void setFailureThreshold(String failureThreshold) {
		this.failureThreshold = failureThreshold;
	}
    public String getMode() {
		return mode;
	}
    public void setMode(String mode) {
		this.mode = mode;
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
