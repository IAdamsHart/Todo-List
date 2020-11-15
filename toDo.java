import java.util.*;

public class toDo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		List<String> toDoItems = new ArrayList<>();
		int count = 0;

		try {

			int option = -1;
			
			while (option != 3)
			{	
				System.out.println();
				System.out.println("Please select an option:");
				System.out.println("1. New Item\n2. Show List\n3. Terminate\n");
				
				option = in.nextInt();
				in.nextLine();
				
				if (option == 1)
				{
					System.out.println("Item #" + (count + 1));
					String item = in.nextLine();
					toDoItems.add(item);
					count++;
				}
				else if (option == 2)
				{
					System.out.println("To-Do List:");
					for (int i = 0; i < toDoItems.size(); i++)
					{
						System.out.println((i+1) + ": " + toDoItems.get(i));
					}
				}
				else if (option == 3)
				{
					System.out.println("Program Terminated");
				}
			}	
		} finally {
			in.close();
		}

	}
	
}
