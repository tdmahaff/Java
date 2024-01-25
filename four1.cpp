
/*
Write a program that prompts the user to input a number. The pro-
gram should then output the number and a message saying whether
the number is positive, negative, or zero.
*/

#include <iostream>
using namespace std;

int main() {

	int num1;
	cout << "Input a number: ";
	cin >> num1;

	if (num1 > 0)
		cout << "Number is positive";
	else if (num1 < 0)
		cout << "Number is negative";
	else
		cout << "Number is zero";

	return 0;

}