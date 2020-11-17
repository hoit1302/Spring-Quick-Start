package com.hoit1302;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// Application에서 빈 등록을 안하면(주석처리해둠) auto configuration 여기에서 빈을 등록함
@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {
    @Bean
    @ConditionalOnMissingBean // 이 타입의 빈이 없을 때만 아래의 빈을 등록해라
    public Holoman holoman(HolomanProperties properties){ // HolomanProperties를 주입을 받아서 사용
        Holoman holoman = new Holoman();
        holoman.setHowLong(properties.getHowLong());
        holoman.setName(properties.getName());
        return holoman;
    }
}
