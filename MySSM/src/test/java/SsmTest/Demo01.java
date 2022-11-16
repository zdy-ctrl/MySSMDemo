package SsmTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/30 20:36
 * @Abstract：
 */

public class Demo01 {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);
    }
}
