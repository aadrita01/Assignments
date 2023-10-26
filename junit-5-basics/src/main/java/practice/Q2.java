package practice;

public class Q2 {
	 public static MinMax findMinMax(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            // Handle the case where the array is empty or null.
	            return new MinMax(Integer.MIN_VALUE, Integer.MAX_VALUE);
	        }

	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            } else if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        return new MinMax(min, max);
	    }

}
