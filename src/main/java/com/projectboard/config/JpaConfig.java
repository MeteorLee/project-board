package com.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig{

    @Bean
    public AuditorAware<String> auditorAware() {
        // 현재 생성, 수정하는 사람은 "HoSng"로 고정됨
        return () -> Optional.of("HoSng"); // TODO: 2024-04-09 : 스프링 시큐리티로 인증 기능을 붙이게 될 때 수정하자
    }
}
