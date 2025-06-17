import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<ToDo> todoList = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        TodoOpretion to=new TodoOpretion();
        System.out.println("Welcome to ToDo List Application");
        while(true)
        {
            System.out.println("1. Add ToDo");
            System.out.println("2. View All ToDos");
            System.out.println("3. Delete ToDo by ID");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:to.add(todoList,sc);
                break;
                case 2:to.Viewall(todoList);
                break;
                case 3:to.deletelist(todoList,sc);
                break;

                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}