import com.sky.mapper.StudentMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Haojie.Wang
 * @Description:
 * @CreateDate: 2018/5/15 20:03
 * @Version: 1.0
 */
public class ServiceTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-dao.xml");

    }
}
