#ini  komentar dalam ruby -> variabel
#tipeData -> string, number, array, hash
text = "Halo semuanya!"
text2 = "...apa kabar?"
nama1 = " Kamil"
nama2 = " Kamachi"
puts text+text2+nama2

a = "20" #string
b = "30" #string
c = 20 #integer
d = 30 #integer
msg = "gitu loh!"
puts a+b #output = 2030
puts c+d #output = 50

#puts "Hasil dari c + d adalah "+c+d error
puts "Hasil dari c + d adalah #{c+d} #{msg}" #work
