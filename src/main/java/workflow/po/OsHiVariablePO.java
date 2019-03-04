package workflow.po;

import java.io.Serializable;

/**
 * @ClassName: OsHiVariablePO
 * @Description:OsHiVariablePO
 * @author: gujb
 * @date: 2019年3月4日14:59:34
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class OsHiVariablePO implements Serializable {

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
     * 参数描述
     */
    private String paramDesc;

    /**
     * 参数名称
     */
    private String paramName;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 参数类型
     */
    private String paramType;

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
     * 获取tepInstId
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
     * 获取paramDesc
     * @return paramDesc
     */
    public String getParamDesc() {
        return paramDesc;
    }

    /**
     * 设置paramDesc
     * @param paramDesc
     */
    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }

    /**
     * 获取paramName
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * 设置paramName
     * @param paramName
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * 获取paramValue
     * @return paramValue
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * 设置paramValue
     * @param paramValue
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    /**
     * 获取paramType
     * @return paramType
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * 设置paramType
     * @param paramType
     */
    public void setParamType(String paramType) {
        this.paramType = paramType;
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
        return "OsHiVariablePO{" +
                "id=" + id +
                ", procInstId='" + procInstId + '\'' +
                ", stepInstId='" + stepInstId + '\'' +
                ", stepId='" + stepId + '\'' +
                ", paramDesc='" + paramDesc + '\'' +
                ", paramName='" + paramName + '\'' +
                ", paramValue='" + paramValue + '\'' +
                ", paramType='" + paramType + '\'' +
                ", sysCode='" + sysCode + '\'' +
                '}';
    }
}