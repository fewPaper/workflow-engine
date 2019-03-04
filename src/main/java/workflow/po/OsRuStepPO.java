package workflow.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: OsRuStepPO
 * @Description:OsRuStepPO
 * @author: gujb
 * @date: 2019年3月4日14:59:34
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class OsRuStepPO implements Serializable {

    private static final long serialVersionUID = -1;

    /**
     * ID
     */
    private Long id;

    /**
     * 流程实例ID
     */
    private String procInstId;

    /**
     * 步骤实例ID
     */
    private String stepInstId;

    /**
     * 步骤ID
     */
    private String stepId;

    /**
     * 步骤名称
     */
    private String stepName;

    /**
     * 步骤描述
     */
    private String stepDesc;

    /**
     * 所属者
     */
    private String owner;

    /**
     * 执行者
     */
    private String assignee;

    /**
     * 委托类型：PENDING/RESOLVED
     */
    private String delegation;

    /**
     * 步骤状态
     * ACTIVE：激活；
     * SUSPEND：挂起
     */
    private String status;

    /**
     * 流程定义ID
     */
    private String procDefId;

    /**
     * 流程定义KEY
     */
    private String procDefKey;

    /**
     * 流程定义名称
     */
    private String procDefName;

    /**
     * 到期时间
     */
    private Date dueTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 系统编号
     */
    private String sysCode;

    /**
     * 获取id
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取procInstId
     * @return procInstId
     */
    public String getProcInstId() {
        return procInstId;
    }

    /**
     * 设置procInstId
     * @param procInstId
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    /**
     * 获取stepInstId
     * @return stepInstId
     */
    public String getStepInstId() {
        return stepInstId;
    }

    /**
     * 设置stepInstId
     * @param stepInstId
     */
    public void setStepInstId(String stepInstId) {
        this.stepInstId = stepInstId;
    }

    /**
     * 获取stepId
     * @return stepId
     */
    public String getStepId() {
        return stepId;
    }

    /**
     * 设置stepId
     * @param stepId
     */
    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * 获取stepName
     * @return stepName
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * 设置stepName
     * @param stepName
     */
    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * 获取stepDesc
     * @return stepDesc
     */
    public String getStepDesc() {
        return stepDesc;
    }

    /**
     * 设置stepDesc
     * @param stepDesc
     */
    public void setStepDesc(String stepDesc) {
        this.stepDesc = stepDesc;
    }

    /**
     * 获取owner
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 设置owner
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * 获取assignee
     * @return assignee
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * 设置assignee
     * @param assignee
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /**
     * 获取delegation
     * @return delegation
     */
    public String getDelegation() {
        return delegation;
    }

    /**
     * 设置delegation
     * @param delegation
     */
    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }

    /**
     * 获取status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取procDefId
     * @return procDefId
     */
    public String getProcDefId() {
        return procDefId;
    }

    /**
     * 设置procDefId
     * @param procDefId
     */
    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    /**
     * 获取procDefKey
     * @return procDefKey
     */
    public String getProcDefKey() {
        return procDefKey;
    }

    /**
     * 设置procDefKey
     * @param procDefKey
     */
    public void setProcDefKey(String procDefKey) {
        this.procDefKey = procDefKey;
    }

    /**
     * 获取procDefName
     * @return procDefName
     */
    public String getProcDefName() {
        return procDefName;
    }

    /**
     * 设置procDefName
     * @param procDefName
     */
    public void setProcDefName(String procDefName) {
        this.procDefName = procDefName;
    }

    /**
     * 获取dueTime
     * @return dueTime
     */
    public Date getDueTime() {
        return dueTime;
    }

    /**
     * 设置dueTime
     * @param dueTime
     */
    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    /**
     * 获取createTime
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取updateTime
     * @return updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置updateTime
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取sysCode
     * @return sysCode
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 设置sysCode
     * @param sysCode
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    @Override
    public String toString() {
        return "OsRuStepPO{" +
                "id=" + id +
                ", procInstId='" + procInstId + '\'' +
                ", stepInstId='" + stepInstId + '\'' +
                ", stepId='" + stepId + '\'' +
                ", stepName='" + stepName + '\'' +
                ", stepDesc='" + stepDesc + '\'' +
                ", owner='" + owner + '\'' +
                ", assignee='" + assignee + '\'' +
                ", delegation='" + delegation + '\'' +
                ", status='" + status + '\'' +
                ", procDefId='" + procDefId + '\'' +
                ", procDefKey='" + procDefKey + '\'' +
                ", procDefName='" + procDefName + '\'' +
                ", dueTime=" + dueTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", sysCode='" + sysCode + '\'' +
                '}';
    }
}