#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void exercicio1();

void exercicio2();

void exercicio3();

int main() {
    setlocale(LC_ALL, "portuguese");
    exercicio3();
    return 0;
}

void exercicio1() {
    int *num = (int *) (int) malloc(sizeof(int)), *ehPrimo = (int *) (int) malloc(sizeof(int));
    int i;
    printf("entre com um numero inteiro positivo: ");
    scanf("%d", num);
    if (*num < 3) {
        printf("Escolha um numero maior ou igual a 3.");
        exit(1);
    }
    for (i = 2; i <= *num / 2; ++i) {
        // condition for non-prime
        if (*num % i == 0) {
            *ehPrimo = 1;
            break;
        }
    }

    if (*ehPrimo == 0)
        printf("%d eh primo.", *num);
    else
        printf("%d nao eh primo.", *num);

    free(num);
    free(ehPrimo);
}

void exercicio2() {
    int size = 3;
    int j, *maior, *menor;
    int *vetor = (int *) calloc(size, sizeof(int));
    for (j = 0; j < size; ++j) {
        printf("Digite o valor da posicao %d do vetor: ", j);
        scanf("%d", &vetor[j]);
    }
    menor = &vetor[0];
    maior = menor;
    for (j = 0; j < size; ++j) {
        if (vetor[j] < *menor) {
            menor = &vetor[j];
        }
        if (vetor[j] > *maior) {
            maior = &vetor[j];
        }
    }
    printf("O maior numero eh: %d\n", *maior);
    printf("O menor numero eh: %d\n", *menor);
    free(vetor);
}

void exercicio3() {
    int i;
    int TAM;
    do {
        printf("Digite a quantidade de alunos: ");
        scanf("%d", &TAM);
    } while (TAM <= 0);

    float *vetor_real = (float *) calloc(TAM, sizeof(float));
    float aux;
    for (i = 0; i < TAM; i++) {
        printf("Digite a nota do aluno de numero %d: ", i);
        scanf("%f", &aux);
        vetor_real[i] = aux;
    }
    aux = 0;
    for (i = 0; i < TAM; i++) {
        aux += vetor_real[i];
    }
    printf("A media das notas dos alunos eh: %.2f", (aux / TAM));

    free(vetor_real);

}
