package workflow.po;

import java.io.Serializable;

/**
 * @ClassName: OsRuIndentitylinkPO
 * @Description:OsRuIndentitylinkPO
 * @author: gujb
 * @date: 2019年3月4日14:59:34
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class OsRuIndentitylinkPO implements Serializable {

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
     * 用户ID
     */
    private String userId;

    /**
     * 用户类型
     */
    private String userType;

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
     * 获取userId
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取userType
     * @return userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置userType
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
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
        return "OsRuIndentitylinkPO{" +
                "id=" + id +
                ", procInstId='" + procInstId + '\'' +
                ", stepInstId='" + stepInstId + '\'' +
                ", stepId='" + stepId + '\'' +
                ", userId='" + userId + '\'' +
                ", userType='" + userType + '\'' +
                ", sysCode='" + sysCode + '\'' +
                '}';
    }
}