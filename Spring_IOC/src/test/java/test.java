import com.atzdy.spring.pojo.Clazz;
import com.atzdy.spring.pojo.HelloWorld;
import com.atzdy.spring.pojo.Student;
import com.atzdy.spring.pojo.Student01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/28 21:11
 * @Abstract：
 */
public class test {
    @Test
    public void testHelloWorld() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //HelloWorld bean = applicationContext.getBean(HelloWorld.class);
        //HelloWorld bean = (HelloWorld)applicationContext.getBean("HelloWorld");
        HelloWorld bean = applicationContext.getBean("HelloWorld", HelloWorld.class);
        bean.sayHello();
    }

    @Test
    public void testDIOne() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean(Student.class);
        System.out.println("student = " + student);
    }

    @Test
    public void testDITwo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentTwo = applicationContext.getBean("StudentTwo", Student.class);
        System.out.println("studentTwo = " + studentTwo);
    }

    @Test
    public void testDIThree() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentThree = applicationContext.getBean("StudentThree", Student.class);
        System.out.println("studentThree = " + studentThree);
    }

    @Test
    public void testDIFour() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentThree = applicationContext.getBean("StudentFour", Student.class);
        System.out.println("studentThree = " + studentThree);
    }

    @Test
    public void testDISix() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentThree = applicationContext.getBean("StudentSix", Student.class);
        System.out.println("studentThree = " + studentThree);
    }

    @Test
    public void testDISeven() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentSeven = applicationContext.getBean("StudentSeven", Student.class);
        System.out.println("studentSeven = " + studentSeven);
    }

    @Test
    public void testDIEight() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentEight = applicationContext.getBean("StudentEight", Student.class);
        System.out.println("studentEight = " + studentEight);
    }

    @Test
    public void testDINine() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazzTwo = applicationContext.getBean("ClazzTwo", Clazz.class);
        System.out.println("clazzTwo = " + clazzTwo);
    }

    @Test
    public void testDITen() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentTen = context.getBean("StudentTen", Student.class);
        System.out.println("studentTen = " + studentTen);
    }

    @Test
    public void test01() {
        //ConfigurableApplicationContext 是ApplicationContext的子接口，其中拓展了刷新和关闭容器的方法
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student01 bean = context.getBean(Student01.class);
        context.close();
    }

}
