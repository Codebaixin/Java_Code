package com.atguigu.java1;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//自动生成equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	//手动实现Person类的equals()功能
//	@Override
//	public boolean equals(Object obj) {
//		if(this==obj) {
//			return true;
//		}
//		if(obj instanceof Person) {
//			Person p=(Person)obj;
//			if(this.age==p.age && this.name.equals(p.name)) {
//				return true;
//			}else {
//				return false;
//			}
//		}
//		return false;
//	}
	
	@Override
	public String toString() {
		return "Person[name="+this.name+",age="+this.age+"]";
	}
}
