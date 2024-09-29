#include<stdio.h>
int main () {
    int size;
    printf("enter size of array");
    scanf("%d", size);
    int arr[size];
    printf("enter %d elements", size);
    for(int i = 0; i < size; i++) {
        printf("element %d:", i + 1);
        scanf("%d", &arr[i]);
    }
    printf("array elements are:");
    for(int i = 0; i < size; i++) {
        printf("%d", arr[i]);
    }
    return 0;
}