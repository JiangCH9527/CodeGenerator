package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdBusinessTopology
 * 
 * AutoCreated on 2024-02-27
 */
public class CdBusinessTopologyDO implements Serializable {
    private static final long serialVersionUID = -6223425162478567709L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 集群id
	 */
	private Long clusterId;

    /**
	 * 业务域key
	 */
	private String businessKey;

    /**
	 * 业务域value
	 */
	private String businessValue;

    /**
	 * 备注
	 */
	private String remark;

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
    public String getBusinessKey() {
		return businessKey;
	}
    public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}
    public String getBusinessValue() {
		return businessValue;
	}
    public void setBusinessValue(String businessValue) {
		this.businessValue = businessValue;
	}
    public String getRemark() {
		return remark;
	}
    public void setRemark(String remark) {
		this.remark = remark;
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
