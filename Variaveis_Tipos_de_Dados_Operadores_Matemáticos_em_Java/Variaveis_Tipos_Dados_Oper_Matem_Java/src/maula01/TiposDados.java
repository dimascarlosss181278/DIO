package maula01;

public class TiposDados {

	public static void main(String[] args) {
		// Tipos de Variaveis primitivas Java
		
		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 20000;
		//short s2 = 40000;  - incompativel
		
		long l1 = 1000000000000000000L;
		long l2 = 2004005005000550000L;
		
		//float d1 = 4.5; - incompativel sem o f p/ idenficar tipo float caso contrario sera double
		float d1 = 4.5F;
		float d2 = 4.5f;
		
		double db1 = 85.69;
		double db2 = 85.69D;
		
        char c1 = 'W';		//-- forma explicita
        //char c2 = 'Tw';  - incompativel tipo char é apenas 1 caracter		
        char c3 = '\u0057';	//- codigo unicode do caracter "W", forma implicita	
 
        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dep se se %& 4461455";
        
        String dt1 = "13/03/2022";
        
        boolean bo1 = true;
        boolean bo2 = false;
        
		System.out.println(" tipo byte    : " + b1);
		System.out.println(" tipo byte    : " + b2);
		System.out.println(" tipo short   : " + s1);
		System.out.println(" tipo long    : " + l1 + "L");
		System.out.println(" tipo long    : " + l2 + "l");
		System.out.println(" tipo float   : " + d1 + "F");
		System.out.println(" tipo float   : " + d2 + "f");
		System.out.println(" tipo double  : " + db1 + "d");
		System.out.println(" tipo double  : " + db2 + "D");
		System.out.println(" tipo char    : " + c1);
		System.out.println(" tipo char    : " + c3);
		System.out.println(" tipo String  : " + st1);
		System.out.println(" tipo String  : " + st2);
		System.out.println(" tipo String  : " + st3);
		System.out.println(" tipo String  : " + dt1);
		System.out.println(" tipo boolean : " + bo1);
		System.out.println(" tipo boolean : " + bo2);
	}

}
