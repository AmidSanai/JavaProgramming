package sesson12;

public class Task {
    private String nameOfTask;
    private boolean isDone = false;
    private boolean isDeleted = false;

    public String getNameOfTask() {
        return nameOfTask;
    }

    public void setNameOfTask(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Task{" +
                "nameOfTask='" + nameOfTask + '\'' +
                ", isDone=" + isDone +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
