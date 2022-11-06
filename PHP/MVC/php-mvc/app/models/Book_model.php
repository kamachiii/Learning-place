<?php

class Book_model {
    private $books = [
        [
            'judul' => 'Hujan',
            'penulis' => 'Tereliye',
            'tanggal_selesai' => '2022-06-22',
        ],
        [
            'judul' => 'Pulang',
            'penulis' => 'Tereliye',
            'tanggal_selesai' => '2022-07-17',
        ],
        [
            'judul' => 'Pergi',
            'penulis' => 'Tereliye',
            'tanggal_selesai' =>'2022-07-30',
        ],
        [
            'judul' => 'Bumi',
            'penulis' => 'Tereliye',
            'tanggal_selesai' =>'2021-01-23',
        ],
        [
            'judul' => 'Matahari',
            'penulis' => 'Tereliye',
            'tanggal_selesai' =>'2021-03-07',
        ],
        [
            'judul' => 'Bulan',
            'penulis' => 'Tereliye',
            'tanggal_selesai' =>'2021-05-19',
        ],
        [
            'judul' => 'Bintang',
            'penulis' => 'Tereliye',
            'tanggal_selesai' =>'2022-08-05',
        ],
        [
            'judul' => 'Hutan',
            'penulis' => 'Tereliye',
            'tanggal_selesai' =>'2022-12-29',
        ],
        ];

        public function getBooks()
        {
            return $this->books;
        }
}
?>