package SpringContext.AnnotationAddBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        final Parrot bean = context.getBean("parrot",Parrot.class);
        System.out.println(bean.getName());

        final Parrot parrot2 = context.getBean("parrot2", Parrot.class);
        System.out.println(parrot2.getName());

        final String hello = context.getBean("hellow",String.class);
        System.out.println(hello);
        final String hi = context.getBean("hi",String.class);
        System.out.println(hi);

        final Integer q = context.getBean(Integer.class);
        System.out.println(q);
    }
}
