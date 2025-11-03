# Soal1MudahNo2
Sebelumnya, kita liat dulu deskripsi soalnya.

Buatlah sebuah program dalam bahasa Java untuk menentukan apakah suatu bilangan yang dimasukkan pengguna adalah bilangan ganjil atau genap.

So, kesimpulannya aku sudah muak. Selalu ada aja tugas kayak gini. Males buat jelasin + buat lagi woilah. Pokoknya, ini intinya:
1. Angka yang diinput nanti akan dianalisis bilangan tersebut termasuk Ganjil atau Genap.

Jadi, simple banget. Bisa memakai if else. Yang bikin mengkhawatirkan yaitu keseringan dapat soal ini.

Sekarang membahas codingan saya. Saya ada 2 tipe, yaitu: Try yang funcnya ada di dalam, dan Try yang funcnya diluar. Di dalamnya, ada 2 tipe lagi. Yaitu, mengurutkan 1 - x dan memberi tau itu bilangan ganjil atau genap (bruteforce). Dan satu lagi langsung ke 1 bilangan (single target). Saya menambahi try catch agar nanti kalau ada orang yang menginput salah, kita bisa memperingatinya.
Cara saya membedakan ganjil atau genap adalah: 
if (i % 2 == 0) {
  System.out.println(i + " adalah Bilangan Genap");
} else {
  System.out.println(i + " adalah Bilangan Ganjil");

Simple. Just like that. and BOOM!

here's the output program image:

![BruteForce](outputs1n2v0)
![Single Target](outputs1n2v1)
