#*ini  komentar dalam ruby -> variabel
#*tipeData -> string, number, array, hash
##* Tipe String
text = "Halo semuanya!"
text2 = "...apa kabar?"
nama1 = " Kamil"
nama2 = " Kamachi"
puts text+text2+nama2


##* tipe integer
a = "20" #*string
b = "30" #*string
c = 20.1 #*integer
d = 30.123 #*integer
msg = "gitu loh!"
puts a+b #*output = 2030
puts c+d #*output = 50.223

# puts "Hasil dari c + d adalah "+c+d #!error
puts "Hasil dari c + d adalah #{c+d} #{msg}\n" #*work


#*Perbedaan puts dan print
text = "Hallo "
tuxt = "HeyHey "
#! menampilkan dalam line yang berbeda
# puts text
# puts tuxt

#* menampilkan dalam line yang sama
print text
print tuxt
#* contoh lain
h = "h"
a = "a"
i = "i"
print h
print a
print i

#*memberi line baru
puts ""


#* input dan get.chomp
##* input dan get.chomp String
puts "Umurnya berapa ngabs? "
umur = gets.chomp
puts "Kakinya berapa ngabs? "
kaki = gets.chomp
puts "jadi umur loe #{umur} dan kaki loe #{kaki}"

##* input dan get.chomp integer
puts "Masukkan angka1"
a = gets.chomp
puts "Masukkan angka2"
b = gets.chomp

#!gagal karena dianggap string
puts a+b

#*berhasil karena dianggap integer
puts a.to_i+b.to_i


#*Belajar fungsi dan parameter
def jalan(num1, num2)
  ##* string
  puts "tuk...tuk..."
  puts "tak...tak..."
  ##* integer
  x = 5
  puts "angkanya #{x}"
  ##* integer dari parameter
  puts "Angka dari parameter #{num1}"
  puts "dijumlahkan dengan #{num2}"
  puts "menjadi = #{num1+num2}"
end

jalan(7, 14)


#*Return Ruby
def jumlah(num1, num2)
  puts sedang menjumlahkan
  num = num1+num2
  return num
end
#!gagal
jumlah(10,20)
#*work
##*bisa dengan
puts jumlah(10,20)
##*atau dengan
jml = jumlah(10,20)
puts jml-5

