package problem03;

import java.util.Arrays;

public class MyStack {

	private String[] buffer;
	private int index;
	private int MAX_SIZE;

	public MyStack(int size) {

		this.buffer = new String[size];
		Arrays.fill(buffer, null);
		this.index = 0;
		this.MAX_SIZE = size;

	}

	public void push(String item) {

		if (size() == MAX_SIZE) {// 추가 할려고하는데 꽉참
			// resizing

			String[] temp = new String[buffer.length + 1];
			Arrays.fill(temp, null);

			for (int i = 0; i < buffer.length; i++) {
				temp[i] = buffer[i];
			}
			buffer = temp;
			buffer[index++] = item;
			MAX_SIZE++;

		} else {
			buffer[index++] = item;
		}
	}

	public String pop() {
		if (isEmpty() == false) {
			String str = buffer[--index];
			return str;
		} else {
			return null;
		}

	}

	public boolean isEmpty() {
		if (this.size() == 0)
			return true;
		else
			return false;

	}

	public int size() {
		return index;
	}
}