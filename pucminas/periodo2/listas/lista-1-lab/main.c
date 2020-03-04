#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

int **Alocar_matriz(int m, int n);

void exercicio1();

void exercicio2();

void exercicio3();

void exercicio4();

int **Alocar_matriz(int m, int n);

int readInt(char string[]);

void ImprimeVetor(int **matriz, int tam1, int tam2);

int generateRandoms(int lower, int upper);

int main() {
    setlocale(LC_ALL, "portuguese");
    printf("Exercicio 1:\n");
    exercicio1();
    printf("\n");
    printf("Exercicio 2:\n");
    exercicio2();
    printf("\n");
    printf("Exercicio 3:\n");
    exercicio3();
    printf("\n");
    printf("Exercicio 4:\n");
    exercicio4();
    return 0;
}

void exercicio1() {
    int *num = (int *) malloc(sizeof(int)), *ehPrimo = (int *) malloc(sizeof(int));
    int i;
    *num = readInt("Entre com um numero inteiro positivo para descobrir se é primo: ");

    if (*num < 3) {
        printf("Escolha um numero maior ou igual a 3.");
        exit(1);
    }
    for (i = 2; i <= *num / 2; ++i) {
        if (*num % i == 0) {
            *ehPrimo = 1;
            break;
        }
    }

    if (*ehPrimo == 0)
        printf("%d é primo.", *num);
    else
        printf("%d nao é primo.", *num);

    free(num);
    free(ehPrimo);
}

void exercicio2() {
    int size = readInt("Digite o tamanho vetor para ser descoberto o maior e menor valor: ");
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
    printf("O maior numero é: %d\n", *maior);
    printf("O menor numero é: %d\n", *menor);
    free(vetor);
}

void exercicio3() {
    int i;
    int tam;
    do {
        printf("Digite a quantidade de alunos: ");
        scanf("%d", &tam);
    } while (tam <= 0);

    float *vetor_real = (float *) calloc(tam, sizeof(float));
    float aux;
    for (i = 0; i < tam; i++) {
        printf("Digite a nota do aluno de numero %d: ", i);
        scanf("%f", &aux);
        vetor_real[i] = aux;
    }
    aux = 0;
    for (i = 0; i < tam; i++) {
        aux += vetor_real[i];
    }
    printf("A media das notas dos alunos eh: %.2f", (aux / tam));

    free(vetor_real);
}

int readInt(char string[]) {
    int num;
    printf("%s", string);
    scanf("%d", &num);
    return num;
}

void PreencheVetor(int **matriz, int tamM, int tamN) {
    for (int i = 0; i < tamM; i++)
        for (int j = 0; j < tamN; j++)
            matriz[i][j] = generateRandoms(1, 99);
}

void exercicio4() {
    int i, j;
    int tamM, tamN;
    int **matriz1, **matriz2;
    printf("Primeira matriz\n");
    tamM = readInt("Digite o tamanho da primeira dimensão das matrizes: ");
    tamN = readInt("Digite o tamanho da segunda dimensão das matrizes: ");
    matriz1 = Alocar_matriz(tamM, tamN);
    matriz2 = Alocar_matriz(tamM, tamN);

    printf("\n");
    srand(time(0) * 2 + 10 - 99 * 0.5);

    PreencheVetor(matriz1, tamM, tamM);

    PreencheVetor(matriz2, tamM, tamM);

    printf("Primeiro vetor:\n");
    ImprimeVetor(matriz1, tamM, tamM);

    printf("Segundo vetor:\n");
    ImprimeVetor(matriz2, tamM, tamN);

    printf("A soma dos vetores é:\n");

    for (i = 0; i < tamM; i++) {
        for (j = 0; j < tamN; j++) {
            printf("%d ", matriz1[i][j] + matriz2[i][j]);
        }
        printf("\n");
    }
}

void ImprimeVetor(int **matriz, int tam1, int tam2) {
    for (int i = 0; i < tam1; i++) {
        for (int j = 0; j < tam2; j++)
            printf("%02d ", matriz[i][j]);
        printf("\n");
    }
}

int **Alocar_matriz(int m, int n) {
    int i;
    if (m < 1 || n < 1) {
        printf("** Erro: Parametro invalido **\n");
        return (NULL);
    }
    int **matriz = (int **) calloc(m, sizeof(int *));
    if (matriz == NULL) {
        printf("** Erro: Memoria Insuficiente **");
        return (NULL);
    }
    for (i = 0; i < m; i++) {
        matriz[i] = (int *) calloc(n, sizeof(int));

        if (matriz[i] == NULL) {
            printf("** Erro: Memoria Insuficiente **");
            return (NULL);
        }
    }
    return (matriz);
}

int generateRandoms(int lower, int upper) {
    return (rand() % (upper - lower + 1)) + lower;
}