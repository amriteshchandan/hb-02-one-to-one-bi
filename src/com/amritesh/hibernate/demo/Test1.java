package com.amritesh.hibernate.demo;

public class Test1 {

	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 0;
			System.out.println(a/b);
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Amritesh");
	}
}