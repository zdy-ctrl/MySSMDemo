/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/3 10:50
 * @Abstract：
 */
public class TestDemo {
    String name;
    static {
        System.out.println("这是静态代码块");
    }
    {
        this.name = "tom";
        System.out.println("这是构造代码块");
    }
}
