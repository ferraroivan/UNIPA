package IP.TodoListApplication.App;

import IP.TodoListApplication.Features.*;
import IP.TodoListApplication.DataSorting.*;
import IP.TodoListApplication.SaveRead.*;

import java.util.*;

public class TodoList {
    public static Map<String, Task> tasks = new LinkedHashMap<>();
    public static boolean applicationRunning = true;

    public void start(){
        showApplicationTitle();
        while(TodoList.applicationRunning){
            showAvailableActions();
            int actionNumber = readAction();
            executeAction(actionNumber);
        }
    }

    public void executeAction(itn actionNumber){
        Actions action;
        switch(actionNumber){
            case Actions.ADD_TASK:
                action = new AddTask();
                action.showActionsInformation();
                String command = action.readUserInput();
                if(!command.equals("0"))
                    action.executeAction(command);
                break;

            case Actions.MARK_AS_DONE:
                if(tasks.size() > 0){
                    action = new MarkAsDone();
                    action.showActionsInformation();
                    String id = action.readUserInput();
                    if(!id.equals("0"))
                        action.executeAction(id);
                } else {
                    System.out.println("Your List is empty, add tasks first!");
                }
                break;

            case Actions.REMOVE_TASK:
                if(tasks.size() > 0){
                    action = new RemoveTask();
                    action.showActionsInformation();
                    String id = action.readUserInput();
                    if(!id.equals("0"))
                        action.executeAction(id);
                } else {
                    System.out.println("Your List is empty, add tasks first!");
                }
                break;

            case Actions.EDIT_TASK:
                if(tasks.size() > 0){
                    action = new EditTask();
                    action.showActionsInformation();
                    String editCommand = action.readUserInput();
                    if(!editCommand.equals("0"))
                        action.executeAction(editCommand);
                } else {
                    System.out.println("Your list is empty, add tasks first!");
                }
                break;

            case Actions.DISPLAY_ALL_TASKS:
                if(tasks.size() > 0){
                    action = new TasksDisplay();
                    action.showActionsInformation();
                    action.executeAction(null);
                } else {
                    System.out.println("Your list is empty, add tasks first!");
                }
                break;

            case Actions.SORT_TASKS_BY_DATE:
                action = new DateSorting();
                action.executeAction(null);
                break;

            case Actions.SORT_TASKS_BY_PROJECT:
                action = new ProjectSorting();
                action.executeAction(null);
                break;

            case Actions.SAVE_TASKS_TO_FILE:
                if (task.size() > 0){
                    action = new SaveTasksToFile();
                    action.showActionsInformation();
                    String path = action.readUserInput();
                    if(!path.equals("0"))
                        action.executeAction(path);
                } else {
                    System.out.println("There are not tasks to be saved!");
                }

            case Actions.READ_FROM_FILE:
                action = new ReadFromFile();
                action.showActionsInformation();
                String path = action.readUserInput();
                if(!path.equals("0"))
                    action.executeAction(path);
                break;

            case Actions.EXIT:
                applicationRunning = false;
                break;
        }
    }

    public void showApplicationTitle(){
        System.out.println("To-do List Application");
        System.out.println("-----------------------");
    }

    public void showAvailableActions(){
        System.out.println("");
        System.out.println("1. Add a task");
        System.out.println("2. Mark task as done");
        System.out.println("3. Remove task");
        System.out.println("4. Edit task");
        System.out.println("5. Display all tasks");
        System.out.println("6. Sort tasks by date");
        System.out.println("7. Sort tasks by project");
        System.out.println("8. Sort tasks by file");
        System.out.println("9. Read from file");
        System.out.println("10. Exit");
        System.out.println("");
    }

    public int readAction(){
        List<Integer> availabeActions = Arrayu.asList(1,2,3,4,5,6,7,8,9,10);
        while(true){
            try {
                System.out.println("Enter action: ");
                Scanner scan = new Scanner(System.in);
                int action = scan.nextInt();
                if (availabeActions.contains(action)){
                    return action;
                } else {
                    System.out.println("Please enter a valid action from the list: ");
                }
            } catch (Exception e) {
                System.out.println("Action must be a number...");
            }
        }
    }
    
}
    

