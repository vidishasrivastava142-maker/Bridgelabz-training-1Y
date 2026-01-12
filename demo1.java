public class demo1
{
static int x=10;
int y=10;
public static void main(String [] args){
int  z=10;
System.out.println("local variable z:" +z);
System.out.println("static variable x:" +x);
 
 demo1 obj=new demo1();
 System.out.println("non static variable y:" +obj.y);
 }
 }