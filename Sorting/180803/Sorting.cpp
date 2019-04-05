#include <iostream>
#include <algorithm>
using namespace std;

#define		n		10

///<summery>
/// 버블, 선택,	퀵, 힙, 병합 정렬과 STL 사용
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

#pragma region 정렬
// O(N^2)
// 버블정렬
// 바로 옆에 있는 것들끼리 하나 하나 비교하는 연산자이다.

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

// 최악의 경우 O(N^2)
// 선택 정렬
// 기준 인덱스 번호 기준 그 앞 수중에 기준 숫자가 들어갈 자리에 수를 집어넣는다
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
// 퀵정렬
// 피봇을 정하여 피봇을 큰 수, 작은 수를 정렬해 간다.

void QuickSort(int* list, int start, int end) 
{
	// 원소가 1개인 경우 그대로 return
	if (start >= end) 
	{
		return;
	}

	// pivot 은 첫 번째 원소
	int pivot = start;
	int i = start + 1;
	int j = end;
	int temp = 0;

	// 엇갈릴(피복보다	큰 수의 인덱스가 작은 수의 인덱스 보다 큰 경우) 때 까지 반복
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

		// 현재 엇갈린 상태라면 키 값과 교체
		if(i > j)
		{
			temp = list[j];
			list[j] = list[pivot];
			list[pivot] = temp;
		}
		// 엇갈리지 않았다면 i와 j를 교체
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
// 힙 정렬(Heap-Tree-Structure 이용)
// Heap : 최솟값이나 최댓값을 빠르게 찾아내기 위해 완전 이진 트리를 기반으로 하는 트리
// 힙 생성 알고리즘 : 특정한 '하나의 노드'에 대해 수행하고 특정한 노드의 두 자식 중에서 더 큰 자식과 자신의 위치를 바꿔가며 정렬
// (오른차순일시, 가장 작은 수가 Root노드에 존재)
void HeapSort(int* heap) 
{
	// heap을 구성
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

	// 정렬 하는 범위를 줄여가며 반복적으로 힙을 구성
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
			// 자식 중에 더 큰 값을 찾기
			if (a < i - 1 && heap[a] < heap[a + 1])
			{
				a++;
			}
			// 루트보다 자식이 크다면 교환
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

// O(NlogN) 최악의 경우 O(N^2)
// 병합 정렬
// 하나의 큰 문제를 두 개의 작은 문제로 분할한 뒤에 각자 계산 후 다음에 합치는 방법.
// 배열을 하나씩 나누고 옆에 있는 두개씩 짝지어 정렬을 반복
// 배열 크기 10경우 2/2/2/2/2 -> 4/4/2 -> 4/6 -> 10 너비가 N번 높이가 logN
int size, count = { 0 };
int sorted[n];
void Merge(int a[], int m, int middle, int number) 
{
	int i = m;
	int k = m;
	int j = middle + 1;

	// 작은 순서대로 배열에 삽입
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

	// 남은 데이터도 삽입
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
	// 정렬된 배열을 삽입
	for (int t = m; t <= number; t++) 
	{
		a[t] = sorted[t];
	}
}
void MergeSort(int a[], int m, int number) 
{
	// 이외의 경우는 크기가 1개인 경우
	if (m < number) 
	{
		int middle = (m + number) / 2;
		MergeSort(a, m, middle);
		MergeSort(a, middle + 1, number);
		Merge(a, m, middle, number);
	}

	// main에
	// MergeSort(list, 0, n - 1);
}

// STL Sort (퀵정렬 변형(?)
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