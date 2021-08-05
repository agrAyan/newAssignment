package com.inter.training;

public interface Sports {
void shoeSports();
default void printName() {
	System.out.println("academy name is Sharma academy");
}
}
