package libreria;

public class Main{
	public static void main(String[] args) {
		LibreriaMap lib = new LibreriaMap();
		Libro l1 = new Libro(1,"Lean Startup","Ivan");
		Libro l2 = new Libro(2,"Extreme Ownership","Jocko Willink");
		Libro l3 = new Libro(3,"Extreme Ownership","Jocko Willink");                    
		Libro l4 = new Libro(4,"Dichotomy","Jocko Willink");
		LibroScolastico s1 = new LibroScolastico(5,"Atomic Habits","Carly",34);
		LibroScolastico s2 = new LibroScolastico(6,"Atomic Habits","Carly",34);
		LibroScolastico s3 = new LibroScolastico(7,"Fedro","Platone",25);
		LibroScolastico s4 = new LibroScolastico(8,"De Brevitate Vitae","Socrate",78);
		lib.add(l1,1);
		lib.add(l2,2);
		lib.add(l3,4);
		lib.add(l4,5);
		lib.add(s1,6);
		lib.add(s2,7);
		lib.add(s3,8);
		lib.add(s4,9);
		System.out.println("l1 equals l2? " + l1.equals(l2));
		System.out.println("l1 equals l3? " + l1.equals(l3));
		System.out.println("s1 equals s2? " + s1.equals(s2));
		System.out.println("s1 equals s3? " + s1.equals(s3));
		System.out.println("l1 hashCode: " + l1.hashCode());
		System.out.println("l2 hashCode: " + l2.hashCode());
		System.out.println("s1 hashCode: " + s1.hashCode());
		lib.print();
		System.out.println("The books most used: " + lib.mostBookUsed());



	}
}