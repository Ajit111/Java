package JAVA;

public class ClassObject {
//int x=1;
//int y=2;
//public static void main(String[]args) {
//	ClassObject obj=new ClassObject();
//	ClassObject obj2 =new ClassObject();
//	obj.x=40;                                 //Modify Attributes 
//	System.out.println(obj.x);
//	System.out.println(obj2.y);
//  }
//}

String fname = "John";
String lname = "Doe";
int age = 24;

public static void main(String[] args) {
	ClassObject myObj = new ClassObject();
  System.out.println("Name: " + myObj.fname + " " + myObj.lname);
  System.out.println("Age: " + myObj.age);
}
}