package com.lab9;

import java.util.function.Consumer;



public class Ex2 {

	public static void main(String[] args) {
		Consumer<String> fun= str-> System.out.println(str.replace("", " ").trim());
		fun.accept("   suchi  ");

	}

}
