package SpringContext.AnnotationAddBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Coco");
        return p;
    }
    // Указываем имя метода в первый параметр метода getBean()
    // Или используем пометку в аннотации @Bean(name = "идентификатор")
    // context.getBean("parrot2",Parrot.class);
    @Bean
    @Primary // Указывает на первичный дефолтный бин, все вызовы getBean() данного объекта будут выдавать " pops "
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("pops");
        return p;
    }

    @Bean
    String hellow() {
        return "hellow";
    }

    @Bean(name = "hi")
    String hi() {
        return "hi";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
