package example;

import java.util.function.Function;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Functions {

    @Bean
    public Function<String, String> uppercase() {
        System.err.println("--------- UPPERCASE -----------");
        return String::toUpperCase;
    }

    @Bean
    public Function<String, String> duplicate() {
        System.err.println("--------- DUPLICATE -----------");
        return value -> value + value;
    }

    @Bean
    public Function<String, String> exclamation() {
        System.err.println("--------- EXCLAMATION! -----------");
        return value -> value + "!";
    }

    @Bean
    public Function<String, String> reverse() {
        System.err.println("--------- REVERSE! -----------");
        return value -> {
            StringBuilder input1 = new StringBuilder();

            // append a string into StringBuilder input1
            input1.append(value);

            // reverse StringBuilder input1
            return input1.reverse().toString();
        };
    }
}
