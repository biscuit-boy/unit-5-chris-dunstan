public class Task implements Priority{
    private int priorityLevel;
    private String name;
    private boolean isComplete;

    public Task(String name, int priorityLevel){
        this.name = name;
        this.priorityLevel = priorityLevel;
        this.isComplete = false;
    }

    public Task(){
        name = "";
        isComplete = false;
    }

    public void setPriority(int level){
        priorityLevel = level;
    }

    public int getPriority(){
        return priorityLevel;
    }

    public String toString(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void complete(){
        isComplete = true;
    }

    public boolean isComplete(){
        return this.isComplete;
    }


}
