import com.atzdy.mybatis.mapper.DeptMapper;
import com.atzdy.mybatis.mapper.EmpMapper;
import com.atzdy.mybatis.pojo.Dept;
import com.atzdy.mybatis.pojo.Emp;
import com.atzdy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/23 17:10
 * @Abstract：
 */
public class ResultMapTest {
    @Test
    public void testGetEmpByEmpByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpByEmpId(1);
        System.out.println("empByEmpId = " + empByEmpId);
    }

    @Test
    public void testGetEmpAndDeptByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp deptByEmpId = mapper.getEmpAndDeptByEmpId(1);
        System.out.println("deptByEmpId = " + deptByEmpId);
    }

    @Test
    public void testGetEmpAndDeptByStepOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByStepOne = mapper.getEmpAndDeptByStepOne(1);
        System.out.println(empAndDeptByStepOne.getEmpName());
    }

    @Test
    public void testGetDeptAndEmpByDeptId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        System.out.println("deptAndEmpByDeptId = " + deptAndEmpByDeptId);
    }
    @Test
    public void testGetDeptAndEmpByStep() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByStepOne = mapper.getDeptAndEmpByStepOne(1);
        System.out.println("deptAndEmpByDeptId = " + deptAndEmpByStepOne);
    }
}
