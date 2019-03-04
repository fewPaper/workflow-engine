package workflow.dao;

import workflow.po.OsHiIndentitylinkPO;

import java.util.List;

/**
 * @ClassName:  OsHiIndentitylinkMapper
 * @Description:运行时人员关系表DAO
 * @author: gujb
 * @date:   2019年3月4日16:55:51
 *
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public interface OsHiIndentitylinkMapper {

    /**
     *
     * 描述: 查询全表
     * @param:  po
     * @return: List<OsHiIndentitylinkPO>
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    List<OsHiIndentitylinkPO> selectAll();

    /**
     *
     * 描述: 删除单条数据
     * @param:  id
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * 描述: 插入单条数据
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int insert(OsHiIndentitylinkPO record);

    /**
     *
     * 描述: 插入单条数据（可选择的）
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int insertSelective(OsHiIndentitylinkPO record);

    /**
     *
     * 描述: 查询单条数据
     * @param:  id
     * @return: OsHiIndentitylinkPO
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    OsHiIndentitylinkPO selectByPrimaryKey(Long id);

    /**
     *
     * 描述: 更新单条数据（可选择的）
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int updateByPrimaryKeySelective(OsHiIndentitylinkPO record);

    /**
     *
     * 描述: 更新单条数据
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int updateByPrimaryKey(OsHiIndentitylinkPO record);
}