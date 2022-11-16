package generator.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import generator.domain.TBooks;
import generator.service.TBooksService;
import generator.mapper.TBooksMapper;
import org.springframework.stereotype.Service;

/**
* @author 18124
* @description 针对表【t_books】的数据库操作Service实现
* @createDate 2022-11-07 21:25:01
*/
@Service
public class TBooksServiceImpl extends ServiceImpl<TBooksMapper, TBooks>
implements TBooksService{

}
