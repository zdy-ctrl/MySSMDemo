import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/11/6 13:55
 * @Abstract：
 */

public class test01 {
    @Test
    public void testDemo() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.通过驱动管理器加载驱动
        String url = "jdbc:mysql://localhost:3306/fruitDB?serverTimezone=GMT%2B8&useSSL=false";
        String user = "root";
        String pwd = "123456";
        Connection conn = DriverManager.getConnection(url, user, pwd);
        System.out.println("conn = " + conn);
    }
}
