#include<iostream>
#include<algorithm>
#include<functional>

using namespace std;

int main() 
{
	int num = 0;

	cin >> num;

	if (num < 1 || num > 100000)
		return 0;

	int **x = new int*[num];

	for (int i = 0; i < num; i++) {
		cin >> x[i][i];
		cout << x[i][i];
	}

	sort(x, x + num);

	for (int i = 0; i < num; i++) {
		cout << x[i][i];
	}

	return 0;
}