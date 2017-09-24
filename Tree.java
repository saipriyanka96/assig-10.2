//using fully qualified name showing how the packages will work
package my;
//Package is a grouping of related types providing access protection and name 
//space management
//create package name as my
public class Tree {
	//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
	//immediate superclass of the class

//created class name as tree
	public void leaves()
//void is used to define the return type of the method
	//created leaves method
	{
		int leaves=10;//intializing values to integer datatype
		System.out.println("tree has leaves");//prints the values
		System.out.println("leaves on tree are:"+leaves);
		//system is final class
		//out is a static member of system class and type printStream
		//println is method of printStream class.ln means nextline
		//leaves in print statement is the variable which we need to print
	}
	public void branch(){
		int branch=2;
		System.out.println("tree will have branches:"+branch);
	}
	public void stem(){
		int stem=1;
		System.out.println("tree will have stem:"+stem);
	}
	public void fruits(){
		int fruits=10;
		System.out.println("tree will have fruits:"+fruits);
	}
	public void flowers(){
		
		System.out.println("tree will have 2 flowers");
		//created four methods
	}
}
