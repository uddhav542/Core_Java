/**
 * Represent a person.
 * @author lbrandon
 *
 */
public class Person {

	//instance variables
	
	/**
	 * Name of person.
	 */
	String name;
	
	/**
	 * Age of person.
	 */
	int age;
	
	/**
	 * Creates a person with given name and age.
	 * @param name of person
	 * @param age of person
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Compares instances of person based on name.
	 * If two people have the same name, they are equal.
	 */
	public boolean equals(Object something) {
		
		//cast given object to Person
		Person otherPerson = (Person) something;
		
		//returns true if names of two people are the same
		//case sensitive
		return this.name.equals(otherPerson.name);
	}
}















Person person1 = new Person("Ted", 22);
Person person2 = new Person("ted", 22);

//assertEquals uses == to compare primitives
//let's compare the ages of person1 and person2
assertEquals(person1.age, person2.age);

//assertEquals uses equals method implemented in person class
assertNotEquals(person1, person2);

Person person3 = new Person("Ted", 34);

assertEquals(person1, person3);
