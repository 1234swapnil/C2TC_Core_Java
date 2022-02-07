
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface smartTV {
String brand() default"panasonic";
int screensize() default 108;
}
