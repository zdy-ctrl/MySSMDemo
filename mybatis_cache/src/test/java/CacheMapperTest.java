import com.atzdy.mybatis.mapper.CacheMapper;
import com.atzdy.mybatis.pojo.Emp;
import com.atzdy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/26 20:37
 * @Abstract：
 */
public class CacheMapperTest {
    @Test
    public void testGetById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp empById = mapper.getEmpById(1);
        System.out.println("empById = " + empById);
        Emp empById1 = mapper.getEmpById(1);
        System.out.println("empById1 = " + empById1);

    }
}
