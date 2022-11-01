<?php

//Membuat class
class kendaraan{

    //Membuat property
    //Enkapsulasi property
    public $warna = "Merah";
    public $merek = "Toyota";
    public $user = "Pak Ijo";
    /*Enkapsulasi Property :
        - Public = bisa diakses dengan bebas
        - private = hanya bisa diakses didalam class
        - protected = hanya bisa diakses oleh keturunannya
    */

    //Membuat Method

    //method construct
    function __construct() {
        echo "Warna Mobil ".$this->warna;
        echo "<br>";
    }

    function maju(/*Parameter*/){
        echo "Merek Mobil ".$this->merek;
        echo "<br>";
    }

    //method destruct
    function __destruct(){
        echo "Pengguna Mobil ".$this->user;
        echo "<hr><br>";
    }
}

//Membuat object
$mobil = new kendaraan();

//Memanggil object
echo $mobil->maju();
