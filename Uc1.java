package generics;

public class Uc1 {

	public static <T extends Comparable<T>> void findMax(T x, T y, T z) {
		T max = x; // initially assign max to x
		if(y.compareTo(max) > 0) { //compare y with max if it's large then assign max to y
			max = y;
		}
		if(z.compareTo(max)>0) {//compare z with max if it's large then assign max to z
			max = z;
		}
		//print max
		System.out.println("Max number is " +max);
	}
	public static void main(String []args) {
		Double x = 10.10, y = 30.20, z= 10.30; //declare values
		//find max with findMax method
		findMax(x, y, z);
		findMax(y, x, z);
	}
}
