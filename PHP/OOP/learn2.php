<!-- Belajar Membuat Keturunan atau Inheritance -->

<?php
//class parent
class bapak{
    //property
    public $nama_bapak;

    //method
    function namabapak($bapak)
    {
        $this->nama_bapak=$bapak;
    }
}

class anak extends bapak{
    //property
    public $nama_anak;

    //method
    public function namaanak($anak)
    {
        $this->nama_anak=$anak;
    }
}

//object
$keluarga = new anak;

//mengisi nama
$keluarga->namabapak("Samsul");
$keluarga->namaanak("Jamal");

//menampilkan data
echo "Halo nama bapak ".$keluarga->nama_bapak." dan ";
echo "ini anak bapak namanya ".$keluarga->nama_anak;
?>
