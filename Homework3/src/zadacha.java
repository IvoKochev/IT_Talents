
public class zadacha {

	public static void main(String[] args) {
		int[] arr = { 1, 15, 3, 10, 5, 8, 6, 7, 8 };
		int counter = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] >= arr[i]) {
				counter++;
			}
		}
		// System.out.println("cnt" + counter);
		int sum = 0;
		if (counter > 0) {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i - 1] > arr[i]) {
					if (arr[i - 1] % arr[i] == 0) {
						sum += arr[i];
						// System.out.println("1" + sum);
					} else {
						for (int j = arr[i]; j > 0; j--) {
							if (arr[i - 1] % j == 0 && arr[i] % j == 0) {
								sum += j;
								// System.out.println("2" + sum);
								break;
							}
						}
					} if (arr[i] > arr[i - 1]) {
						if (arr[i] % arr[i - 1] == 0) {
							sum += arr[i - 1];
						} else {

							for (int j = arr[i - 1]; j > 0; j--) {
								if (arr[i - 1] % j == 0 && arr[i] % j == 0) {
									sum += j;
									// System.out.println("4" + sum);
									break;
								}
							}
						}
						if (arr[i] == arr[i - 1]) {
							sum += arr[i];
							// System.out.println("5" + sum);
						}
					}
				}
			}

		}
		System.out.println("sum " + sum);

	}
}
