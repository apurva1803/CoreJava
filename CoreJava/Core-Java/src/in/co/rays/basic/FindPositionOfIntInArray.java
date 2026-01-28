package in.co.rays.basic;

public class FindPositionOfIntInArray {

	public static void main(String[] args) {
		int[] arr = { 12, 23, 24, 36, 57, 87, 45, 90, 25 };
		int num = 36;

		int temp = -1;

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				temp = i;
				System.out.println(num + " = " + i);
			}
		}

		System.out.println(temp == -1 ? temp : "");
	}

}
