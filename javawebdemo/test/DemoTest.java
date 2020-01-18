import com.itdr.pojo.Users;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class DemoTest {

    @Test
    public void test1() throws SQLException {
        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

        Users query = qr.query("select * from users where id = ?", new BeanHandler<Users>(Users.class), 1);
        System.out.println(query.getUsername());
    }
}
