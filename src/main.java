import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String msg;
		for (;;) {
			msg = c.nextLine();
			mediador med = new mediador();
			med.send(new fabrica(), msg);
		}
	}
}