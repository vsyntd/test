package T050325;

import java.math.*;

public class Main
{

    public static void main(String args[]){ 
        int obereGrenze = 100;
	BigInteger mult = new BigInteger("1");
	
	for( int i = 1; i <= obereGrenze; ++i){
		String param = String.valueOf(i);

		mult = mult.multiply(new BigInteger(param));
	}

	System.out.println("Mult = " + mult);
    }
}
