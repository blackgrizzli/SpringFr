package SpringContext.StereotipAddBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot bean = context.getBean(Parrot.class);
        System.out.println(bean); // Выдаст Parrot{name='null'}
        System.out.println(bean.getName()); // Выдаст null , так как мы не задавали имя
    }
}
