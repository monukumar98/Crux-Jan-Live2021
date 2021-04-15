package Lec28;
import java.util.*;
public class Celebrity_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		 Celebrity(arr);

	}

	private static void Celebrity(int[][] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			s.push(i);
		}
		while(s.size()!=1) {
			int a = s.pop();
			int b = s.pop();
			if(arr[a][b]==1) {
				s.push(b);
			}
			else {
				s.push(a);
			}
		}
		int Candidate=s.pop();
		for (int i = 0; i < arr.length; i++) {
			if(i!=Candidate) {
				if(arr[Candidate][i]==1 || arr[i][Candidate]==0) {
					System.out.println("Not Celeb");
					return ;
				}
			}
		}
		System.out.println("celeb "+ Candidate);
		
		
	}

}
