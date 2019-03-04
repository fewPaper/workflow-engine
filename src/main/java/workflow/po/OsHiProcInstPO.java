package workflow.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: OsHiProcInstPO
 * @Description:OsHiProcInstPO
 * @author: gujb
 * @date: 2019年3月4日14:59:34
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class OsHiProcInstPO implements Serializable {

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
     * 业务ID
     */
    private String businessId;

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
     * 图片资源ID
     */
    private String resPicId;

    /**
     * 文件资源ID
     */
    private String resFileId;

    /**
     * 开始步骤ID
     */
    private String startStepId;

    /**
     * 结束步骤ID
     */
    private String endStepId;

    /**
     * 流程实例名称
     */
    private String procInstName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 系统编码
     */
    private String sysCode;

    /**
     * 结束类型
     */
    private String finishType;

    /**
     * 结束时间
     */
    private Date finishTime;

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
     * 获取businessId
     * @return businessId
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 设置businessId
     * @param businessId
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
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
     * 获取resPicId
     * @return resPicId
     */
    public String getResPicId() {
        return resPicId;
    }

    /**
     * 设置resPicId
     * @param resPicId
     */
    public void setResPicId(String resPicId) {
        this.resPicId = resPicId;
    }

    /**
     * 获取resFileId
     * @return resFileId
     */
    public String getResFileId() {
        return resFileId;
    }

    /**
     * 设置resFileId
     * @param resFileId
     */
    public void setResFileId(String resFileId) {
        this.resFileId = resFileId;
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
     * 获取endStepId
     * @return endStepId
     */
    public String getEndStepId() {
        return endStepId;
    }

    /**
     * 设置endStepId
     * @param endStepId
     */
    public void setEndStepId(String endStepId) {
        this.endStepId = endStepId;
    }

    /**
     * 获取procInstName
     * @return procInstName
     */
    public String getProcInstName() {
        return procInstName;
    }

    /**
     * 设置procInstName
     * @param procInstName
     */
    public void setProcInstName(String procInstName) {
        this.procInstName = procInstName;
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

    /**
     * 获取finishType
     * @return finishType
     */
    public String getFinishType() {
        return finishType;
    }

    /**
     * 设置finishType
     * @param finishType
     */
    public void setFinishType(String finishType) {
        this.finishType = finishType;
    }

    /**
     * 获取finishTime
     * @return finishTime
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置finishTime
     * @param finishTime
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "OsHiProcInstPO{" +
                "id=" + id +
                ", procInstId='" + procInstId + '\'' +
                ", businessId='" + businessId + '\'' +
                ", procDefId='" + procDefId + '\'' +
                ", procDefKey='" + procDefKey + '\'' +
                ", procDefName='" + procDefName + '\'' +
                ", resPicId='" + resPicId + '\'' +
                ", resFileId='" + resFileId + '\'' +
                ", startStepId='" + startStepId + '\'' +
                ", endStepId='" + endStepId + '\'' +
                ", procInstName='" + procInstName + '\'' +
                ", createTime=" + createTime +
                ", sysCode='" + sysCode + '\'' +
                ", finishType='" + finishType + '\'' +
                ", finishTime=" + finishTime +
                '}';
    }
}