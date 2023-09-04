package exception_handling;



public class CheckedExcptn 
{
    static void submit() throws AgeException
    {
    	int age=22;
    	int a=10;
    	if(age>21)
    	{
    		System.out.println("application submited");
    	}
    	else
    	{
    		throw new AgeException("Application rejected");
    		
    	}
    }
	
    public static void main(String[] args) 
	{
		try
		{
       
		submit();
		}
	catch(AgeException e)
		{
		System.out.println(e.getmessage());
		}
	}

} 
class AgeException extends Exception
{
	String msg;
	
	AgeException(String msg)
	{
		this.msg=msg;
	}
public String getmessage()
{
	return msg;
}

}
	
	
	
	
	
	
