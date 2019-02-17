package basis;

public class Child1 extends Parent1{
	 String name="Alice";
	public Child1() {
  		 //super()..i.e, the parent constructor is called
  		 System.out.println(name);
  		 show();
  		 super.show();
  		 System.out.println(super.name);
  		 }
	public void show() {
		System.out.println("child");
	}

	public static void main(String[] args) {
	
   	 Child1 ch=new Child1();
   	
   	
}
}