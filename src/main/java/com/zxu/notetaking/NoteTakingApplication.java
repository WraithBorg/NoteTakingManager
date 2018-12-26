package com.zxu.notetaking;

import com.zxu.util.MyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//启注解事务管理
@EnableTransactionManagement  // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@MapperScan(basePackages = "com.zxu.notetaking.dao", markerInterface = MyMapper.class)
public class NoteTakingApplication  extends SpringBootServletInitializer {
	/**
	 *
	 * @param application
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NoteTakingApplication.class);
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NoteTakingApplication.class, args);
	}

}

