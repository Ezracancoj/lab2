package edu.monmouth.lab2;

import java.util.ArrayList;
import java.util.List;

public class InClassLab2 {
	

	public static void main(String[] args) {
		final int SIZE = 3;
		Student stu = new Student("Andy", 2001, 1348,"CS");
		Professor pro = new Professor("Gomez", 1976, 74949);
		Person per = new Person("Heavenly", 2000);
		
		System.out.println(stu.toString());
		System.out.println(pro.toString());
		System.out.println(per.toString());
		
		System.out.println();
		
		
		Person[] people = new Person[SIZE];
		people[0] = per;
		people[1] = stu;
		people[2] = pro;
		
		int i = 0;
		while(i < SIZE){
			System.out.println(people[i].toString());
			i++;
		}
		
		System.out.println();

		
		int x = 0;
		for(int j = 0; j < SIZE; j++){
			int ind = people[j].toString().indexOf("]");
			while(x < ind) {
				if(x == ind) {
					break;
					
				}
				else {
				System.out.print(people[j].toString().charAt(x));
				x++;}
			}
				
			i++;
			System.out.println();
		}
		
		

		List<Object> peoplelist = new ArrayList<Object>();
		
		peoplelist.add(stu);
		peoplelist.add(per);
		peoplelist.add(pro);
		
		i = 0;
		while(i < SIZE){
			System.out.println(peoplelist.get(i).toString());
			i++;

	}

}
}

