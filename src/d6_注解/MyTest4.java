package d6_注解;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD}) //限制注解的使用，只能在类和成员方法上
public @interface MyTest4 {
    String value();
    double aaa() default 100;
    String[] bbb();
}
