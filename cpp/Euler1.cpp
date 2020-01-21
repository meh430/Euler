#include <iostream>

int main() {
    int sum = 0;
    for(int i = 1000; i > 0; i--) {
        if ((i % 3 == 0) || (i % 5 == 0)) {
            sum += i;
        }
    }
    
    std::cout << sum - 1000;
}