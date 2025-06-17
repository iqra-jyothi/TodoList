import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TodoOpretion {
    public void add(ArrayList<ToDo> todoList, Scanner sc) {
System.out.println("enter the id");
int id=sc.nextInt();
 sc.nextLine();
System.out.println("enter the title");
String title = sc.next();
System.out.println("enter the description");
String description = sc.next();


ToDo t=new ToDo(id,title,description);
todoList.add(t);
        System.out.println("ToDo added successfully: " + t);
    }

    public void Viewall(ArrayList<ToDo> todoList) {
        if(todoList.isEmpty())
        {
            System.out.println("no item in the list");
        }
        else{
            System.out.println("ToDo List:");
            for (ToDo todo : todoList) {
                System.out.println(todo);
            }
        }
    }

    public void deletelist(ArrayList<ToDo> todoList, Scanner sc) {
        System.out.println("Enter the ID of the ToDo to delete:");
        int id=sc.nextInt();
      if (todoList.isEmpty()) {
          System.out.println("No items in the list to delete.");
      }
      else {
          Iterator<ToDo> iterator = todoList.iterator();
          while (iterator.hasNext()) {
              ToDo toDo = iterator.next();
              if (toDo.getId() == id) {
                  iterator.remove();
                  ;
                  System.out.println("ToDo with ID " + id + " has been deleted.");

              }
          }
      }

    }
}
