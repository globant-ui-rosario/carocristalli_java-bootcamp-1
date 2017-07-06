package Maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter yot name and then press \"Enter\"");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		scanner.close();

    }
}
