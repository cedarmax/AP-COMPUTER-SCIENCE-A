package loops;

public class Loops {

	public static void main(String[] args) {
		int i = 1;
		while ( i <= 10) {
			System.out.println("Perfect square #" + i + " is" + i + "* " + i + "=" + (i*i));
			i++;
		}
		//int i = 1;
		do {
			System.out.println("Perfect square #" + i + " is" + i + "* " + i + "=" + (i*i));
			i++;
			
		} while (i<=10);
		
		int x = 4;
		while (x<10); {
			System.out.println("Perfect square # " + x + " is" + x+"* "+x+"="+(x*x));
			x++;
		}

	}

}
