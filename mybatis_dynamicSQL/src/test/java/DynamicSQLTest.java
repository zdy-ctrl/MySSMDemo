import com.atzdy.mybatis.mapper.DynamicSQLMapper;
import com.atzdy.mybatis.pojo.Emp;
import com.atzdy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/25 20:10
 * @Abstract：
 */
public class DynamicSQLTest {

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"张三",20,"男");
        List<Emp> emps = mapper.getEmpByCondition(emp);
        emps.forEach(System.out::println);
    }

    @Test
    public void testGetEmpByConditionTwo() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"张三",20,"男");
        List<Emp> emps = mapper.getEmpByConditionTwo(emp);
        emps.forEach(System.out::println);
    }

}
