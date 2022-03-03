package generics;

public class Uc3 {

	public static void findMax(String[] arr) {
		String max="A";
		for (int i=0; i<arr.length;i++) {
			if(arr[i].compareTo(max) >0) {
				max= arr[i];
			}
		}
		System.out.println("max string is " +max);
	}


	public static void main(String[] args) {

		String sArr1[] = { "vinay","bharath" ,"abhi"};
		String sArr2[] = {"abhi","karthik","vinay"};
		String sArr3[] = {"vinay","bharath","bittu"};


		findMax(sArr1);
		findMax(sArr2);
		findMax(sArr3);

	}
}
