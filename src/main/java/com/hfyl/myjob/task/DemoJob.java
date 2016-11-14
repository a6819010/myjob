package com.hfyl.myjob.task;

import com.hfyl.myjob.util.Constants;
import com.youguu.core.logging.Log;
import com.youguu.core.logging.LogFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * job示例
 * @Title: DemoJob.java
 * @Package com.hfyl.myjob.task
 * @Description:
 * @author 徐云杰
 * @date 2015年10月23日 下午2:37:07
 * @version V1.0
 */
@Service("demoJob")
@EnableScheduling
@PropertySource("classpath:properties/jobConfig.properties")
public class DemoJob {

	private static Log logger = LogFactory.getLog(Constants.LOG_NAME);

	/**
	 * 货币job
	 * @Title: moneyJob
	 * @Description:
	 * void    返回类型
	 */
	@Scheduled(cron = "${demoJob}")
	public void demo()
	{
		System.out.println("---------------正在执行中");
	}

}
