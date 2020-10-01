package sesson12;

import java.util.ArrayList;

public class ToDoList {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }

    public void removeTask(int numberOfRemovedTask){
        tasks.get(numberOfRemovedTask).setDeleted(true);
    }

    public void isDone(int numberOfDoneTask){
        tasks.get(numberOfDoneTask).setDone(true);
    }

    public ArrayList<Task> getTasks(){
        ArrayList<Task> mainTasks = new ArrayList<>();
        for (Task t : this.tasks){
            if (!t.isDeleted()){
                mainTasks.add(t);
            }
        }
        return mainTasks;
    }

    public ArrayList<Task> getDoneTasks(){
        ArrayList<Task> doneTasks = new ArrayList<>();
        for (Task t : this.getTasks()) {
         if (!t.isDone()){
          doneTasks.add(t);
           }
        }
        return doneTasks;
    }

    public ArrayList<Task> getDeletedTasks(){
        ArrayList<Task> deletedTasks = new ArrayList<>();
        for (Task t : this.tasks){
            if (t.isDeleted()){
                deletedTasks.add(t);
            }
        }
        return deletedTasks;
    }

    public ArrayList<Task> getDeletedTask(){
        ArrayList<Task> recycleBin = new ArrayList<>();
        for (Task t : this.tasks) {
           if (t.isDeleted()){
               recycleBin.add(t);
           }
        }
        return recycleBin;
    }

}

