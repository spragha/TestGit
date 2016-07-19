package com.raghav.corejava.progs.math;

public class MaximumNumberProblem {

		private static int findMaxNumberFromDigits(int num) {
			int[] digits = getDigitsInSortedOrder(num);

			int maxNum = 0;
			for (int index = digits.length - 1; index >= 0; index--) {

				int frequency = digits[index];
				while (frequency > 0) {
					maxNum = maxNum * 10 + index;
					frequency--;
				}
			}
			return maxNum;
		}

		private static int[] getDigitsInSortedOrder(int num) {
			int[] digits = new int[10];

			while (num > 0) {
				// Get remainder
				int index = num % 10;
				digits[index]++;
				num /= 10;
			}
			return digits;
		}

		public static void main(String[] args) {
			int num = 82930358;
			int maxNum = findMaxNumberFromDigits(num);
			System.out.println("Maximum number : " + maxNum);
		}

}
