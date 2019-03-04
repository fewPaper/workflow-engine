package workflow.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: OsReProcdefPO
 * @Description:OsReProcdefPO
 * @author: gujb
 * @date: 2019年3月4日14:59:34
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class OsReProcdefPO implements Serializable {

    private static final long serialVersionUID = -1;

    /**
     * ID
     */
    private Long id;

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
     * 流程描述
     */
    private String procDesc;

    /**
     * 流程版本
     */
    private Integer procVer;

    /**
     * 图片资源ID
     */
    private String resPicId;

    /**
     * 文件资源ID
     */
    private String resFileId;

    /**
     * 流程模板状态
     * ACTIVE：激活；
     * SUSPEND：挂起
     */
    private String status;

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
     * 获取procDesc
     * @return procDesc
     */
    public String getProcDesc() {
        return procDesc;
    }

    /**
     * 设置procDesc
     * @param procDesc
     */
    public void setProcDesc(String procDesc) {
        this.procDesc = procDesc;
    }

    /**
     * 获取procVer
     * @return procVer
     */
    public Integer getProcVer() {
        return procVer;
    }

    /**
     * 设置procVer
     * @param procVer
     */
    public void setProcVer(Integer procVer) {
        this.procVer = procVer;
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
        return "OsReProcdefPO{" +
                "id=" + id +
                ", procDefId='" + procDefId + '\'' +
                ", procDefKey='" + procDefKey + '\'' +
                ", procDefName='" + procDefName + '\'' +
                ", procDesc='" + procDesc + '\'' +
                ", procVer=" + procVer +
                ", resPicId='" + resPicId + '\'' +
                ", resFileId='" + resFileId + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", sysCode='" + sysCode + '\'' +
                '}';
    }
}