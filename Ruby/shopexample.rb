# memberi harga
harga = 200000;
tarif = harga/4;

#tampilan
puts "== Studio Musik Al izzah =="
puts "\nHarga awal 1 jam : #{harga}"
puts "Untuk jam berikutnya : #{tarif}"
puts "Ingin sewa berapa jam : "

# memasukkan hasil inputan ke var jam
  jam = gets.chomp.to_i

# membuat rumus total harga
  total = (tarif*(jam-1)) + harga;
puts "== Studio Musik Al izzah =="
puts "\nharga 1 jam pertama : #{harga}"
puts "harga berikunya : #{tarif}"
puts "lama main : #{jam}"
puts "\nTotal harga : #{total}"
