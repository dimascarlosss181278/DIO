package maula03;

/* exercicio operadores aritmeticos do curso Variaveis Tipos e Operadores Matema
em java
*/
public class Exercicio {

	public static void main(String[] args) {
	   
      System.out.println("PrePos : ");		
	  prePos();	
	  System.out.println("Aritmetico : ");		
	  aritmetico();	
	  System.out.println("Atribuicao : ");		
	  atribuicao();	
	  System.out.println("Precedencia : ");		
//	  precedencia();	
	}

	private static void prePos() {
		
		int k = 10;
		
		int i = ++k;
		int j = --k;
		
		int l = k++;
		int m = k--;
		
		int x = k;
		
		System.out.println("variavel k sendo k=10 ");		
		System.out.println("variavel i com ++k : " + i);
		System.out.println("variavel j com --k : " + j);
		System.out.println("variavel l com k++ : " + l);
		System.out.println("variavel m com k-- : " + m);
		System.out.println("variavel k sendo k=10 e x=k :" + i);
		System.out.println();
	}

	private static void aritmetico() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int r1 = a+b;
		int r2 = c-a;
		int r3 = d*b;
		int r4 = e/a;
		int r5 = c%b;
		
		System.out.println("a=10,b=20,c=30,d=40,e=50");
		System.out.println("a+b : " + r1);
		System.out.println("c-a : " + r2);
		System.out.println("d*b : " + r3);
		System.out.println("e/a : " + r4);
		System.out.println("c%b : " + r5);
		System.out.println("\n");
	};

	private static void atribuicao() {
		
		int i = 1500;
		short j = 15;
		long l = 500L;
		int k = 35;
		float f = 3.5f;
		double d = f;
		
		System.out.println("  d: " + d);
		
		i += 5;    // i = i + 5
		j -= 3;    // j = j - 3
		d /= 2.7d; // d = d / 2.7d
		l *= 3;    // l = l * 3
		k %= 2;    // k = k % 2
		
		System.out.println(" i += 5    o resultado é: " + i);
		System.out.println(" j -= 3    o resultado é: " + j);
		System.out.println(" d /= 2.7d o resultado é: " + d);
		System.out.println(" l *= 3    o resultado é: " + l);
		System.out.println(" k %= 2    o resultado é: " + k);
		System.out.println("\n");		
	}
	
	
}
