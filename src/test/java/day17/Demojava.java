package day17;

public class Demojava {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 12 };

		String[] sarray = { "Rahul", "Mayur", "Bhushan" };

		for (int i = 0; i < sarray.length; i++) {

			System.out.println(sarray[i]);
		}

		// enhanced for loop

		for (String s : sarray) {
			System.out.println(s);

		}

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {

				System.out.println(arr2[i]);
			} else {
				System.out.println(arr2[i] + "Is not a multiple of 2");
			}

		}

		for (int p : arr) {

			if (p % 2 == 0) {
				System.out.println(p);
				break;
			} else {
				System.out.println(p + "" + "this is not multiple of 2");
			}
		}
	}

}
