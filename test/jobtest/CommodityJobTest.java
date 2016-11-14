package jobtest;

import com.hfyl.myjob.main.Main;
import com.hfyl.myjob.task.DemoJob;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 类说明：
 * Created by xuyunjie on 2015/10/26.
 */
public class CommodityJobTest {

    static ApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
    DemoJob job = ctx.getBean("commodityJob",DemoJob.class);

    @Test
    public void testColdUserJob() {
        job.demo();
    }

    @Test
    public void testSetRedis()
    {
    }



}
