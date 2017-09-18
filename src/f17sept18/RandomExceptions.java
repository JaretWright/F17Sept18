
package f17sept18;

import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Formatter;

/**
 *
 * @author JWright
 */
public class RandomExceptions {
    public static void main(String[] args) throws FileNotFoundException
    {
        SecureRandom random = new SecureRandom();
        Formatter errorLog = new Formatter("exceptions.csv");
        
        for (int i=1 ; i<100000; i++)
        {
            try{
                generateException(random.nextInt(100));
            }
            catch (Exception e)
            {
                errorLog.format("Time: %s, Exception: %s%n", LocalDateTime.now(),
                                                        e.getMessage());
            }
        }
        errorLog.close();
    }
    
    public static void generateException(int exceptionNum) throws Exception
    {
        if (exceptionNum == 0)
            throw new Exception("Wrong password");
        else if (exceptionNum == 1)
            throw new Exception("Invalid input");
        else if (exceptionNum % 3 == 0)
            throw new Exception("Long API response time");
        else if (exceptionNum >= 5)
            throw new Exception("Coding on sunny days produces errors");
        else
            throw new Exception("Sriracha's fault");
    }
}
