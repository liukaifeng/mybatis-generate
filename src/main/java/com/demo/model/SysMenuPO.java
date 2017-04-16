package com.demo.model;

import java.util.Date;

public class SysMenuPO {
    /**
     * 
     */
    private String id;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 菜单顺序
     */
    private Integer menuOrder;

    /**
     * 菜单类型：0-系统菜单；1-业务菜单
     */
    private Integer menuType;

    /**
     * 菜单地址
     */
    private String menuUrl;

    /**
     * 菜单图标
     */
    private String menuIcon;

    /**
     * 父级菜单ID
     */
    private String parentId;

    /**
     * 状态 0:停用 1：启用
     */
    private Integer status;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 修改人
     */
    private String operator;

    /**
     * 时间戳
     */
    private Date timestamp;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 
     * @return id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 菜单名称
     * @return menu_name 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 菜单编码
     * @return menu_code 菜单编码
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 菜单编码
     * @param menuCode 菜单编码
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * 菜单顺序
     * @return menu_order 菜单顺序
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * 菜单顺序
     * @param menuOrder 菜单顺序
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * 菜单类型：0-系统菜单；1-业务菜单
     * @return menu_type 菜单类型：0-系统菜单；1-业务菜单
     */
    public Integer getMenuType() {
        return menuType;
    }

    /**
     * 菜单类型：0-系统菜单；1-业务菜单
     * @param menuType 菜单类型：0-系统菜单；1-业务菜单
     */
    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    /**
     * 菜单地址
     * @return menu_url 菜单地址
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 菜单地址
     * @param menuUrl 菜单地址
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * 菜单图标
     * @return menu_icon 菜单图标
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * 菜单图标
     * @param menuIcon 菜单图标
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    /**
     * 父级菜单ID
     * @return parent_id 父级菜单ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 父级菜单ID
     * @param parentId 父级菜单ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * 状态 0:停用 1：启用
     * @return status 状态 0:停用 1：启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态 0:停用 1：启用
     * @param status 状态 0:停用 1：启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建人
     * @return creater 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 创建人
     * @param creater 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * 修改人
     * @return operator 修改人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 修改人
     * @param operator 修改人
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 时间戳
     * @return timestamp 时间戳
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * 时间戳
     * @param timestamp 时间戳
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}