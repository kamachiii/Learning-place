<?php

class Book extends Controller {
    public function index($pengguna = 'anda')
    {
        $data['judul'] = 'Daftar Buku';
        $data['buku'] = $this->model('Book_model')->getBooks();
        $data['nama'] = $pengguna;
        $this->view('templates/header', $data);
        $this->view('book/index', $data);
        $this->view('templates/footer');
    }
}
?>