import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     System.out.println("Welcome to Any.Do Demo" );
     System.out.println("Please select a List from below" );
     System.out.println("==========================================================" ); //welcome message, home setting
     
        ArrayList lists = new ArrayList();
        lists.add("All");
        lists.add("To Do");
        lists.add("Grocery");
        lists.add("Add list");
        System.out.println(lists);
        System.out.println("==========================================================" );
        
        ArrayList completed = new ArrayList();  //ALL List
        ArrayList ongoing = new ArrayList();
        ArrayList coming = new ArrayList();
        
        ArrayList TDcompleted = new ArrayList();  //To do list
        ArrayList TDongoing = new ArrayList();
        ArrayList TDcoming = new ArrayList();
        
        ArrayList Gcompleted = new ArrayList();  //Grocery List
        ArrayList Gongoing = new ArrayList();
        ArrayList Gcoming = new ArrayList();
        ///////////////////////////////////////////////////////////////////////////////// DEFAULT ITEMS
        completed.add("CompTaskAll");
        ongoing.add("OngoTaskAll");
        coming.add("ComingTaskAll");
        
        TDcompleted.add("CompTaskToDo");
        TDongoing.add("OngoTaskToDo");
        TDcoming.add("ComingTaskToDo");
        completed.add("CompTaskToDo");
        ongoing.add("OngoTaskToDo");
        coming.add("ComingTaskToDo");
        
        Gcompleted.add("CompTaskGrocery");
        Gongoing.add("OngoTaskGrocery");
        Gcoming.add("ComingTaskGrocery");
        completed.add("CompTaskGrocery");
        ongoing.add("OngoTaskGrocery");
        coming.add("ComingTaskGrocery");
        ////////////////////////////////////////////////////////////////////////////////
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter the list you'd like to enter with no space: ");
        String choice = reader.next();
        
        if(choice.equalsIgnoreCase("All")){
            System.out.println("entered all List");
            System.out.println("==========================================================" );
            System.out.println(" completed ");
            System.out.println(completed);
            System.out.println(" ongoing ");
            System.out.println(ongoing);
            System.out.println(" coming");
            System.out.println(coming);
            System.out.println("==========================================================" );
            System.out.println(" ");
            System.out.println("To Add a task to list please type - add");
            System.out.println("to Delete from all list please type- del");
            System.out.println("to return please type - return");
            String choice2 = reader.next();
            
            System.out.println("==========================================================" );
            /////////////////////////////////////////////////////////////////////////////////////
            if(choice2.equalsIgnoreCase("Add")){
                System.out.println("please specify which list to add item to");
                System.out.println(" Completed, ongoing, coming");
                String addTaskList = reader.next(); 
                
                if(addTaskList.equalsIgnoreCase("completed")){
                    System.out.println("Please enter task(one word for now)");
                    String addtask = reader.next();
                    completed.add(addtask);
                    System.out.println("==========================================================");
                    System.out.println("Task added, new completed list");
                    System.out.println(completed);
                    System.out.println("Task added, new ALL list");
                    System.out.println(completed);
                };
                if(addTaskList.equalsIgnoreCase("ongoing")){
                     System.out.println("Please enter task(one word for now)");
                    String addtask = reader.next();
                    completed.add(addtask);
                    System.out.println("==========================================================");
                    System.out.println("Task added, new ongoing list");
                    System.out.println(ongoing);
                    System.out.println("Task added, new ALL list");
                    System.out.println(ongoing);
                };
                if(addTaskList.equalsIgnoreCase("coming")){
                     System.out.println("Please enter task(one word for now)");
                    String addtask = reader.next();
                    completed.add(addtask);
                    System.out.println("==========================================================");
                    System.out.println("Task added, new coming list");
                    System.out.println(coming);
                    System.out.println("Task added, new ALL list");
                    System.out.println(coming);
                };
           
                
            };
            //////////////////////////////////////////////////////////////////////////////////////
            if(choice2.equalsIgnoreCase("del")){
                System.out.println("please specify which list to del item frim");
                System.out.println(" Completed, ongoing, coming");
                String listremoveItem = reader.next();  
                
                if(listremoveItem.equalsIgnoreCase("completed")){
                    System.out.println("please item to remove from list");
                    System.out.println(completed);
                    String removetask = reader.next();
                    completed.remove(removetask);
                    System.out.println("==========================================================");
                    System.out.println("Task removed, new completed list");
                    System.out.println(completed);
                    System.out.println("Task removed, new ALL list");
                    System.out.println(completed);
                };
                if(listremoveItem.equalsIgnoreCase("ongoing")){
                    System.out.println("please item to remove from list");
                    System.out.println(ongoing);
                    String removetask = reader.next();
                    completed.remove(removetask);
                    System.out.println("==========================================================");
                    System.out.println("Task removed, new completed list");
                    System.out.println(ongoing);
                    System.out.println("Task removed, new ALL list");
                    System.out.println(ongoing);
                };
                if(listremoveItem.equalsIgnoreCase("coming")){
                    System.out.println("please item to remove from list");
                    System.out.println(coming);
                    String removetask = reader.next();
                    completed.remove(removetask);
                    System.out.println("==========================================================");
                    System.out.println("Task removed, new completed list");
                    System.out.println(coming);
                    System.out.println("Task removed, new ALL list");
                    System.out.println(coming);
                };
                
///////////////////////////////////////////////////////////////////////////////////////////////////////////
            };
            if(choice2.equalsIgnoreCase("return")){
               System.exit(0); // return to home page
                };
            
        };
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(choice.equalsIgnoreCase("ToDo")){
            System.out.println("entered To do List");
            System.out.println("==========================================================" );
            System.out.println(" completed ");
            System.out.println(TDcompleted);
            System.out.println(" ongoing ");
            System.out.println(TDongoing);
            System.out.println(" coming");
            System.out.println(TDcoming);
            System.out.println("==========================================================" );
            System.out.println(" ");
            System.out.println("To Add a task to list please type - add");
            System.out.println("to Delete from all list please type- del");
            System.out.println("to return please type - return");
            String choice2 = reader.next();
            System.out.println("==========================================================" );
            /////////////////////////////////////////////////////////////////////////////////////
            if(choice2.equalsIgnoreCase("Add")){
                System.out.println("please specify which list to add item to");
                System.out.println(" Completed, ongoing, coming");
                String addTaskList = reader.next(); 
                
                if(addTaskList.equalsIgnoreCase("completed")){
                    System.out.println("Please enter task(one word for now)");
                    String addtask = reader.next();
                    TDcompleted.add(addtask);
                    completed.add(addtask);
                    System.out.println("==========================================================");
                    System.out.println("Task added, new completed list");
                    System.out.println(TDcompleted);
                    System.out.println("Task added, new ALL list");
                    System.out.println(completed);
                };
                if(addTaskList.equalsIgnoreCase("ongoing")){
                     System.out.println("Please enter task(one word for now)");
                    String addtask = reader.next();
                    TDcompleted.add(addtask);
                    completed.add(addtask);
                    System.out.println("==========================================================");
                    System.out.println("Task added, new ongoing list");
                    System.out.println(TDongoing);
                    System.out.println("Task added, new ALL list");
                    System.out.println(ongoing);
                };
                if(addTaskList.equalsIgnoreCase("coming")){
                     System.out.println("Please enter task(one word for now)");
                    String addtask = reader.next();
                    TDcompleted.add(addtask);
                    completed.add(addtask);
                    System.out.println("==========================================================");
                    System.out.println("Task added, new coming list");
                    System.out.println(TDcoming);
                    System.out.println("Task added, new ALL list");
                    System.out.println(coming);
                };

                
            };
            //////////////////////////////////////////////////////////////////////////////////////
            if(choice2.equalsIgnoreCase("del")){
                System.out.println("please specify which list to del item frim");
                System.out.println(" Completed, ongoing, coming");
                String listremoveItem = reader.next();  
                
                if(listremoveItem.equalsIgnoreCase("completed")){
                    System.out.println("please item to remove from list");
                    System.out.println(completed);
                    String removetask = reader.next();
                    completed.remove(removetask);
                    TDcompleted.remove(removetask);
                    System.out.println("==========================================================");
                    System.out.println("Task removed, new completed list");
                    System.out.println(TDcompleted);
                    System.out.println("Task removed, new ALL list");
                    System.out.println(completed);
                };
                if(listremoveItem.equalsIgnoreCase("ongoing")){
                    System.out.println("please item to remove from list");
                    System.out.println(ongoing);
                    String removetask = reader.next();
                    completed.remove(removetask);
                    TDcompleted.remove(removetask);
                    System.out.println("==========================================================");
                    System.out.println("Task removed, new completed list");
                    System.out.println(TDongoing);
                    System.out.println("Task removed, new ALL list");
                    System.out.println(ongoing);
                };
                if(listremoveItem.equalsIgnoreCase("coming")){
                    System.out.println("please item to remove from list");
                    System.out.println(coming);
                    String removetask = reader.next();
                    completed.remove(removetask);
                    TDcompleted.remove(removetask);
                    System.out.println("==========================================================");
                    System.out.println("Task removed, new completed list");
                    System.out.println(TDcoming);
                    System.out.println("Task removed, new ALL list");
                    System.out.println(coming);
                };
                
//////////////////////////////////////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////////////////////
            };
            if(choice2.equalsIgnoreCase("return")){
               System.exit(0); // return to home page
            };
        };
        //////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        if(choice.equalsIgnoreCase("Grocery")){
        System.out.println("entered Grocery List");
            System.out.println("==========================================================" );
            System.out.println(" completed ");
            System.out.println(Gcompleted);
            System.out.println(" ongoing ");
            System.out.println(Gongoing);
            System.out.println(" coming");
            System.out.println(Gcoming);
            System.out.println("==========================================================" );
            System.out.println(" ");
            System.out.println("To Add a task to list please type - add");
            System.out.println("to Delete from all list please type- del");
            System.out.println("to return please type - return");
            String choice2 = reader.next();
            System.out.println("==========================================================" );
            /////////////////////////////////////////////////////////////////////////////////////
        
      if(choice2.equalsIgnoreCase("Add")){
                System.out.println("please specify which list to add item to");
                System.out.println(" Completed, ongoing, coming");
                String addTaskList = reader.next(); 
                
                if(addTaskList.equalsIgnoreCase("completed")){
                    System.out.println("Please enter task(one word for now)");
                    String addtask = reader.next();
                    Gcompleted.add(addtask);
                    completed.add(addtask);
                    System.out.println("==========================================================");
                    System.out.println("Task added, new completed list");
                    System.out.println(Gcompleted);
                    System.out.println("Task added, new ALL list");
                    System.out.println(completed);
                };
                if(addTaskList.equalsIgnoreCase("ongoing")){
                     System.out.println("Please enter task(one word for now)");
                    String addtask = reader.next();
                    Gcompleted.add(addtask);
                    completed.add(addtask);
                    System.out.println("==========================================================");
                    System.out.println("Task added, new ongoing list");
                    System.out.println(Gongoing);
                    System.out.println("Task added, new ALL list");
                    System.out.println(ongoing);
                };
                if(addTaskList.equalsIgnoreCase("coming")){
                     System.out.println("Please enter task(one word for now)");
                    String addtask = reader.next();
                    Gcompleted.add(addtask);
                    completed.add(addtask);
                    System.out.println("==========================================================");
                    System.out.println("Task added, new coming list");
                    System.out.println(Gcoming);
                    System.out.println("Task added, new ALL list");
                    System.out.println(coming);
                };

                
            };
            //////////////////////////////////////////////////////////////////////////////////////
            if(choice2.equalsIgnoreCase("del")){
                System.out.println("please specify which list to del item frim");
                System.out.println(" Completed, ongoing, coming");
                String listremoveItem = reader.next();  
                
                if(listremoveItem.equalsIgnoreCase("completed")){
                    System.out.println("please item to remove from list");
                    System.out.println(completed);
                    String removetask = reader.next();
                    completed.remove(removetask);
                    Gcompleted.remove(removetask);
                    System.out.println("==========================================================");
                    System.out.println("Task removed, new completed list");
                    System.out.println(Gcompleted);
                    System.out.println("Task removed, new ALL list");
                    System.out.println(completed);
                };
                if(listremoveItem.equalsIgnoreCase("ongoing")){
                    System.out.println("please item to remove from list");
                    System.out.println(ongoing);
                    String removetask = reader.next();
                    completed.remove(removetask);
                    Gcompleted.remove(removetask);
                    System.out.println("==========================================================");
                    System.out.println("Task removed, new completed list");
                    System.out.println(Gongoing);
                    System.out.println("Task removed, new ALL list");
                    System.out.println(ongoing);
                };
                if(listremoveItem.equalsIgnoreCase("coming")){
                    System.out.println("please item to remove from list");
                    System.out.println(coming);
                    String removetask = reader.next();
                    completed.remove(removetask);
                    Gcompleted.remove(removetask);
                    System.out.println("==========================================================");
                    System.out.println("Task removed, new completed list");
                    System.out.println(Gcoming);
                    System.out.println("Task removed, new ALL list");
                    System.out.println(coming);
                };
        
        };
        //////////////////////////////////////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////////////////////
            
            if(choice2.equalsIgnoreCase("return")){
               System.exit(0); // return to home page
            };
    };
 
};
}
