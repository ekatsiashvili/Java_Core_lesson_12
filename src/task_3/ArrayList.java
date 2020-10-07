package task_3;

public class ArrayList<T> {
	private final int INIT_SIZE = 16;
	private final int CUT_RATE = 4;
	private Object[] array = new Object[INIT_SIZE];
	private int pointer = 0;
	
	//Add value to arraylist
	public void add(T item) {
		if (pointer == array.length - 1) {
			resize(array.length * 2);
		}
		array[pointer++] = item;
	}

	//Remove value from arraylist
	public void remove(int index) {
		for (int i = index; i < pointer; i++) {
			array[i] = array[i + 1];
		}
		array[pointer] = null;
		pointer--;
		if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE) {
			resize(array.length / 2);
		}
	}

	//Resize arraylist
	private void resize(int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(array, 0, newArray, 0, pointer);
		array = newArray;
	}

	//Print arraylist
	public void printArrayList() {
		System.out.print("ArrayList = [ ");

		for (int i = 0; i < array.length - 1; i++) {
			if ((array[i] != null)&&(array[i + 1] != null)) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
				break;
			}
		}
		System.out.print(" ]");
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("One");
		myList.add("Two");
		myList.add("Three");
		myList.add("Four");
		myList.add("Five");
		myList.add("Six");
		myList.add("Seven");
		myList.add("Eight");
		myList.add("Nine");
		myList.add("Ten");
		myList.printArrayList();
		myList.remove(6);
		myList.remove(3);
		myList.printArrayList();
	}

}