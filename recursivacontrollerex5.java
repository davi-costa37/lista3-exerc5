package lista3rec;

public class recursivacontrollerex5 {
	 public int fibonacci(int n) {

	        /*
	         CONDIÇÃO DE PARADA:
	         Quando n for 1 ou 2.
	         Nessas posições, o valor da série é 1.
	         Então retornamos 1 diretamente.
	        */
	        if (n == 1 || n == 2) {
	            return 1;
	        }

	        /*
	         RELAÇÃO DE CHAMADA DOS PASSOS:

	         A série de Fibonacci é definida como:
	         F(n) = F(n - 1) + F(n - 2)

	         Ou seja:
	         O valor da posição atual (n)
	         é a soma dos dois termos anteriores.

	         Portanto, chamamos recursivamente:
	         fibonacci(n - 1) + fibonacci(n - 2)
	        */

	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
}
