package example;

import java.util.function.Function;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Orchestration {

    @Bean
    public Function<String, String> flow1(){
        return s -> s;
    }

    @Bean
    public Function<String, String> flow2(){
        return s -> s;
    }

    @Bean
    public Function<String, String> flow3(){
        return s -> s;
    }
}
