package java200.ex01.day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class day14_1 {

	public static void main(String[] args) {
		Object obj1=new Object();
		Class classes=obj1.getClass();
		System.out.println(classes.getName());
		System.out.println("---constructor---");
		Constructor[] constructor= classes.getDeclaredConstructors();
		for(Constructor con: constructor) {
			System.out.println(con.getName());
		}
		System.out.println("---method");
		Method[] method=classes.getMethods();
		for(Method me:method) {
			System.out.println(me.getName());
		}
	}

}
