package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdDeployCallParamSnapshot
 * 
 * AutoCreated on 2024-02-27
 */
public class CdDeployCallParamSnapshotDO implements Serializable {
    private static final long serialVersionUID = -8895169616006348263L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 部署单应用记录id
	 */
	private Long cdDeployAppRecordId;

    /**
	 * 调用类型(1:部署，2:回滚)
	 */
	private Integer callType;

    /**
	 * 部署调用参数(json格式数据)
	 */
	private String param;

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
    public Long getCdDeployAppRecordId() {
		return cdDeployAppRecordId;
	}
    public void setCdDeployAppRecordId(Long cdDeployAppRecordId) {
		this.cdDeployAppRecordId = cdDeployAppRecordId;
	}
    public Integer getCallType() {
		return callType;
	}
    public void setCallType(Integer callType) {
		this.callType = callType;
	}
    public String getParam() {
		return param;
	}
    public void setParam(String param) {
		this.param = param;
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
