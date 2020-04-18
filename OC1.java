package oc1;
import java.util.Date;

class OC extends Date {
	private int id; 
	private String taskName; 
	private boolean isDone; 
	private Date taskCreated, taskCompleted, deadline;
	private static int autoIncrementingId = 1;
        public int getId()
        {
            return id;
        }
        public void setTaskName(String tsk)
        {
            taskName=tsk;
        }
        public String getTaskName()
        {
            return taskName;
        }
         public void setIsDone(boolean isd)
        {
            isDone=isd;
        }
        public boolean getIsDone()
        {
            return isDone;
        }
        public void setTaskCreated(Date tskcrd)
        {
            taskCreated=tskcrd;
        }
        public Date getTaskCreated()
        {
            return taskCreated;
        }
         public void setTaskCompleted(Date tskcmd)
        {
            taskCompleted=tskcmd;
        }
        public Date getTaskCompleted()
        {
            return taskCompleted;
        }
         public void setDeadLine(Date ddl)
        {
            deadline=ddl;
        }
        public Date getDeadLine()
        {
            return deadline;
        }
        

	public OC(String taskName, Date deadline) {
		this.taskName = taskName;
		id = autoIncrementingId++;
		this.deadline = deadline;
		isDone = false;
		taskCreated = new Date();
	}
}


public class OC1 {

   
    public static void main(String[] args) {
       
    }
    
}