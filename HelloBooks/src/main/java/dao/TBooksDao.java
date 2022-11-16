package dao;

import ssm.entity.TBooks;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (TBooks)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-07 21:25:47
 */
public interface TBooksDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TBooks queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param tBooks 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TBooks> queryAllByLimit(TBooks tBooks, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tBooks 查询条件
     * @return 总行数
     */
    long count(TBooks tBooks);

    /**
     * 新增数据
     *
     * @param tBooks 实例对象
     * @return 影响行数
     */
    int insert(TBooks tBooks);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TBooks> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TBooks> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TBooks> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TBooks> entities);

    /**
     * 修改数据
     *
     * @param tBooks 实例对象
     * @return 影响行数
     */
    int update(TBooks tBooks);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

