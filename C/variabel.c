/* program variabel C */
#include <stdio.h>

int main(){
	/* contoh 1 */
	int i;
	
	i = 20;
	
	printf("%d\n", i);
	
	/* contoh 2 */
	int angka1, angka2;
	char huruf;
	float desimal;
	
	angka1 = 10;
	angka2 = 15;
	huruf = 'A';
	desimal = 2.5;
	
	printf("angka1 = %d\nangka2 = %d\nhuruf = %c\ndesimal = %f\n",angka1,angka2,huruf,desimal);
	
	
	/* contoh 3 */
	int j;
	
	scanf("%d\n",&j);
	
	printf("%d",j);
	
	return 0;
}

/* 
	\n digunakan untuk memberi line baru
	%c digunakan untuk menampilkan karakter( char ).
	%h digunakan untuk menampilkan bilangan bulat( short ).
	%d atau %i digunakan untuk menampilkan bilangan bulat( int ).
	&d atau &i digunakan untuk menyimpan bilangan bulat( int ).
	%f digunakan untuk menampilkan bilangan pecahan ( float dan double)
*/