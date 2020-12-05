#include <stdio.h>
#include <stdlib.h>

int main()
{
    long n, *casa, *kg, *sunet;

    scanf("%ld", &n);
    casa = (long *)malloc(n * sizeof(long));
    kg = (long *)malloc(n * sizeof(long));
    sunet = (long *)calloc(n, sizeof(long));
    for (long i = 0; i < n; i++)
    {
        scanf("%ld", &casa[i]);
    }
    for (long i = 0; i < n; i++)
    {
        scanf("%ld", &kg[i]);
    }
    printf("\n");
    
    long maxSunet = 0;
    long countMaxSunet = 0;
    for (long i = 0; i < n; i++)
    {
        for (long j = i; j < n; j++)
        {
            if (kg[i] > 0)
            {
                sunet[j]++;
                kg[i] = kg[i] - casa[j];
            }
            else
            {
                break;
            }
        }
        if (sunet[i] > maxSunet)
        {
            maxSunet = sunet[i];
            countMaxSunet = 0;
        }
        if (sunet[i] == maxSunet)
        {
            countMaxSunet++;
        }
    }
    printf("%ld %ld\n", maxSunet, countMaxSunet);
}