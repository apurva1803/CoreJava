package in.co.rays.abstraction;

public class TestAnimal {
	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		a1.say();
		
		Animal a2 = new Dog();
		a2.say();
		
		Animal a3 = new Lion();
		a3.say();
		
		System.out.println("----------------");
		
		
		//By Array
		Animal[] a = new Animal[3];
		a[0] = new Cat();
		a[1] = new Dog();
		a[2] = new Lion();
		
		for(Animal an: a)
		{
			an.say();
		}
		
	}

}
