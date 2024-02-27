package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * Application
 * 
 * AutoCreated on 2024-02-27
 */
public class ApplicationDO implements Serializable {
    private static final long serialVersionUID = -6070616736807676061L;

    private Long id;

    /**
	 * 项目id 外键
	 */
	private Long projectId;

    /**
	 * 应用名
	 */
	private String name;

    /**
	 * 工程模块名
	 */
	private String moduleName;

    /**
	 * 打包路径
	 */
	private String buildPath;

    /**
	 * 健康检查url地址
	 */
	private String healthCheckPath;

    /**
	 * 部署时间限制
	 */
	private String deployTime;

    /**
	 * 紧急发版允许开始时间，在封板时间段内有效
	 */
	private String emergencyStartTime;

    /**
	 * 紧急发版允许结束时间，在封板时间段内有效
	 */
	private String emergencyEndTime;

    /**
	 * pipeline中ENV的值和日志路径的部分名称
	 */
	private String serverName;

    /**
	 * 创建时间
	 */
	private Date createTime;

    /**
	 * 更新时间
	 */
	private Date updateTime;

    /**
	 * 是否调整了logback 临时字段
	 */
	private String logbackProfile;

    /**
	 * 乐观锁版本号
	 */
	private Long version;

    /**
	 * 是否删除:0,未删除;1,已删除
	 */
	private Integer isDeleted;

    public Long getId() {
		return id;
	}
    public void setId(Long id) {
		this.id = id;
	}
    public Long getProjectId() {
		return projectId;
	}
    public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getModuleName() {
		return moduleName;
	}
    public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
    public String getBuildPath() {
		return buildPath;
	}
    public void setBuildPath(String buildPath) {
		this.buildPath = buildPath;
	}
    public String getHealthCheckPath() {
		return healthCheckPath;
	}
    public void setHealthCheckPath(String healthCheckPath) {
		this.healthCheckPath = healthCheckPath;
	}
    public String getDeployTime() {
		return deployTime;
	}
    public void setDeployTime(String deployTime) {
		this.deployTime = deployTime;
	}
    public String getEmergencyStartTime() {
		return emergencyStartTime;
	}
    public void setEmergencyStartTime(String emergencyStartTime) {
		this.emergencyStartTime = emergencyStartTime;
	}
    public String getEmergencyEndTime() {
		return emergencyEndTime;
	}
    public void setEmergencyEndTime(String emergencyEndTime) {
		this.emergencyEndTime = emergencyEndTime;
	}
    public String getServerName() {
		return serverName;
	}
    public void setServerName(String serverName) {
		this.serverName = serverName;
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
    public String getLogbackProfile() {
		return logbackProfile;
	}
    public void setLogbackProfile(String logbackProfile) {
		this.logbackProfile = logbackProfile;
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
