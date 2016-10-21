/*
	jar cvf myutil.jar MyArrays

	//设置classpath
	set classpath=./myutil.jar
	javac Demo10.java
*/
package myutil;

public class MyArrays {
	public static String toString(int[] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				result += "[" + arr[i] + ",";
  			} else if (i == arr.length - 1) {
  				result += arr[i] + "]";
  			} else {
  				result += arr[i] + ",";
  			}
		}

		return result;
	}
}