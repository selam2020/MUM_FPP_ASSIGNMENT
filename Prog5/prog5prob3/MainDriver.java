package prog5prob3;

public class MainDriver {

	public static void main(String[] args) {
		Figure[] f = new Figure[5];
		f[0] = new UpWardHut();
		f[1] = new UpWardHut();
		f[2] = new FaceMaker();
		f[3] = new DownWardHutt();
		f[4] = new Vertical();

		System.out.println("Figures");
		for (Figure f2 : f) {
			f2.getFigure();
		}
		System.out.println();
		for (Figure f2 : f) {
			System.out.print(f2.getClass().getSimpleName() + ":");
			f2.getFigure();
			System.out.println();
		}
	}
}

