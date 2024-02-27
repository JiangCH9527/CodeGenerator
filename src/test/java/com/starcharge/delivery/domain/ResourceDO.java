package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * Resource
 * 
 * AutoCreated on 2024-02-27
 */
public class ResourceDO implements Serializable {
    private static final long serialVersionUID = -8482303690998125033L;

    private Long id;

    /**
	 * 项目id
	 */
	private Long projectId;

    /**
	 * 应用id
	 */
	private Long applicationId;

    /**
	 * 护航平台resourceId
	 */
	private Long titanResourceId;

    /**
	 * 1:DEV/10:TEST/15:PER/20:PROD
	 */
	private Integer profile;

    /**
	 * 子环境name
	 */
	private String subProfile;

    /**
	 * cluster_info表主键
	 */
	private Long clusterInfoId;

    /**
	 * 资源申请json
	 */
	private String resourceApply;

    /**
	 * 资源审批json
	 */
	private String resourceUsed;

    /**
	 * 外网域名
	 */
	private String realmName;

    private Long nginxInfoId;

    /**
	 * 内网域名
	 */
	private String internalRealmName;

    private Long internalNginxInfoId;

    /**
	 * 部署参数
	 */
	private String deployParam;

    /**
	 * 动态扩缩容是否启用
	 */
	private Integer hpaEnabled;

    /**
	 * hpa最小数量
	 */
	private Integer hpaMinReplicas;

    /**
	 * hpa最大扩容数
	 */
	private Integer hpaMaxReplicas;

    /**
	 * hpa cpu阈值
	 */
	private Integer cpuTargetUtilization;

    /**
	 * hpa 内存阈值
	 */
	private Integer memTargetUtilization;

    /**
	 * 调度策略
	 */
	private Integer schedulerEnabled;

    /**
	 * 申请状态 10申请中 20申请完成
	 */
	private Integer status;

    /**
	 * 资源申请人id
	 */
	private Integer applyUserId;

    /**
	 * 申请人名称
	 */
	private String applyUserName;

    private String applyUserCode;

    /**
	 * consul_info 表id
	 */
	private Long consulInfoId;

    /**
	 * 时区
	 */
	private String timezone;

    /**
	 * 创建时间
	 */
	private Date createTime;

    /**
	 * 更新时间
	 */
	private Date updateTime;

    /**
	 * 乐观锁版本
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
    public Long getApplicationId() {
		return applicationId;
	}
    public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
    public Long getTitanResourceId() {
		return titanResourceId;
	}
    public void setTitanResourceId(Long titanResourceId) {
		this.titanResourceId = titanResourceId;
	}
    public Integer getProfile() {
		return profile;
	}
    public void setProfile(Integer profile) {
		this.profile = profile;
	}
    public String getSubProfile() {
		return subProfile;
	}
    public void setSubProfile(String subProfile) {
		this.subProfile = subProfile;
	}
    public Long getClusterInfoId() {
		return clusterInfoId;
	}
    public void setClusterInfoId(Long clusterInfoId) {
		this.clusterInfoId = clusterInfoId;
	}
    public String getResourceApply() {
		return resourceApply;
	}
    public void setResourceApply(String resourceApply) {
		this.resourceApply = resourceApply;
	}
    public String getResourceUsed() {
		return resourceUsed;
	}
    public void setResourceUsed(String resourceUsed) {
		this.resourceUsed = resourceUsed;
	}
    public String getRealmName() {
		return realmName;
	}
    public void setRealmName(String realmName) {
		this.realmName = realmName;
	}
    public Long getNginxInfoId() {
		return nginxInfoId;
	}
    public void setNginxInfoId(Long nginxInfoId) {
		this.nginxInfoId = nginxInfoId;
	}
    public String getInternalRealmName() {
		return internalRealmName;
	}
    public void setInternalRealmName(String internalRealmName) {
		this.internalRealmName = internalRealmName;
	}
    public Long getInternalNginxInfoId() {
		return internalNginxInfoId;
	}
    public void setInternalNginxInfoId(Long internalNginxInfoId) {
		this.internalNginxInfoId = internalNginxInfoId;
	}
    public String getDeployParam() {
		return deployParam;
	}
    public void setDeployParam(String deployParam) {
		this.deployParam = deployParam;
	}
    public Integer getHpaEnabled() {
		return hpaEnabled;
	}
    public void setHpaEnabled(Integer hpaEnabled) {
		this.hpaEnabled = hpaEnabled;
	}
    public Integer getHpaMinReplicas() {
		return hpaMinReplicas;
	}
    public void setHpaMinReplicas(Integer hpaMinReplicas) {
		this.hpaMinReplicas = hpaMinReplicas;
	}
    public Integer getHpaMaxReplicas() {
		return hpaMaxReplicas;
	}
    public void setHpaMaxReplicas(Integer hpaMaxReplicas) {
		this.hpaMaxReplicas = hpaMaxReplicas;
	}
    public Integer getCpuTargetUtilization() {
		return cpuTargetUtilization;
	}
    public void setCpuTargetUtilization(Integer cpuTargetUtilization) {
		this.cpuTargetUtilization = cpuTargetUtilization;
	}
    public Integer getMemTargetUtilization() {
		return memTargetUtilization;
	}
    public void setMemTargetUtilization(Integer memTargetUtilization) {
		this.memTargetUtilization = memTargetUtilization;
	}
    public Integer getSchedulerEnabled() {
		return schedulerEnabled;
	}
    public void setSchedulerEnabled(Integer schedulerEnabled) {
		this.schedulerEnabled = schedulerEnabled;
	}
    public Integer getStatus() {
		return status;
	}
    public void setStatus(Integer status) {
		this.status = status;
	}
    public Integer getApplyUserId() {
		return applyUserId;
	}
    public void setApplyUserId(Integer applyUserId) {
		this.applyUserId = applyUserId;
	}
    public String getApplyUserName() {
		return applyUserName;
	}
    public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}
    public String getApplyUserCode() {
		return applyUserCode;
	}
    public void setApplyUserCode(String applyUserCode) {
		this.applyUserCode = applyUserCode;
	}
    public Long getConsulInfoId() {
		return consulInfoId;
	}
    public void setConsulInfoId(Long consulInfoId) {
		this.consulInfoId = consulInfoId;
	}
    public String getTimezone() {
		return timezone;
	}
    public void setTimezone(String timezone) {
		this.timezone = timezone;
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
