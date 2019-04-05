#include<iostream>
#include<algorithm>
#include<functional>

using namespace std;

int main() 
{
	int num;

	cin >> num;

	if (num <= 0) 
	{
		return 0;
	}

	int *a = new int[num];
	int *b = new int[num];
	int sum = 0;

	for (int i = 0; i < num; i++) 
	{
		cin >> a[i];
	}

	for (int i = 0; i < num; i++)
	{
		cin >> b[i];
	}

	sort(a, a + num);
	sort(b, b + num, greater<int>());


	for (int i = 0; i < num; i++)
	{
		sum += a[i] * b[i];
	}

	cout << sum << endl;

	return 0;
}