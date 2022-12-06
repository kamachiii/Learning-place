/* program if c */
#include <stdio.h>
int main(){

/* Struktur pernyataan if
	-if(ekspresi)
		"perintah";
	-if(ekspresi) {
		"perintah";
	}
*/
	int x;
	x = 10;
	if(x %2 == 0)
		printf("bilangan genap\n");
		
	if(x %2 == 1)
		printf("bilangan ganjil\n");
		
	return 0;
}