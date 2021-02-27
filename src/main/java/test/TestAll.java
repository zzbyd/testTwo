package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import scopeDaoImpl.scopeDaoImpl;
import scopeServiceImpl.scopeServiceImpl;

public class TestAll {
public static void main(String[] args) {
	AnnotationConfigApplicationContext contx = new AnnotationConfigApplicationContext(testScpde.class);
	scopeDaoImpl s = contx.getBean(scopeDaoImpl.class);
	s.setName("1235");
	System.out.println(s.getName());
	
	scopeDaoImpl ss = contx.getBean(scopeDaoImpl.class);
	System.out.println(ss.getName()+"--->");
	
	
	scopeServiceImpl o = contx.getBean(scopeServiceImpl.class);
	o.setName("58");
	System.out.println(o.getName());
	
	scopeServiceImpl os = contx.getBean(scopeServiceImpl.class);
	System.out.println(os.getName()+"====");
}
}
