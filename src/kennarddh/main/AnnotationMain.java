package kennarddh.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Fancy {
    String name();

    String[] tags() default {};
}

@Fancy(name = "Fancy name", tags = {"tag"})
public class AnnotationMain {
    public static void main(String[] args) {

    }
}
