package kennarddh.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface NotBlank {
}

class User {
    @NotBlank
    public String username;

    @NotBlank
    private String password = "a";
}

class ReflectionMain {
    public static void main(String[] args) {
        User user = new User();

        user.username = "A";

        validate(user);
    }

    public static void validate(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new RuntimeException("Field " + field.getName() + " is blank.");
                    }
                } catch (IllegalAccessException exception) {
                    throw new RuntimeException(exception);
                }
            }
        }
    }
}