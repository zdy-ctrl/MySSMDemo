import com.atzdy.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/3 16:37
 * @Abstract：
 */
public class FactoryBeanTest {

    @Test
    public void testFactoryBean() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-factory.xml");
        User bean = ioc.getBean(User.class);
        System.out.println("bean = " + bean);
    }


}
