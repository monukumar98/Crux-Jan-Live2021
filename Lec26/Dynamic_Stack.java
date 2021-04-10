package Lec26;

import Lec25.Stack;

public class Dynamic_Stack extends Stack {

	@Override
	public void push(int Item) throws Exception {
		if (is_full()) {
			int[] new_data = new int[2*this.data.length];
			for (int i = 0; i < data.length; i++) {
                  new_data [i]=this.data[i];
			}
			this.data=new_data;
			
		}
		
		super.push(Item);
		
		
	}

}
