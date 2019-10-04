package model;



public class Dog {
	private int id,age;
	private String name,race;
	
	
	public Dog(int id,String name,int age,String race) {
		this.id=id;
		this.name = name;
		this.age=age;
		this.race = race;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	
}
