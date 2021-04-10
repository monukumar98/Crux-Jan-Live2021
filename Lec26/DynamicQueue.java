package Lec26;

import Lec25.Queue;

public class DynamicQueue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {
		if (is_full()) {
			int[] new_data = new int[2 * this.data.length];
			for (int i = 0; i < size; i++) {
				int idx = (this.front + i) % this.data.length;
				new_data[i] = this.data[idx];
			}
			this.data = new_data;
			this.front = 0;

		}
		super.Enqueue(item);
	}
}
