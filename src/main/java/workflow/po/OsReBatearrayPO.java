package workflow.po;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName: OsReBatearrayPO
 * @Description:OsReBatearrayPO
 * @author: gujb
 * @date: 2019年3月4日14:59:34
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class OsReBatearrayPO implements Serializable {

    private static final long serialVersionUID = -1;

    /**
     * ID
     */
    private Long id;

    /**
     * 资源ID
     */
    private String resId;

    /**
     * 资源名称
     */
    private String resName;

    /**
     * 资源文件
     */
    private Byte[] resFile;

    /**
     * 资源类型
     * 文件：FILE
     * 图片：PIC
     * json：JSON
     * 序列化bean：BEAN
     */
    private String resType;

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
     * 获取resId
     * @return resId
     */
    public String getResId() {
        return resId;
    }

    /**
     * 设置resId
     * @param resId
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * 获取resName
     * @return resName
     */
    public String getResName() {
        return resName;
    }

    /**
     * 设置resName
     * @param resName
     */
    public void setResName(String resName) {
        this.resName = resName;
    }

    /**
     * 获取resFile
     * @return resFile
     */
    public Byte[] getResFile() {
        return resFile;
    }

    /**
     * 设置resFile
     * @param resFile
     */
    public void setResFile(Byte[] resFile) {
        this.resFile = resFile;
    }

    /**
     * 获取resType
     * @return resType
     */
    public String getResType() {
        return resType;
    }

    /**
     * 设置resType
     * @param resType
     */
    public void setResType(String resType) {
        this.resType = resType;
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
        return "OsReBatearrayPO{" +
                "id=" + id +
                ", resId='" + resId + '\'' +
                ", resName='" + resName + '\'' +
                ", resFile=" + Arrays.toString(resFile) +
                ", resType='" + resType + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", sysCode='" + sysCode + '\'' +
                '}';
    }
}