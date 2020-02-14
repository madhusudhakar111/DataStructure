package array.rotation;

import java.util.Arrays;

public class ArrayRotation {

	private void leftRotate(int arr[], int n) {

		int temp = 0;

		for (int i = 0; i < n; i++) {
			temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {

				arr[j] = arr[j + 1];
			}

			arr[arr.length - 1] = temp;

		}

		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {

		new ArrayRotation().leftRotate(new int[] { 1, 2, 3, 4, 5 }, 2);
	}

}
