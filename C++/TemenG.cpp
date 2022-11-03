#include<iostream>
using namespace std;

main (){
	
	int harga, jam, tarif, total;
	harga = 200000;
	tarif = harga/4;
	
	cout<<"Studio Musik Al izzah"<<endl;
	cout<<"Harga awal 1 jam : " << harga <<endl;
	cout<<"Untuk jam berikutnya : "<< tarif <<endl;
	cout<<"Ingin sewa berapa jam : ";
	cin>>jam;
	total = (tarif*(jam-1)) + harga;
	cout<<"==============="<<endl;
	cout<<"Total harga : "<<total<<endl;
	return 0;
}