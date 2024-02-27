package com.starcharge.delivery.domain;

import java.io.Serializable;

/** 
 * ConsulInfo
 * 
 * AutoCreated on 2024-02-27
 */
public class ConsulInfoDO implements Serializable {
    private static final long serialVersionUID = -6097878656977815834L;

    private Long id;

    /**
	 * consul服务地址，集群ip用逗号分割
	 */
	private String consulServerIp;

    /**
	 * consul数据目录
	 */
	private String dataDir;

    /**
	 * consul秘钥
	 */
	private String encrypt;

    /**
	 * consul显示名称
	 */
	private String dataCenterName;

    /**
	 * 描述信息
	 */
	private String desc;

    /**
	 * 支持的PROFILE
	 */
	private String profile;

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
    public String getConsulServerIp() {
		return consulServerIp;
	}
    public void setConsulServerIp(String consulServerIp) {
		this.consulServerIp = consulServerIp;
	}
    public String getDataDir() {
		return dataDir;
	}
    public void setDataDir(String dataDir) {
		this.dataDir = dataDir;
	}
    public String getEncrypt() {
		return encrypt;
	}
    public void setEncrypt(String encrypt) {
		this.encrypt = encrypt;
	}
    public String getDataCenterName() {
		return dataCenterName;
	}
    public void setDataCenterName(String dataCenterName) {
		this.dataCenterName = dataCenterName;
	}
    public String getDesc() {
		return desc;
	}
    public void setDesc(String desc) {
		this.desc = desc;
	}
    public String getProfile() {
		return profile;
	}
    public void setProfile(String profile) {
		this.profile = profile;
	}
    public Integer getIsDeleted() {
		return isDeleted;
	}
    public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
}
