package workflow.dao;

import workflow.po.OsHiStepPO;

import java.util.List;

/**
 * @ClassName:  OsHiStepMapper
 * @Description:历史步骤实例表DAO
 * @author: gujb
 * @date:   2019年3月4日16:55:51
 *
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public interface OsHiStepMapper {

    /**
     *
     * 描述: 查询全表
     * @param:  po
     * @return: List<OsHiStepPO>
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    List<OsHiStepPO> selectAll();

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
    int insert(OsHiStepPO record);

    /**
     *
     * 描述: 插入单条数据（可选择的）
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int insertSelective(OsHiStepPO record);

    /**
     *
     * 描述: 查询单条数据
     * @param:  id
     * @return: OsHiStepPO
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    OsHiStepPO selectByPrimaryKey(Long id);

    /**
     *
     * 描述: 更新单条数据（可选择的）
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int updateByPrimaryKeySelective(OsHiStepPO record);

    /**
     *
     * 描述: 更新单条数据
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int updateByPrimaryKey(OsHiStepPO record);
}