package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Switcher switcher1=new Switcher(10,100,250,"FullDuplex","India");
        switcher1.display();
        Switcher switcher2=new Switcher(8,50,100,"FullDuplex","Germany");
        switcher2.display();
        Switcher switcher3=new Switcher(8,50,100,"HalfDuplex","America");
        switcher3.display();
        Switcher switcher4=new Switcher(8,50,100,"HalfDuplex","Brazil");
        switcher4.display();
        Switcher switcher5=new Switcher(8,50,100,"FullDuplex","England");
        switcher5.display();
    }
}
