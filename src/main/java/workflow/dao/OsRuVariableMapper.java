package workflow.dao;

import workflow.po.OsRuVariablePO;

import java.util.List;

/**
 * @ClassName:  OsRuVariableMapper
 * @Description:运行时参数表DAO
 * @author: gujb
 * @date:   2019年3月4日16:55:51
 *
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved.
 * 注意：本内容仅限于北京天源迪科信息技术股份有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public interface OsRuVariableMapper {

    /**
     *
     * 描述: 查询全表
     * @param:  po
     * @return: List<OsRuStepPO>
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    List<OsRuVariablePO> selectAll();

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
    int insert(OsRuVariablePO record);

    /**
     *
     * 描述: 插入单条数据（可选择的）
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int insertSelective(OsRuVariablePO record);

    /**
     *
     * 描述: 查询单条数据
     * @param:  id
     * @return: OsRuVariablePO
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    OsRuVariablePO selectByPrimaryKey(Long id);

    /**
     *
     * 描述: 更新单条数据（可选择的）
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int updateByPrimaryKeySelective(OsRuVariablePO record);

    /**
     *
     * 描述: 更新单条数据
     * @param:  po
     * @return: int
     * @throws
     * @author: gujb
     * @date:   2019年3月4日16:55:51
     */
    int updateByPrimaryKey(OsRuVariablePO record);
}