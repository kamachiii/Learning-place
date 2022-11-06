<div class="container">
    <h3 class="mb-3 text-capitalize">Daftar Buku <?= $data['nama'] ?></h3>
    <table class="table table-success table-striped table-bordered">
        <thead>
            <tr>
                <th scope="col">No</th>
                <th scope="col">Judul</th>
                <th scope="col">Penulis</th>
                <th scope="col">Tanggal Selesai</th>
            </tr>
        </thead>
        <tbody>
            <?php
            $no = 1;
            foreach ($data['buku'] as $buku) {
                ?>
                <tr>
                    <th scope="row"><?php echo $no++ ?></th>
                    <td><?= $buku['judul'] ?></td>
                    <td><?= $buku['penulis'] ?></td>
                    <td><?= $buku['tanggal_selesai'] ?></td>
                </tr>
                <?php } ?>
        </tbody>
    </table>
    <a href="<?= BASE_URL ?>/home/index" class="btn btn-primary">Kembali</a>
</div>