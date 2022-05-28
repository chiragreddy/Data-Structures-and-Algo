package Easy.Arrays;

import java.util.*;
public class SDE implements Comparator{  // if its not Comparator<Student>, Comparator<SDE>
	
	private String money;
	private int experience;
	
	public SDE() {
		
	}
	
	public SDE(String money, int experience) {
		this.money = money;
		this.experience = experience;
	}

	public static void main(String[] args) {
		
		// Find out who is great - people with more experience
		SDE sde = new SDE();
		SDE sde1 = new SDE("100",2);
		SDE sde2 = new SDE("120",3);
		
		// Collections.sort(arr, new SDE())- collection name, comparator object which is used to sort the collection
		// Arrays.sort(arr, new SDE())
		// Lambda comparator
		// (a,b) -> (square(a) - square(b))
		if(sde.compare(sde1, sde2)>1) { // usually comparision is done outside this class
			System.out.println("sde1 is great");
		}
		else if(sde.compare(sde1, sde2) < 1) {
			System.out.println("sde2 is great");
		}
		else {
			System.out.println("no one is great");
		}
		
	}
	
	
//	// Experience comparator - we can create multiple classes which implement comparator interface based on different fields of that class
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		SDE sde1 = (SDE)o1;
//		SDE sde2 = (SDE)o2;
//		
//		return sde1.getMoney().compareToIgnoreCase(sde2.getMoney()); // if the basis on which we are comparing the objects i.e. money is string, we can use compare to method
//	}
	
	// Money comparator - can be class name
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		SDE sde1 = (SDE)o1;
		SDE sde2 = (SDE)o2;
		
		return sde1.getMoney().compareToIgnoreCase(sde2.getMoney()); // if the basis on which we are comparing the objects i.e. money is string, we can use compare to method
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
		
}
