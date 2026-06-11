🧬 Série de Fibonacci Recursiva (Java)
Este projeto apresenta uma implementação clássica em Java para encontrar o valor de um determinado termo na Série de Fibonacci utilizando o conceito de recursividade.

⚙️ Como Funciona o Algoritmo
A série de Fibonacci é uma sequência numérica onde cada termo, a partir do terceiro, é a soma dos dois termos imediatamente anteriores (ex: 1, 1, 2, 3, 5, 8, 13, 21...). 
O código resolve este problema dividindo a lógica em:

Condição de Parada (Caso Base): Se a posição desejada n for igual a 1 ou 2, o algoritmo interrompe as chamadas e retorna 1, que são os valores iniciais fixos da sequência.

Relação de Recorrência: 
Para qualquer posição maior que 2, o método realiza duas ramificações de chamadas recursivas: uma para achar o termo anterior (n - 1) e outra para o termo retrasado (n - 2), somando os dois resultados.

🚀 Estrutura do Código
O controlador possui o seguinte método principal:
public int fibonacci(int n): Recebe a posição da sequência (índice n) e retorna o número correspondente da série de Fibonacci.
Exemplo de Árvore de Execução
Ao buscar a 4ª posição da série fibonacci(4):
fibonacci(4) se divide em fibonacci(3) + fibonacci(2)
fibonacci(3) se divide em fibonacci(2) + fibonacci(1)
fibonacci(2) e fibonacci(1) atingem o caso base e retornam 1.
Resultado: (1 + 1) + 1 = 3.

🛠️ Requisitos e Tecnologias
Linguagem: Java (JDK 8 ou superior)
Conceito Aplicado: Recursividade Binária (múltiplas chamadas na mesma linha).

📄 Licença
Este projeto está sob a licença MIT.
