package java200.ex01.day16;

import java.lang.reflect.Method;

public class day16_1 {
	public static String toModi(int n) {
		String s="";
		switch(n) {
		case 0:s="";break;
		case 1:s="public"; break;
		case 2:s="private"; break;
		case 4:s="protected"; break;
		case 8:s="static"; break;
		case 10:s="private static"; break;
		case 9: 
		case 137: s="public static";break;
		case 17 : s="public final"; break;
		case 257 : s="public native";break;
		case 260 : s="protected native"; break;
		case 273: s="public final native"; break;
		default: s="xxxxx"; break;
		}
		return s;
	}
	public static String teRe(String msg) {
		String s="";
		if(msg.indexOf("[")!=-1) {
			if(msg.contains("[C")) {
				s=msg.substring(msg.indexOf("")+1).trim();
				s=s.replace("[C","char[]");
			}else if(msg.contains("[L")) {
				s=msg.substring(msg.indexOf("")+1).trim();
				s=s.replace("[L", "").replace(";", "");
				s=s.concat("[]");
			}else if(msg.contains("[B")) {
				s=msg.substring(msg.indexOf("")+1).trim();
				s=s.replace("[B", "byte[]");
			}
		}else if(msg.indexOf("")!=-1){
			s=msg.substring(msg.indexOf("")+1).trim();
			
		}else {
			s=msg.trim();
		}
		return s;
	}
	public static void main(String[]args) {
		Object obj1=new Object();
		try {
			Class classes=Class.forName("java.lang.String");
			System.out.println("----------Method ã��-----------");
			Method[]mes=classes.getDeclaredMethods();
			for(Method me:mes) {
				if(me.getModifiers()>4000) {continue;}
				System.out.printf("%s\t\t",toModi(me.getModifiers()));
				System.out.printf("%-30s\t\t",toRe(me.getReturnType().toString()));
				System.out.printf("%s");
			}
			
		}
	}
}
