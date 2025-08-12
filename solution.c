#include <stdio.h>

int main() {
	int l;
	scanf("%d", &l);
	
	int arr[l];
    for(int i = 0; i < l; i++){
        scanf("%d", &arr[i]);
    }
    
    int n = 0;
    int max = 0;
    for(int i = 0; i < l; i++){
        if(arr[i] == 0){
            n = 0;
        }
        else{
            n++;
        }
        if(n > max){
            max = n;
        }
    }
    printf("%d\n", max);

}

