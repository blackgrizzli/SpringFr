package SpringContext.AnnotationAddBean;

import org.springframework.stereotype.Component;


public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
