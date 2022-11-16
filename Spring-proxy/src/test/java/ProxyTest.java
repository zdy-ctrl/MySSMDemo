import com.atzdy.spring.proxy.Calculator;
import com.atzdy.spring.proxy.CalculatorImpl;
import com.atzdy.spring.proxy.CalculatorStaticProxy;
import com.atzdy.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/5 10:40
 * @Abstract：
 */
public class ProxyTest {
    /**
     * 动态代理有两种
     * 1，JDK动态代理：要求必须有接口，最终生成的代理类和目标类实现相同的接口
     * 在com.sun.proxy包下，类名为$proxy2
     * 2.cglib动态代理:最终生成的代理类会继承目标类，并且和目标类在相同的包下
     * */
    @Test
    public void ProxyStaticTest() {
        CalculatorStaticProxy staticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        staticProxy.add(1, 2);
    }

    @Test
    public void ProxyTest() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 0);
    }
}
