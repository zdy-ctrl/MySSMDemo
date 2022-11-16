import com.atzdy.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/4 13:34
 * @Abstract：
 */
public class AutowireByXMLTest {

    /**
    * 自动装配：
     * 根据指定的策略，在IOC容器中匹配某个bean
    * */
    @Test
    public void testAutoWire() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
