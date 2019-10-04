package model;


import java.util.LinkedList;

public class DogList {
	private LinkedList<Dog> list;
	
	public DogList() {
		list = new LinkedList<Dog>();
	}
	
	public void addElement(int id,String name,int age,String race) {
		list.add(new Dog(id,name,age,race));
	}
	
	public void printList() {
		for (Dog dog : list) {
			System.out.println(dog.getId()+" "+dog.getName()+" "+dog.getAge()+" "+dog.getRace());
		}
	}

	public LinkedList<Dog> getList() {
		return list;
	}

	public void setList(LinkedList<Dog> list) {
		this.list = list;
	}
}
