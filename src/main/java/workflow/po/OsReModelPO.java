package workflow.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: OsReModelPO
 * @Description:OsReModelPO
 * @author: gujb
 * @date: 2019年3月4日14:59:34
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class OsReModelPO implements Serializable {

    private static final long serialVersionUID = -1;

    /**
     * ID
     */
    private Long id;

    /**
     * 模板ID
     */
    private String modelId;

    /**
     * 模板名称
     */
    private String modelName;

    /**
     * 模板版本
     */
    private Integer modelVer;

    /**
     * 图片资源ID
     */
    private String resPicId;

    /**
     * 文件资源ID
     */
    private String resFileId;

    /**
     * 流程定义ID
     */
    private String procDefId;

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
     * 模板描述
     */
    private String modelDesc;

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
     * 获取modelId
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 设置modelId
     * @param modelId
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * 获取modelName
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * 设置modelName
     * @param modelName
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * 获取modelVer
     * @return modelVer
     */
    public Integer getModelVer() {
        return modelVer;
    }

    /**
     * 设置modelVer
     * @param modelVer
     */
    public void setModelVer(Integer modelVer) {
        this.modelVer = modelVer;
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

    /**
     * 获取modelDesc
     * @return modelDesc
     */
    public String getModelDesc() {
        return modelDesc;
    }

    /**
     * 设置modelDesc
     * @param modelDesc
     */
    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
    }

    @Override
    public String toString() {
        return "OsReModelPO{" +
                "id=" + id +
                ", modelId='" + modelId + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelVer=" + modelVer +
                ", resPicId='" + resPicId + '\'' +
                ", resFileId='" + resFileId + '\'' +
                ", procDefId='" + procDefId + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", sysCode='" + sysCode + '\'' +
                ", modelDesc='" + modelDesc + '\'' +
                '}';
    }
}