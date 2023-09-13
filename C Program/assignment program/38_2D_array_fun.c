#include<stdio.h>
#define M 5
#define N 5
 // Program to pass the 2D array to a function in C
void assign();
int main()
{
    int arr[M][N];
    assign(arr);
    // print 2D array
    printf("      matrix\n");
    for (int i = 0; i < M; i++)
    {
        for (int j = 0; j < N; j++) {
            printf("%3d", arr[i][j]);
        }
        printf("\n");
    }
    return 0;
}
// Here the parameter is a static 2D array
void assign(int arr[M][N])        
{
    for (int i = 0; i < M; i++)
    {
        for (int j = 0; j < N; j++) {
            arr[i][j] = i + j;
        }
    }
}

