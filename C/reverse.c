#include<stdio.h>
int main () {
    int arr[] = {1,2,3,4,5};
    int size = sizeof(arr);
    int first = 0;
    int last = size - 1;
    while (first < last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        first++;
        last--;
    }
    printf("reversed array:\n");
    for(int i = 0; i < size; i++) {
        printf(" % d", arr[i]);
    }
    return 0;
}