package test.ch07.poly;

public class AbastractEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
//		dog.sound();
//		cat.sound();
		animalSound(dog);
		animalSound(cat);
		
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
