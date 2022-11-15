package islem_oncelikleri;

public class Main {

	public static void main(String[] args) {
		/*
		 * ++x x'in deðerini bir artýrýr ve o an ki deðeri verir
		 * x++ x'in deðerini bir artýrýr ve bir önce ki deðeri verir
		 * */
		int x = 3;
		//System.out.println(x++);
		int y = (++x * 5) / (x-- + --x);
				  //20  / 4   +   2 = 6
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
