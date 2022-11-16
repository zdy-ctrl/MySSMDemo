package .service.impl;

import .entity.TBooks;
import .dao.TBooksDao;
import .service.TBooksService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TBooks)表服务实现类
 *
 * @author makejava
 * @since 2022-11-07 21:25:51
 */
@Service("tBooksService")
public class TBooksServiceImpl implements TBooksService {
    @Resource
    private TBooksDao tBooksDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TBooks queryById(Integer id) {
        return this.tBooksDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param tBooks 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TBooks> queryByPage(TBooks tBooks, PageRequest pageRequest) {
        long total = this.tBooksDao.count(tBooks);
        return new PageImpl<>(this.tBooksDao.queryAllByLimit(tBooks, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tBooks 实例对象
     * @return 实例对象
     */
    @Override
    public TBooks insert(TBooks tBooks) {
        this.tBooksDao.insert(tBooks);
        return tBooks;
    }

    /**
     * 修改数据
     *
     * @param tBooks 实例对象
     * @return 实例对象
     */
    @Override
    public TBooks update(TBooks tBooks) {
        this.tBooksDao.update(tBooks);
        return this.queryById(tBooks.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tBooksDao.deleteById(id) > 0;
    }
}
