package .controller;

import .entity.TBooks;
import .service.TBooksService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TBooks)表控制层
 *
 * @author makejava
 * @since 2022-11-07 21:25:46
 */
@RestController
@RequestMapping("tBooks")
public class TBooksController {
    /**
     * 服务对象
     */
    @Resource
    private TBooksService tBooksService;

    /**
     * 分页查询
     *
     * @param tBooks 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TBooks>> queryByPage(TBooks tBooks, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tBooksService.queryByPage(tBooks, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TBooks> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tBooksService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tBooks 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TBooks> add(TBooks tBooks) {
        return ResponseEntity.ok(this.tBooksService.insert(tBooks));
    }

    /**
     * 编辑数据
     *
     * @param tBooks 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TBooks> edit(TBooks tBooks) {
        return ResponseEntity.ok(this.tBooksService.update(tBooks));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tBooksService.deleteById(id));
    }

}

