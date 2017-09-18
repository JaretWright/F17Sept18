package f17sept18;

/**
 *
 * @author JWright
 */
public class F17Sept18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            method1();
        }
        catch (Exception e)
        {
            System.err.printf("%s%n", e.getMessage());
            
            //obtain the stack trace elements
            StackTraceElement[] stackElements = e.getStackTrace();
            
            System.out.printf("%nStack trace from gteStackTrace:%n");
            System.out.printf("%-20s %-20s %-10s %-10s%n", "Class","File","Line","Method");
            
            //loop through the trace elements
            for (StackTraceElement element : stackElements)
            {
                System.out.printf("%-20s ", element.getClassName());
                System.out.printf("%-20s ", element.getFileName());
                System.out.printf("%5d", element.getLineNumber());
                System.out.printf("     %-10s ", element.getMethodName());
                System.out.println();
            }
        }
    }
    
    public static void method1() throws Exception
    {
        method2();
    }
    
    public static void method2() throws Exception
    {
        method3();
    }
    
    public static void method3() throws Exception
    {
        throw new Exception("Exception thrown in method3");
    }
}
