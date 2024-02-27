package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdDeployApp
 * 
 * AutoCreated on 2024-02-27
 */
public class CdDeployAppDO implements Serializable {
    private static final long serialVersionUID = -7427377197831597553L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 部署单id
	 */
	private Long cdDeployNoteId;

    /**
	 * 应用名
	 */
	private String appName;

    /**
	 * ci镜像
	 */
	private String ciImage;

    /**
	 * 部署批次数量
	 */
	private Integer deployBatch;

    /**
	 * 当前部署批次数量
	 */
	private Integer currentDeployBatch;

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
    public Long getCdDeployNoteId() {
		return cdDeployNoteId;
	}
    public void setCdDeployNoteId(Long cdDeployNoteId) {
		this.cdDeployNoteId = cdDeployNoteId;
	}
    public String getAppName() {
		return appName;
	}
    public void setAppName(String appName) {
		this.appName = appName;
	}
    public String getCiImage() {
		return ciImage;
	}
    public void setCiImage(String ciImage) {
		this.ciImage = ciImage;
	}
    public Integer getDeployBatch() {
		return deployBatch;
	}
    public void setDeployBatch(Integer deployBatch) {
		this.deployBatch = deployBatch;
	}
    public Integer getCurrentDeployBatch() {
		return currentDeployBatch;
	}
    public void setCurrentDeployBatch(Integer currentDeployBatch) {
		this.currentDeployBatch = currentDeployBatch;
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
