package f17sept18;

/**
 *
 * @author JWright
 */
public class ShowingFinally {
    public static void main(String[] args)
    {
        try
        {
            throwsException();
        }catch (Exception e)
        {
            System.err.println("Exception thrown in main method");
        }
        doesNotThrowException();
    }
    
    public static void throwsException() throws Exception
    {
        try
        {
            System.out.println("Method throwsException");
            throw new Exception();
        }
        catch (Exception e)
        {
            System.err.println("Exception handled in method throwsException");
            throw e;
        }
        finally
        {
            System.err.println("Finally executed in the throwException method");
        }
    }
    
    public static void doesNotThrowException()
    {
        try
        {
            System.out.println("Method doesNotThrowException");
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
        finally
        {
            System.err.println("finally executed in the method doesNotThrowException");
        }
    }
}
