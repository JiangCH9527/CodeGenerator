package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdDeployAppStrategy
 * 
 * AutoCreated on 2024-02-27
 */
public class CdDeployAppStrategyDO implements Serializable {
    private static final long serialVersionUID = -4685866709889772392L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 部署批次序号
	 */
	private Integer serial;

    /**
	 * 当前批次数量
	 */
	private Integer currentBatchCount;

    /**
	 * 应用部署状态(1:未开始，2:部署中，3：部署完成)
	 */
	private Integer status;

    /**
	 * 部署单应用记录id
	 */
	private Long cdDeployAppRecordId;

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
    public Integer getSerial() {
		return serial;
	}
    public void setSerial(Integer serial) {
		this.serial = serial;
	}
    public Integer getCurrentBatchCount() {
		return currentBatchCount;
	}
    public void setCurrentBatchCount(Integer currentBatchCount) {
		this.currentBatchCount = currentBatchCount;
	}
    public Integer getStatus() {
		return status;
	}
    public void setStatus(Integer status) {
		this.status = status;
	}
    public Long getCdDeployAppRecordId() {
		return cdDeployAppRecordId;
	}
    public void setCdDeployAppRecordId(Long cdDeployAppRecordId) {
		this.cdDeployAppRecordId = cdDeployAppRecordId;
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
