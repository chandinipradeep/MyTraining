package mutlipleinheritance;

public class MultipleInheritanceChild implements MultipleInheritanceParent1,MultipleInheritanceParent2 {

	
	public static void main(String[] args) {
		//MultipleInheritanceChild ob=new MultipleInheritanceChild();
		//ob.display();
		//ob.print();
		MultipleInheritanceParent2 ob1=new MultipleInheritanceChild(); //by creating reference for parent2
		ob1.print();
		MultipleInheritanceParent1 ob2=new MultipleInheritanceChild(); //by creating reference for parent1
		ob2.display();

	}

	@Override
	public void print() {
	System.out.println("Parent1 method");
		
	}

	@Override
	public void display() {
		System.out.println("Parent2 method");
		
	}

}
