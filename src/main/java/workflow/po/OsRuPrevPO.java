package workflow.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: OsRuPrevPO
 * @Description:OsRuPrevPO
 * @author: gujb
 * @date: 2019年3月4日14:59:34
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class OsRuPrevPO implements Serializable {

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
     * 前步骤ID
     * 无前步骤：-999
     */
    private String lastStepId;

    /**
     * 开始步骤ID
     */
    private String startStepId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 系统编码
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
     * 获取lastStepId
     * @return lastStepId
     */
    public String getLastStepId() {
        return lastStepId;
    }

    /**
     * 设置lastStepId
     * @param lastStepId
     */
    public void setLastStepId(String lastStepId) {
        this.lastStepId = lastStepId;
    }

    /**
     * 获取startStepId
     * @return startStepId
     */
    public String getStartStepId() {
        return startStepId;
    }

    /**
     * 设置startStepId
     * @param startStepId
     */
    public void setStartStepId(String startStepId) {
        this.startStepId = startStepId;
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
        return "OsRuPrevPO{" +
                "id=" + id +
                ", procInstId='" + procInstId + '\'' +
                ", stepInstId='" + stepInstId + '\'' +
                ", stepId='" + stepId + '\'' +
                ", lastStepId='" + lastStepId + '\'' +
                ", startStepId='" + startStepId + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", sysCode='" + sysCode + '\'' +
                '}';
    }
}