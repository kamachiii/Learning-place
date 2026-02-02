# 📘 Learning C++

<div align="center">

![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=cplusplus&logoColor=white)

*Object-Oriented Programming & System Development*

</div>

---

## 🎯 Tentang Folder Ini

Folder ini berisi pembelajaran saya tentang **C++**, bahasa pemrograman yang powerful untuk system programming, game development, dan aplikasi high-performance. C++ adalah evolusi dari bahasa C dengan tambahan fitur Object-Oriented Programming (OOP).

## 📚 Materi yang Dipelajari

- ✅ Basic Syntax & Variables
- ✅ Control Flow (if-else, loops)
- ✅ Functions & Procedures
- ✅ Object-Oriented Programming (OOP)
- ✅ Classes & Objects
- ✅ Game Development Basics
- 🔄 Data Structures
- 🔄 STL (Standard Template Library)

## 🎮 Project & Latihan

### 1. **Car.cpp** - Game Mobil
Mini game racing dengan kontrol keyboard menggunakan konsep OOP dan manipulasi console.

**Fitur:**
- Control mobil (W/A/S/D)
- Health system
- Speed tracking
- Distance calculation

### 2. **Snake.cpp** - Game Snake
Implementasi klasik game Snake dengan C++.

**Fitur:**
- Movement control
- Food generation
- Score system
- Collision detection

### 3. **Coba1.cpp** - Basic Program
Program dasar untuk belajar input/output dan conditional statement.

### 4. **TemenG.cpp** - Studio Musik Rental
Program perhitungan sewa studio musik dengan sistem tarif per jam.

### 5. **hello.cpp** - Hello World
Program pertama untuk memahami struktur dasar C++.

## 🛠️ Tools & Environment

### IDE/Editor yang Direkomendasikan:
- **[Embarcadero Dev-C++](https://sourceforge.net/projects/embarcadero-devcpp/)** - Lightweight IDE untuk C++
- **Visual Studio Code** - Modern code editor dengan extension C++
- **Visual Studio** - Full-featured IDE dari Microsoft
- **Code::Blocks** - Open source IDE

### Compiler:
- GCC/G++ (MinGW untuk Windows)
- Clang
- MSVC (Visual Studio)

## 🚀 Cara Menjalankan

### Menggunakan Dev-C++:
1. Buka file `.cpp` dengan Dev-C++
2. Klik **Execute** > **Compile & Run** (F11)
3. Program akan compile dan running

### Menggunakan Command Line (g++):
```bash
# Compile
g++ nama_file.cpp -o nama_program

# Run (Windows)
nama_program.exe

# Run (Linux/Mac)
./nama_program
```

### Menggunakan VSCode:
1. Install extension **C/C++** dari Microsoft
2. Install **Code Runner** extension
3. Buka file `.cpp`
4. Klik tombol ▶️ Run atau tekan `Ctrl+Alt+N`

## 📖 Konsep Penting C++

### 1. **Header Files**
```cpp
#include <iostream>  // Input/Output stream
#include <windows.h> // Windows API
#include <conio.h>   // Console Input/Output
```

### 2. **Namespace**
```cpp
using namespace std; // Untuk menggunakan cout, cin, dll tanpa std::
```

### 3. **Basic Structure**
```cpp
#include <iostream>
using namespace std;

int main() {
    cout << "Hello World!" << endl;
    return 0;
}
```

## 🎓 Resources untuk Belajar

- 📚 [cplusplus.com](http://www.cplusplus.com/) - Reference lengkap
- 📚 [LearnCpp.com](https://www.learncpp.com/) - Tutorial step-by-step
- 🎥 [TheCherno C++ Series](https://www.youtube.com/playlist?list=PLlrATfBNZ98dudnM48yfGUldqGD0S4FFb) - YouTube Tutorial
- 📖 [C++ Primer](https://www.amazon.com/Primer-5th-Stanley-B-Lippman/dp/0321714113) - Buku rekomendasi

## 💡 Tips Belajar C++

1. **Mulai dari Dasar** - Pahami syntax dasar sebelum ke OOP
2. **Praktik Konsisten** - Coding setiap hari walau hanya 30 menit
3. **Baca Error Messages** - Compiler memberikan petunjuk yang jelas
4. **Debug dengan Breakpoints** - Gunakan debugger untuk memahami flow program
5. **Baca Code Orang Lain** - Pelajari best practices dari programmer lain

## 🐛 Common Errors

### 1. Missing Semicolon
```cpp
cout << "Hello" // Error: missing semicolon
cout << "Hello"; // Correct
```

### 2. Undeclared Variable
```cpp
cout << nama; // Error: 'nama' undeclared
string nama = "John";
cout << nama; // Correct
```

### 3. Type Mismatch
```cpp
int angka = "123"; // Error: cannot convert string to int
int angka = 123;   // Correct
```

## 🔗 Links Berguna

- [C++ Documentation](https://en.cppreference.com/)
- [Stack Overflow - C++ Tag](https://stackoverflow.com/questions/tagged/c%2b%2b)
- [C++ Core Guidelines](https://isocpp.github.io/CppCoreGuidelines/CppCoreGuidelines)

---

<div align="center">

**Happy Coding! 🚀**

*"C++ is a language that doesn't forgive mistakes, but rewards good programming"*

[⬅️ Kembali ke Main Repository](../)

</div>