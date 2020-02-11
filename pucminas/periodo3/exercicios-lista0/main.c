#include <stdio.h>
#include <math.h>

void exercicio3() {
    float salario;
    printf("Digite o valor do salário:\n");
    scanf("%f", &salario);
    salario = salario * (salario < 1200 ? 1.1 : 1.05);
    printf("O salário com o aumento é: %f", salario);
}

void exercicio4() {
    int num1 = 0, num2 = 0, decisao = 0;
    double raiz = 0.0;
    printf("Digite\n1- para somar dois número\n2- raiz quadrada de um número\n");
    scanf("%u", &decisao);
    if (decisao == 1) {
        printf("Digite o primerio número\n");
        scanf("%d", &num1);
        printf("Digite o segundo número\n");
        scanf("%d", &num2);
        printf("A soma é: %d\n", (num1 + num2));
    } else {
        printf("Digite o número\n");
        scanf("%lf", &raiz);
        printf("Raiz: %f\n", sqrt(raiz));
    }
}

void exercicio5() {
    int nota1, nota2, nota3;
    printf("Digite a pimeira nota:\n");
    scanf("%d", &nota1);
    printf("Digite a segunda nota:\n");
    scanf("%d", &nota2);
    printf("Digite a terceira nota:\n");
    scanf("%d", &nota3);

    float media = (nota1 + nota2 + nota3) / 3;
    if (media >= 0 && media < 4) {
        printf("Foi reprovado");
    } else if (media >= 4 && media < 6) {
        printf("Foi para exame especial");
    } else if (media >= 6 && media <= 10) {
        printf("Foi aprovado");
    }
}

void exercicio6() {
    int num1, num2;
    printf("Digite o primerio número\n");
    scanf("%d", &num1);
    printf("Digite o segundo número\n");
    scanf("%d", &num2);
    int soma = num1 + num2;
    printf("A soma é: ");
    printf(soma % 2 == 0 ? "par" : "ímpar");
    printf("\nE o resultado = %d\n", (num1 + num2));
}

int main() {
    exercicio6();
    return 0;
}