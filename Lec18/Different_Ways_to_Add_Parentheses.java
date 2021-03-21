package Lec18;

import java.util.*;

public class Different_Ways_to_Add_Parentheses {
	public static void main(String[] args) {
      
       System.out.println(DifferentWaystoAddParentheses("2*3-4*5"));
	}

	public static ArrayList<Integer> DifferentWaystoAddParentheses(String ques) {
		
		if(ques.indexOf('+')==-1 && ques.indexOf('-')==-1 && ques.indexOf('*')==-1) {
			ArrayList<Integer> bs = new  ArrayList<Integer>();
			bs.add(Integer.parseInt(ques));
			return bs;
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*') {
				String left_String = ques.substring(0, i);
				String right_String = ques.substring(i + 1);
				ArrayList<Integer> left_list = DifferentWaystoAddParentheses(left_String);
				ArrayList<Integer> right_list = DifferentWaystoAddParentheses(right_String);
				for (int val : left_list) {
					for (int val2 : right_list) {
                        if(ch=='+') {
                        	ans.add(val+val2);
                        }
                        if(ch=='-') {
                        	ans.add(val-val2);
                        }
                        if(ch=='*') {
                        	ans.add(val*val2);
                        }
					}
				}

			}
		}
		return ans;
	}
}
