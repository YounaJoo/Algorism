#include <iostream>
#include <algorithm>
using namespace std;

#define		n		10

///<summery>
/// ����, ����,	��, ��, ���� ���İ� STL ���
///</summery>

//int list[n] = {8, 11, 2, 1, 5, 12, 14, 3, 4, 6};
int list[7] = {5, 9, 3, 8, 1, 4, 2};

void show() 
{
	for (int i = 0; i < n; i++) 
	{
		printf("%d ", list[i]);
	}
}

#pragma region ����
// O(N^2)
// ��������
// �ٷ� ���� �ִ� �͵鳢�� �ϳ� �ϳ� ���ϴ� �������̴�.

void BubbleSort(int* list) 
{
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < (n - 1) - i; j++)
		{
			int temp;
			if (list[j] > list[j + 1])
			{
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
			}
		}
	}
}

// �־��� ��� O(N^2)
// ���� ����
// ���� �ε��� ��ȣ ���� �� �� ���߿� ���� ���ڰ� �� �ڸ��� ���� ����ִ´�
void SelectSort(int* list) 
{
	int index, min, max, temp = { 0 };
	for (int i = 0; i < n; i++)
	{
		min = 9999;
		for (int j = i; j < n; j++)
		{
			if (min > list[j]) {
				min = list[j];
				index = j;
			}
		}
		temp = list[i];
		list[i] = list[index];
		list[index] = temp;
	}
}

// O(nlogN)
// ������
// �Ǻ��� ���Ͽ� �Ǻ��� ū ��, ���� ���� ������ ����.

void QuickSort(int* list, int start, int end) 
{
	// ���Ұ� 1���� ��� �״�� return
	if (start >= end) 
	{
		return;
	}

	// pivot �� ù ��° ����
	int pivot = start;
	int i = start + 1;
	int j = end;
	int temp = 0;

	// ������(�Ǻ�����	ū ���� �ε����� ���� ���� �ε��� ���� ū ���) �� ���� �ݺ�
	while(i <= j) 
	{
		printf("\n %d %d \n", i, j );
		for (int i = 0; i < 7; i++)
		{
			printf("%d ", list[i]);
		}
		while (i <= end && list[i] <= list[pivot]) 
		{
			i++;
		}
		while (j > start && list[j] >= list[pivot]) 
		{
			j--;
		}

		// ���� ������ ���¶�� Ű ���� ��ü
		if(i > j)
		{
			temp = list[j];
			list[j] = list[pivot];
			list[pivot] = temp;
		}
		// �������� �ʾҴٸ� i�� j�� ��ü
		else 
		{
			temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
	}
	QuickSort(list, start, j-1);
	QuickSort(list, j+1, end);

	// main QuickSort(list, 0, n-1);
}

// O(nlogN)
// �� ����(Heap-Tree-Structure �̿�)
// Heap : �ּڰ��̳� �ִ��� ������ ã�Ƴ��� ���� ���� ���� Ʈ���� ������� �ϴ� Ʈ��
// �� ���� �˰��� : Ư���� '�ϳ��� ���'�� ���� �����ϰ� Ư���� ����� �� �ڽ� �߿��� �� ū �ڽİ� �ڽ��� ��ġ�� �ٲ㰡�� ����
// (���������Ͻ�, ���� ���� ���� Root��忡 ����)
void HeapSort(int* heap) 
{
	// heap�� ����
	for (int i = 1; i < n; i++) 
	{
		int a = i;
		do 
		{
			int root = (a - 1) / 2;
			if (heap[root] < heap[a])
			{
				int temp = heap[root];
				heap[root] = heap[a];
				heap[a] = temp;
			}
			a = root;
		} while (a != 0);
	}

	// ���� �ϴ� ������ �ٿ����� �ݺ������� ���� ����
	for (int i = (n - 1); i >= 0; i--) 
	{
		int temp = heap[0];
		heap[0] = heap[i];
		heap[i] = temp;
		int root = 0;
		int a = 1;
		do 
		{
			a = 2 * root + 1;
			// �ڽ� �߿� �� ū ���� ã��
			if (a < i - 1 && heap[a] < heap[a + 1])
			{
				a++;
			}
			// ��Ʈ���� �ڽ��� ũ�ٸ� ��ȯ
			if (a < i && heap[root] < heap[a])
			{
				temp = heap[root];
				heap[root] = heap[a];
				heap[a] = temp;
			}
			root = a;
		} while (a < i);
	}
}

// O(NlogN) �־��� ��� O(N^2)
// ���� ����
// �ϳ��� ū ������ �� ���� ���� ������ ������ �ڿ� ���� ��� �� ������ ��ġ�� ���.
// �迭�� �ϳ��� ������ ���� �ִ� �ΰ��� ¦���� ������ �ݺ�
// �迭 ũ�� 10��� 2/2/2/2/2 -> 4/4/2 -> 4/6 -> 10 �ʺ� N�� ���̰� logN
int size, count = { 0 };
int sorted[n];
void Merge(int a[], int m, int middle, int number) 
{
	int i = m;
	int k = m;
	int j = middle + 1;

	// ���� ������� �迭�� ����
	while (i <= middle && j <= number) 
	{
		if (a[i] <= a[j]) 
		{
			sorted[k] = a[i];
			i++;
		}
		else 
		{
			sorted[k] = a[j];
			j++;
		}
		k++;
	}

	// ���� �����͵� ����
	if (i > middle) 
	{
		for (int t = j; t <= number; t++) 
		{
			sorted[k] = a[t];
			k++;
		}
	}
	else 
	{
		for (int t = i; t <= middle; t++) 
		{
			sorted[k] = a[t];
			k++;
		}
	}
	// ���ĵ� �迭�� ����
	for (int t = m; t <= number; t++) 
	{
		a[t] = sorted[t];
	}
}
void MergeSort(int a[], int m, int number) 
{
	// �̿��� ���� ũ�Ⱑ 1���� ���
	if (m < number) 
	{
		int middle = (m + number) / 2;
		MergeSort(a, m, middle);
		MergeSort(a, middle + 1, number);
		Merge(a, m, middle, number);
	}

	// main��
	// MergeSort(list, 0, n - 1);
}

// STL Sort (������ ����(?)
void STLsort(int* list) 
{
	sort(list, list + n);
}
#pragma endregion

int main() 
{
	//STLsort(list);

	QuickSort(list, 0,6);

	//show();

	return 0;
}