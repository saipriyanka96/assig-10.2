/*if we use fully qualified name then only we declare the class
 *of the package will be accessible. here there is no need of import
 *but we use fully qualified every time when access the class or
 *interface. It is generally used when 2 packages have same class name
 *eg:java.util and java.sql packages have date class
 */
package tree;////Package is a grouping of related types providing access protection and name 
//space management.here we created another package
//created main class 
public class Trees {
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class

//created the class trees
	public static void main(String[] args) {
//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
//String is predefined class name 
//args is name of the array
			
		// TODO Auto-generated method stub
			System.out.println("properties of tree:");
			//system is final class
			//out is a static member of system class and type printStream
			//println is method of printStream class.ln means nextline
			//prints properties of tree
			my.Tree tree=new my.Tree();
			//here created fully qualified name to access the object of the
			//class tree from the package my
			tree.flowers();//displays the get methods for the objects provided
			tree.branch();
			tree.stem();
			tree.fruits();
	}
	}


