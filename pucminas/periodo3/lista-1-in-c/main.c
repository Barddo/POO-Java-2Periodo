#include <stdio.h>
#include <stdlib.h>
int mdc(int *num1, int *num2);

int main() {
    int *num1, *num2;
    printf("Digite o primeiro numero\n");
    scanf("%d", &num1);
    printf("Digite o segundo numero\n");
    scanf("%d", &num2);

    printf("O menor divisor comum eh: %d", mdc(&num1, &num2));
    return 0;
}

int mdc(int *num1, int *num2) {
    if (*num1 % *num2 == 0) return *num2;
    int *temp = *num1 % *num2;
    return mdc(&num2, &temp);
}
