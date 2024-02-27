package com.starcharge.delivery.domain;

import java.util.Date;

import java.io.Serializable;

/** 
 * CdDeployNote
 * 
 * AutoCreated on 2024-02-27
 */
public class CdDeployNoteDO implements Serializable {
    private static final long serialVersionUID = -8895066903989563568L;

    /**
	 * id
	 */
	private Long id;

    /**
	 * 部署需求
	 */
	private String deployCiNote;

    /**
	 * 上线内容描述
	 */
	private String remark;

    /**
	 * 状态(1:待部署，2:部署中，3：部署完成，4：已回滚，5：已关闭)
	 */
	private Integer status;

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
    public String getDeployCiNote() {
		return deployCiNote;
	}
    public void setDeployCiNote(String deployCiNote) {
		this.deployCiNote = deployCiNote;
	}
    public String getRemark() {
		return remark;
	}
    public void setRemark(String remark) {
		this.remark = remark;
	}
    public Integer getStatus() {
		return status;
	}
    public void setStatus(Integer status) {
		this.status = status;
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
