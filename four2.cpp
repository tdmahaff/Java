/*
Write a program that prompts the user to input three numbers. The
program should then output the numbers in ascending order.
*/

#include <iostream>
using namespace std;

int main() {

	int num1, num2, num3, max, min, med;
	cout << "Enter three numbers: ";
	cin >> num1 >> num2 >> num3;

	if (num1 > num2 && num1 > num3) {
		max = num1;
		if (num3 > num2) {
			med = num3;
			min = num2;
		}
		else {
			med = num2;
			min = num3;
		}
	}
	else if (num2 > num1 && num2 > num3) {
		max = num2;
		if (num1 > num3) {
			med = num1;
			min = num3;
		}
		else {
			med = num3;
			min = num1;
		}
	}
	else if (num3 > num2 && num3 > num1) {
		max = num3;
		if (num2 > num1) {
			med = num2;
			min = num1;
		}
		else {
			med = num1;
			min = num2;
		}

	}

	cout << "Max: " << max << " Med: " << med << " Min: " << min;

	return 0;
	
}