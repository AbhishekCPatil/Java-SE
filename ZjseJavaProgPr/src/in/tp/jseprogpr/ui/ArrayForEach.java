package in.tp.jseprogpr.ui;

public class ArrayForEach {

	public static void main(String[] args) {
		int [] marks = {98, 54, 78, 56, 89};
		
		/*System.out.println(marks[1]);
		System.out.println(marks.length);*/
		
		//float [] score = {1.0f, 2.5f,};
		System.out.println("Using for loop");
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("\nArrays in reverse order");
		for(int i=marks.length-1;i>=0;i--) {
			System.out.println(marks[i]);
		}
		
		System.out.println("\nUsing for loop-each/Enhanced for loop");
		
		for(int element: marks ) {
			System.out.println(element);
		}
			
			String[] names = {"Abhi","manoj", "Vijay", "Akash"};
			System.out.println("\nString Array");
			for(String name: names) {
				System.out.println(name);
			}
		}

	}

