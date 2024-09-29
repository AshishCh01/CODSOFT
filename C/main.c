#include<stdio.h>
int main () {
    float rad;
    float area;
    printf("enter rad");
    scanf("%f", &rad);
    printf("area of circle");
    area = 3.14*rad*rad;
    printf(area);
    return 0;
}