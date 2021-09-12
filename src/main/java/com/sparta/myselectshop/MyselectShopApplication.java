package com.sparta.myselectshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication // 스프링 부트임을 선언함
@EnableJpaAuditing // 시간 자동 변경이 가능하도록 합니다.
public class MyselectShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyselectShopApplication.class, args);
	}

}
