package ch12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// 인식할수있게 코딩을 해야함 

@Target({ElementType.METHOD}) //method대상으로 //적용 대상
@Retention(RetentionPolicy.RUNTIME) // 컴파일된후 없어짐 // 메모리에서사라지면 사용할수없고 종류가 있다 
public @interface PrintAnnotation {
	// 필드에서 
	String value() default "-";
	int number() default 15;
}