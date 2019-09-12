package prog5prob5;

public class Main {
	public static void main(String[] args) {

		Computer lg = new Computer("LG", "Corei5", 4, 2.21);
		System.out.println(lg);

		Computer samsung = new Computer("Samsung", "Corei7", 8,  2.67);
		System.out.println(samsung);

		System.out.println(lg.equals(samsung));

	}

}



