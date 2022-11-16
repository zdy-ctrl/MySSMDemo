package .service;

import .entity.TBooks;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TBooks)表服务接口
 *
 * @author makejava
 * @since 2022-11-07 21:25:51
 */
public interface TBooksService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TBooks queryById(Integer id);

    /**
     * 分页查询
     *
     * @param tBooks 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TBooks> queryByPage(TBooks tBooks, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tBooks 实例对象
     * @return 实例对象
     */
    TBooks insert(TBooks tBooks);

    /**
     * 修改数据
     *
     * @param tBooks 实例对象
     * @return 实例对象
     */
    TBooks update(TBooks tBooks);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
