package Assignment;

import java.util.Scanner;

public class CircularDoubleLinkListMain {
	public static void main(String[] args)

	{
		Scanner in = new Scanner(System.in);
		CircularDoubleLinkList obj = new CircularDoubleLinkList();// object created
		obj.create_list();
		int ch, e;
		do
		{
			System.out.println("List Menu");
			System.out.println("-----------");
			System.out.println("1. insert_left");
			System.out.println("2. insert_right ");
			System.out.println("3. delete_left");
			System.out.println("4. delete_right");
			System.out.println("5. print");
			System.out.println("6. print rev");
			System.out.println("0.Exit");
			System.out.println("-----------");

			System.out.println("Choice:");
			ch = in.nextInt();

			switch (ch) {

			case 1:

				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert_left(e);
				System.out.println("Element Inserted");
				break;

			case 2:

				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert_right(e);
				System.out.println("Element Inserted");
				break;

			case 3:

				obj.delete_left();
				break;

			case 4:

				obj.delete_right();
				break;

			case 5:

				obj.print_list();
				break;

			case 6:

				obj.print_list_rev();
				break;

			case 0:

				System.out.println("Exiting....");
				break;

			default:

				System.out.println("Wrong option selected");
				break;

			}
		} while (ch != 0);
	}
}
