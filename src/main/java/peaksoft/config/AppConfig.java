package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Wood3 wood3(Rabbit4 rabbit){
        return new Wood3(rabbit);
    }

    @Bean
    public static Rabbit4 rabbit4(Duck5 duck){
        return new Rabbit4(duck);
    }

    @Bean
    public static Duck5 duck5(Egg6 egg){
        return new Duck5(egg);
    }

    @Bean
    public static Egg6 egg6(Needle7 needle){
        return new Egg6(needle);
    }
    @Bean
    public static Needle7 needle7(){
        return new Needle7();
    }
    @Bean
    public static Deth8 deth8(){
        return new Deth8();
    }
}