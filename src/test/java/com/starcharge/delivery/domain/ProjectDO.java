package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * Project
 * 
 * AutoCreated on 2024-02-27
 */
public class ProjectDO implements Serializable {
    private static final long serialVersionUID = -6654986771028124920L;

    private Long id;

    /**
	 * 1. 项目创建后，生成project_code 2. 修改项目名，project_code不变 3. 项目部署时，发送给jenkins，jenkins作为项目唯一区分标识 4. jenkins调用k8s时，以project_code作为"项目区分标识"和"流量区分标识"
	 */
	private String projectCode;

    /**
	 * gitlab中的项目id
	 */
	private Integer repositoryId;

    /**
	 * git仓库地址
	 */
	private String repositoryUrl;

    /**
	 * 部门编码
	 */
	private String departmentCode;

    /**
	 * 部门名
	 */
	private String departmentName;

    /**
	 * 项目名
	 */
	private String name;

    /**
	 * 描述
	 */
	private String description;

    /**
	 * 1:java 2:javaScript 3:go
	 */
	private Long language;

    /**
	 * 项目类型 server、h5、app
	 */
	private Long type;

    /**
	 * meter:1 frame.core:2
	 */
	private Long framework;

    /**
	 * 是否初始化 0没有初始化 10初始化
	 */
	private Integer init;

    /**
	 * 服务访问方式  1：业务服务，外网访问  2：工具服务，内网访问
	 */
	private Integer accessType;

    private String operator;

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
	 * 是否删除:0,未删除;1,已删除
	 */
	private Integer isDeleted;

    public Long getId() {
		return id;
	}
    public void setId(Long id) {
		this.id = id;
	}
    public String getProjectCode() {
		return projectCode;
	}
    public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
    public Integer getRepositoryId() {
		return repositoryId;
	}
    public void setRepositoryId(Integer repositoryId) {
		this.repositoryId = repositoryId;
	}
    public String getRepositoryUrl() {
		return repositoryUrl;
	}
    public void setRepositoryUrl(String repositoryUrl) {
		this.repositoryUrl = repositoryUrl;
	}
    public String getDepartmentCode() {
		return departmentCode;
	}
    public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
    public String getDepartmentName() {
		return departmentName;
	}
    public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getDescription() {
		return description;
	}
    public void setDescription(String description) {
		this.description = description;
	}
    public Long getLanguage() {
		return language;
	}
    public void setLanguage(Long language) {
		this.language = language;
	}
    public Long getType() {
		return type;
	}
    public void setType(Long type) {
		this.type = type;
	}
    public Long getFramework() {
		return framework;
	}
    public void setFramework(Long framework) {
		this.framework = framework;
	}
    public Integer getInit() {
		return init;
	}
    public void setInit(Integer init) {
		this.init = init;
	}
    public Integer getAccessType() {
		return accessType;
	}
    public void setAccessType(Integer accessType) {
		this.accessType = accessType;
	}
    public String getOperator() {
		return operator;
	}
    public void setOperator(String operator) {
		this.operator = operator;
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
