kendaraan = input("Kendaraan yang digunakan : ")
jam = int(input("Masukkan jumlah jam : "))

tarif = 3000

if jam < 24:
    if jam < 3:
        print("Jadi harga parkir", tarif)
    elif kendaraan == "Motor":
        jam = jam - 1
        for i in range(jam):
            b = 2000 * i
        tarif = tarif + b
        print ("Jadi harga parkir", tarif)
    elif kendaraan == "Mobil":
        jam = jam - 1
        for i in range(jam):
            b = 4000 * i
        tarif = tarif + b
        print ("Jadi harga parkir", tarif)
else:
    m = jam % 24
    mh = jam / 24
    tarif = tarif + (100000 * round(mh))
  
    if kendaraan == "Motor":
        if jam < 3:
            print("Jadi harga parkir", tarif)
        else:
            jam = m - 1
            for i in range(jam):
                b = 2000 * i
            tarif = tarif + b
            print ("Jadi harga parkir", tarif)
    elif kendaraan == "Mobil":
        if jam < 3:
            print("Jadi harga parkir", tarif)
        else:
            jam = m - 1
            for i in range(jam):
                b = 4000 * i
            tarif = tarif + b
            print ("Jadi harga parkir", tarif)