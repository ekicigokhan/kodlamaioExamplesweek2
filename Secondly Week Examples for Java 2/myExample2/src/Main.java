
public class Main {

	public static void main(String[] args) {
//		Animal animal = new Horse("ABD�");
//		Cat cat = new Cat("PRENSES");
//		Dog dog = new Dog("GARABA�");
//		Horse horse = new Horse("�AHBATUR");
//		cat.voice();
//		horse.voice();
//		dog.voice();

		Animal[] animals = new Animal[] { new Cat("PRENSES"), new Horse("�AHBATUR"), new Dog("GARABA�") };

		for (Animal animal : animals) {
			animal.voice();
		}

	}

}
