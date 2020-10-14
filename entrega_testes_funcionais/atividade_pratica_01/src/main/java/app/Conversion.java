package app;

import java.lang.*;
import org.apache.commons.math3.util.FastMath;

public class Conversion{
    
    public static Integer toMillimeters(Integer n) {
		if(0 < n && n < 999999){
			int n1 = n.intValue();
			int x = 1000;
			int result = FastMath.multiplyExact(n1, x);//biblioteca de terceiros utilizada para a implementação
			Integer result2 = new Integer(result);
			return result2; //converte o numero para milimetros multiplicando por 1000
		} else {
			return null;
		}
	}
}
