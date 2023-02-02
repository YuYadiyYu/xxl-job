package com.xxl.job.executor.test;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.executor.service.jobhandler.SampleXxlJob;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
public class XxlJobExecutorExampleBootApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(XxlJobExecutorExampleBootApplicationTests.class);
	@Test
	public void test() {
		System.out.println(11);
	}

}