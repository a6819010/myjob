package jobtest;

import com.hfyl.myjob.main.Main;
import com.hfyl.myjob.task.DemoJob;
import com.youguu.core.util.RedisUtil;
import com.youguu.core.util.redis.RedisPool;
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
        RedisPool rp =  RedisUtil.getRedisPool("capture");
        //rp.hset("source","commodity","master");
        rp.hset("source_url","master_url","http://hq2gjqh.eastmoney.com/EM_Futures2010NumericApplication/index.aspx?type=z&jsName=quote_future&sortType=A&sortRule=1&jsSort=1&ids=CONZ0,GLNZ0,LCPS0,SBCX0,CRCZ0,WHCZ0,SMCZ0,SOCZ0,CTNZ0,HONZ0,LALS0,LZNS0,LTNS0,LNKS0,LLDS0,RBTH0,SBCC0,SMCC0,SOCC0,WHCC0,SGNC0,SFNC0,CTNC0,CRCC0,CCNC0,CFNC0,GLNC0,CONC0,HONC0,RBTC0,OILC0&_g=0.7117227672133595");
    }



}
