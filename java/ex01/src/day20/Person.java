package day20;

public class Person implements Comparable<Person>{
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "(" + age + "세)";
	}
//	@Override
//	public int hashCode() {                                             
//		return age%4 + name.hashCode();
//	}
//	
//	
//	
//	@Override
//	public boolean equals(Object obj) {
//		Person cmp=(Person)obj;
//		if(this.name.equals(cmp.name) && this.age==cmp.age) {
//			return true;
//		}
//		return false;
//	}
	// 정렬 기준(이름의 길이로 정렬기준을 설정)
	// 정렬 기준(이름을 알파벳 순으로 정렬기준을 설정) ,compareTo활용
	
	@Override
	public int compareTo(Person p) {
		//return name.length()-p.name.length();
		if(name.length()>p.name.length())
			return 1;
		else if(name.length()<p.name.length())
			return -1;
		else {
			if(name.compareTo(p.name)>0) return 1;
			else if(name.compareTo(p.name)<0) return -1;
			else return 0;
		}
		//정렬 기준(1알파벳 순,2:알파벳이 같으면 나이순) 
//		if(name.compareTo(p.name)>0) return 1;
//		else if(name.compareTo(p.name)<0) return -1;
//		else return 0;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person age) {
			Person person = (Person)obj;
			if(this.age == person.age) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
