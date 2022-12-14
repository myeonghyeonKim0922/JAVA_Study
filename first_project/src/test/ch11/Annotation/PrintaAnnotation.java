package test.ch11.Annotation;

import java.lang.annotation.*;

//어노테이션 정의

//@Target: 어노테이션을 사용할 수 있는 곳을 지정
//@Target({ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.TYPE})
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintaAnnotation {
	String value() default "-";
	int number() default 15;
}
