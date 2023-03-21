package SpringContext.StereotipAddBean;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
