package javaCocepts;

import org.testng.annotations.Test;

public class ConstructorDemo {
public ConstructorDemo(){
	System.out.println("Im the implicit constructor");
}
public ConstructorDemo(int a, int b) {
	System.out.println("Im the constructor with parameters");
}

public void method(){
	//ConstructorDemo obj=new ConstructorDemo();
	ConstructorDemo obj=new ConstructorDemo(3, 9);

}
}
