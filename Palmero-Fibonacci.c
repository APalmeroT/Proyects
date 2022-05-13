#include <stdio.h>

int main ()
{
    int i, n,f,g,h;
    printf ("Fibonacci.");
    printf ("Valor maximo: ");
    scanf("%d", &n);

    printf("%d ", f);
    for(i=2; i<=n; i++){
        printf("%d ",h);
        h = f + g;
        f = g;
        g = h;
    }

    printf("\n");
    return 0;
}
