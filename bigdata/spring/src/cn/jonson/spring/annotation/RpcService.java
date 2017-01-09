package cn.jonson.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

import org.springframework.stereotype.Component;

@Target({ElementType.TYPE}) //类上加注解
@Retention(RetentionPolicy.RUNTIME) //注解存在的时期， 这里运行期也保留
@Component //spring 扫描用
public @interface RpcService {
	String value();
}
