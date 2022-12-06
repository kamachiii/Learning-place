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
x = 5;
if(x % 2 == 0)
	printf("bilangan genap\n");
		
if(x % 2 == 1)
	printf("bilangan ganjil\n");
		
/* menggunakan if-else */
int y = 10;
if(y % 2 == 0){
	printf("bilangan genap\n");
}else{
	printf("bilangan ganjil\n");
}

/* menggunakan elseif */
int nilai = 80;
if(nilai >= 90){
	printf("Nilai huruf : A\n");
}else if(nilai >=75){
	printf("Nilai huruf : B\n");
}else if(nilai >=60){
	printf("Nilai huruf : C\n");
}else if(nilai >=40){
	printf("Nilai huruf : D\n");
}else {
	printf("Nilai huruf : E\n");
}
printf("Dengan perolehan nilai : %d\n",nilai);

/* menggunakan tenary */
int z;
z = 25;
printf("%s", ((z % 2 == 0) ? ("bilangan genap") : ("bilangan ganjil")));

return 0;
}