package in.tp.jseprogpr.ui;

public class ArrayPr {

	public static void main(String[] args) {
		int[] marks = new int[3];
		
		marks[0] = 97;
		marks[1] = 94;
		marks[2] = 95;
		
		/*System.out.println(String.format("Physics=%d", marks[0]));
		System.out.println(String.format("Maths=%d", marks[1]));
		System.out.println(String.format("Chemistry=%d", marks[2]));*/
		
		for(int i=0;i<3;i++) {
			System.out.println(marks[i]);
		}

	}

}
