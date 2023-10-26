package assign1;

	class Animal {
	    void eat() {
	        System.out.println("The animal eats food.");
	    }
	}

	// Child class (subclass) inheriting from Animal
	class Dog extends Animal {
	    void bark() {
	        System.out.println("The dog barks.");
	    }
	}

	public class inheritence {
	    public static void main(String[] args) {
	        // Create an instance of the Dog class
	        Dog myDog = new Dog();

	        // Call methods from both the parent and child class
	        myDog.eat();  // This method is inherited from the Animal class
	        myDog.bark(); // This method is specific to the Dog class
	    }
	}
	





