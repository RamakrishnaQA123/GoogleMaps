package Testingpacakage1;


class myclass{
	void m1(){
		int x=10,y=20;
		System.out.println(x+y);
	}
	void m2(){
		System.out.println("Selenium Testing");
	}
}
class myclass2{
	void m3(){
		System.out.println("Webdriver");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		myclass obj=new myclass();
		myclass2 obj2=new myclass2();
		obj.m1();
		obj.m2();
		obj2.m3();
		
		
	}

}
