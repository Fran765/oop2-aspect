package eje2.dominio;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EnDiscoRegistracionAspect {

	@After(value = "execution(* eje2.dominio.**.insultarA*(..))")
	public void registrar(JoinPoint joinPoint) {
		

		System.out.println("francisco martin");

	}

}
