package com.raghav.corejava.progs.array;

import java.util.Scanner;

	public class DiagonalDifference {
		 private static int calculateDiagonalDifference(int[][] arr) {
		        int len = arr.length;
		        int leftDiagonalSum = 0;
		        int rightDiagonalSum = 0;
		        
		        int index = 0;
		        while(index < len) {
		            leftDiagonalSum += arr[index][index];
		            rightDiagonalSum += arr[index][len-1-index];
		            index++;
		        }
		        
		        return Math.abs(leftDiagonalSum - rightDiagonalSum);
		    }

		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        int arr[][] = new int[n][n];
		        for(int i=0; i < n; i++){
		            for(int j=0; j < n; j++){
		                arr[i][j] = in.nextInt();
		            }
		        }
		        in.close();
		        System.out.println(calculateDiagonalDifference(arr));
		    }
}
