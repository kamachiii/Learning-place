#include<stdio.h>
#include<iostream>
using namespace std;

int main()
{
	int a,b,c;
	string nama;
	c=a+b;
	printf("Masukkan Nama: ");
    cin >> nama;
    if (nama == "Kamachi") {
    	printf("\n\n");
    	cout << "=========== PROGRAM OUTPUT ===========" << endl;
    	printf("Yoo Tamuramaro, this secret message.\nIts your program to calculate 2 variable.\n");
    	printf("Its just your small program C++. \nYou dont know whats your dream...\n");
    	printf("YOU SO NOOB\n");
    	cout << "======================================" << endl;
    	printf("\n");
	}else {
	
	printf("Inputkan nilai a: ");
    scanf("%i", &a);
    printf("Inputkan nilai b: ");
    scanf("%i", &b);
    
	cout << "\nHi " << nama << endl;
	if (a>b) {
		printf("%i lebih besar daripada %i",a,b);
	}else if (b>a){
		printf("%i lebih besar daripada %i",b,a);
	}else {
		printf("%i sama dengan %i",a,b);
	}
	printf("\n\n");
	cout << "=========== PROGRAM OUTPUT ===========" << endl;
  	cout << "Progarm ini adalah program untuk\n";
  	cout << "Menampilkan output ke layar komputer.\n";
  	cout << "Output sangat penting buat menampilkan\n";
	cout << "informasi kepada user.\n";
	cout << "======================================" << endl;

  	cout << endl;
  	cout << "Program ini dibuat oleh Kamachi" << endl;
  	
	}
}