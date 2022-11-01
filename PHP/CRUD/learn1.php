<?php
// isi nama host, username mysql, password mysql, dan nama database
$connect = mysqli_connect("localhost","root","","coba_crud");
if ($connect){
    echo "Connection successful";
}else{
    echo "Connection failed";
}
?>
