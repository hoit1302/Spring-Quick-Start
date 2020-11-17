package com.hoit1302;
// @SpringBootApplication 어노테이션이 붙은 main application은 최상위 package에 존재하는 것이 좋다. 아니, 필수이다.
// 하위 패키지를 뒤져서 componentScan, bean을 등록하기에 적절한 위치 선정이 중요

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

//    spring boot에서 빈을 등록할 땐 2가지인데
//    componentscan이 먼저 되고
//    그 다음에 autoconfiguration으로 빈을 등록
//    이 예제에서는 덮어쓰였기 때문에 아래의 값이 출력되지 않음

//    내가 원하는 대로 직접 빈을 등록한 것이 보이기 위해서는 자동설정 파일에 @ConditionalOnMissingBean 등록

//    @Bean
//    public Holoman holoman() {
//        Holoman holoman = new Holoman();
//        holoman.setName("hoit1302");;
//        holoman.setHowLong(60);
//        return holoman;
//    }

//    그래 이제 내가 등록한 빈이 우선시 되는 것은 좋아. 근데 일일이 내가 빈 설정을 장황하게 해야하는가?
//    나는 두 값만 쓰면 되는데. resources -> application.properties에 원하는 값을 쓰고 HolomanProperties 클래스 정의,
//    @Configuration 파일에서 @EnableConfigurationProperties(HolomanProperties.class)으로 빈 등록 시 
//    properties 값 사용
}
