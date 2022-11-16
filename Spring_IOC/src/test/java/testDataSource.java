import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/2 15:48
 * @Abstract：
 */
public class testDataSource {

    @Test
    public void tesData() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("DataSource.xml");
        DataSource dataSource = ac.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);
    }
}
