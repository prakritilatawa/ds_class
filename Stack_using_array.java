import jdk.jshell.spi.ExecutionControl.StoppedException;
/*
 * import sun.jvmstat.perfdata.monitor.StoppedException; 

 */

public class stack_array 
{

	private int data[]; 
	private int top;
	
	public stack_array() 
	{
		data = new int[10];
		top=-1;
	}
	
	public stack_array(int capacity) 
	{
		data = new int[capacity];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
		
	}
   
	public int size()
	{
		return top+1;
	}

    public int top() throws StoppedException
    {    
    	if(size()==0)
    	{
    		StoppedException e = new StoppedException();	
    		throw e;
    	}
    	return data[top];
    }

    public void push(int elem) throws StoppedException
    {   
    	if(size()==data.length)
    	{
    		doubleCapacity();	
    	}
    	
    	
    	top++;
    	data[top]=elem;
    }
    
    private void doubleCapacity()
    {
    	int temp[] = data;
    	
    	data = new int[temp.length*2];
    	
    	for(int i=0;i<=top;i++)
    	{
    		data[i]=temp[i];
    	}
    }
    public int pop() throws StoppedException
    {  
    	if(size()==0)
    	{
    		StoppedException e = new StoppedException();	
    		throw e;
    	}
    	
    	int temp = data[top];
    	top--;
    	return temp;
    }
    
}