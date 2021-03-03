package Lec11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int a = 9;
		//Integer a1 = new Integer(19);
		Integer a1=19;
		a=a1; // Un_Box
		a1=a;// Auto_Box
				
         System.out.println();
		int[] arr = { 2, 3, 4 };
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		a1=2*a1;
		System.out.println(a);
		System.out.println(2*a1);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		// TIme O(1)
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		// Time O(N)
		list.add(0, 40);
		System.out.println(list.contains(2));
		
		System.out.println(list);
		System.out.println(list.size());
		//Add at index 
		// ranges 0 to list.size();
		list.add(list.size(), 50);// 4,50
		System.out.println(list);
		// Get
		// ranges 0 to list.size()-1
		System.out.println(list.get(list.size()-1));
		//Remove 
		// Ranges 0 to list.size()-1
		list.remove(list.size()-1);
		System.out.println(list);
		// Sort 
//		Collections.sort(list);
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
		list.add(90);
		// Set 
		System.out.println(list);
		list.set(2, 70);
		System.out.println(list);
		ArrayList<Character> listchar= new ArrayList<>();
		listchar.add('c');
		System.out.println(listchar);
		 for (int i = 0; i <list.size(); i++) {
			 System.out.print(list.get(i)+" ");
			
		}
		 System.out.println();
		 // E_F_L
		 for(int val :list)
			 System.out.print(val+" ");
		
          for(int i=0; i<3; i++) {
        	  int item = sc.nextInt();
        	  list.add(item);
          }
          System.out.println(list);
		
		
		

	}

}
