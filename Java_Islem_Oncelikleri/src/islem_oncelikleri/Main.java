package islem_oncelikleri;

public class Main {

	public static void main(String[] args) {
		/*
		 * ++x x'in de�erini bir art�r�r ve o an ki de�eri verir
		 * x++ x'in de�erini bir art�r�r ve bir �nce ki de�eri verir
		 * */
		int x = 3;
		//System.out.println(x++);
		int y = (++x * 5) / (x-- + --x);
				  //20  / 4   +   2 = 6
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
