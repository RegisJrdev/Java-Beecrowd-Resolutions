/*Leia 2 valores inteiros e armazene-os nas variáveis A e B.
Efetue a soma de A e B atribuindo o seu resultado na variável X.
Imprima X conforme exemplo apresentado abaixo.
Não apresente mensagem alguma além daquilo que está sendo especificado
e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha.
Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.

|      Entrada      |    Saída     |
|-------------------|--------------|
|        10,9       |      19      |
*/

package problems;
import java.util.Scanner;

public class Problem1001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int soma = num1 + num2;

        System.out.println("X = " + soma);
    }
}
