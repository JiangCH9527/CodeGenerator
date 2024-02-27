package com.starcharge.delivery.domain;

import java.io.Serializable;

/** 
 * ClusterInfo
 * 
 * AutoCreated on 2024-02-27
 */
public class ClusterInfoDO implements Serializable {
    private static final long serialVersionUID = -4707899991371162199L;

    private Long id;

    /**
	 * 集群名称
	 */
	private String name;

    /**
	 * 前端显示名称
	 */
	private String frontendName;

    /**
	 * ali aws
	 */
	private String cloud;

    private String profiles;

    /**
	 * k8s连接地址
	 */
	private String k8sApiServer;

    /**
	 * 连接中间服务器：k8s controller宿主机或者jumpserver宿主机
	 */
	private String connectorNodeIp;

    /**
	 * 推送镜像仓库
	 */
	private String harborPush;

    /**
	 * 拉取镜像仓库地址  可能走内网
	 */
	private String harborPull;

    /**
	 * 镜像仓库地域
	 */
	private String harborRegion;

    /**
	 * 集群region，如：cn_shanghai、cn_hangzhou、sg-sg
	 */
	private String clusterRegion;

    /**
	 * cat包拉取地址 默认sae.oss.starcharge.com
	 */
	private String catPull;

    /**
	 * cat连接地址
	 */
	private String catServerIp;

    /**
	 * 国家
	 */
	private String country;

    /**
	 * 地域
	 */
	private String region;

    /**
	 * sls project meteor 名字
	 */
	private String logProjectMeteor;

    /**
	 * sls project framecore 名字
	 */
	private String logProjectFramecore;

    /**
	 * ark web shell地址
	 */
	private String webShell;

    /**
	 * 描述
	 */
	private String desc;

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
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getFrontendName() {
		return frontendName;
	}
    public void setFrontendName(String frontendName) {
		this.frontendName = frontendName;
	}
    public String getCloud() {
		return cloud;
	}
    public void setCloud(String cloud) {
		this.cloud = cloud;
	}
    public String getProfiles() {
		return profiles;
	}
    public void setProfiles(String profiles) {
		this.profiles = profiles;
	}
    public String getK8sApiServer() {
		return k8sApiServer;
	}
    public void setK8sApiServer(String k8sApiServer) {
		this.k8sApiServer = k8sApiServer;
	}
    public String getConnectorNodeIp() {
		return connectorNodeIp;
	}
    public void setConnectorNodeIp(String connectorNodeIp) {
		this.connectorNodeIp = connectorNodeIp;
	}
    public String getHarborPush() {
		return harborPush;
	}
    public void setHarborPush(String harborPush) {
		this.harborPush = harborPush;
	}
    public String getHarborPull() {
		return harborPull;
	}
    public void setHarborPull(String harborPull) {
		this.harborPull = harborPull;
	}
    public String getHarborRegion() {
		return harborRegion;
	}
    public void setHarborRegion(String harborRegion) {
		this.harborRegion = harborRegion;
	}
    public String getClusterRegion() {
		return clusterRegion;
	}
    public void setClusterRegion(String clusterRegion) {
		this.clusterRegion = clusterRegion;
	}
    public String getCatPull() {
		return catPull;
	}
    public void setCatPull(String catPull) {
		this.catPull = catPull;
	}
    public String getCatServerIp() {
		return catServerIp;
	}
    public void setCatServerIp(String catServerIp) {
		this.catServerIp = catServerIp;
	}
    public String getCountry() {
		return country;
	}
    public void setCountry(String country) {
		this.country = country;
	}
    public String getRegion() {
		return region;
	}
    public void setRegion(String region) {
		this.region = region;
	}
    public String getLogProjectMeteor() {
		return logProjectMeteor;
	}
    public void setLogProjectMeteor(String logProjectMeteor) {
		this.logProjectMeteor = logProjectMeteor;
	}
    public String getLogProjectFramecore() {
		return logProjectFramecore;
	}
    public void setLogProjectFramecore(String logProjectFramecore) {
		this.logProjectFramecore = logProjectFramecore;
	}
    public String getWebShell() {
		return webShell;
	}
    public void setWebShell(String webShell) {
		this.webShell = webShell;
	}
    public String getDesc() {
		return desc;
	}
    public void setDesc(String desc) {
		this.desc = desc;
	}
    public Integer getIsDeleted() {
		return isDeleted;
	}
    public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
}
