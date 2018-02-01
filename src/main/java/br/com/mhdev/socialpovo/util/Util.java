package br.com.mhdev.socialpovo.util;

public class Util {

	public static boolean equals(Object obj1, Object obj2){
		return obj1 == obj2;
	}
	
	
	public static boolean isEmpty(Object obj){
		if(equals(obj,"")) return true;
		if(obj == null) return true;
		return false;
	}
	
	
}
