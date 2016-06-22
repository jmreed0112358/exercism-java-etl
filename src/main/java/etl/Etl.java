import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) throws NullPointerException, InvalidParameterException{
	   if ( old == null ) {
		   throw new NullPointerException();
	   } else if ( old.isEmpty( ) ) {
		   throw new InvalidParameterException();
	   }
	   
	   Map<String, Integer> result = new HashMap<String, Integer>();
	   
	   return result;
   }
}
