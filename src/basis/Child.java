package basis;

public class Child extends Parent{
    public static void main(String[] args) {
    	 Child child=new Child();
    	 child.show();
    	 System.out.println("Father name:"+child.name);
/*if you give string name="Alice";
 when you display child.name you get it as child name as Alice but not bob
  
 
 */
    }
}
