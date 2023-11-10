# PERMAINAN TIC TAC TOE


Suatu permainan Tic Tac Toe dapat diselesaikan dengan menerapkan sebuah algoritma pintar untuk mendapatkan solusi yang paling optimal. Salah satu algoritma yang dapat digunakan adalah algoritma heuristic. Algoritma heuristic adalah algoritma yang menggunakan pengetahuan atau intuisi untuk menemukan solusi yang baik, tetapi tidak selalu terbaik, dalam waktu yang singkat. Algoritma best first search adalah algoritma heuristik yang melakukan pencarian 
terarah pada graf yang setiap simpulnya mewakili suatu titik dalam ruang masalah. <br />

Metode Best First Search dapat diaplikasikan dalam permainan Tic Tac Toe dengan cara melakukan pencarian ruang keadaan yang paling menjanjikan. 
Pada permainan ini, setiap situasi hanya memiliki sejumlah terbatas pilihan langkah yang dapat dilakukan oleh pemain. Dengan menerapkan metode Best First Search, pemain dapat memandu proses pencarian ke arah ruang keadaan yang paling menjanjikan, 
memilih langkah-langkah berikutnya berdasarkan kriteria tertentu, dan melakukan pencarian terbaik pertama . Algoritma A* dapat digunakan 
untuk mengimplementasikan pencarian Best First Search dalam permainan Tic Tac Toe, dimana algoritma ini bekerja dengan melakukan pencarian pada 
sebuah Graf Berarah yang setiap simpulnya menggambarkan sebuah titik di dalam ruang problema . Dengan demikian, metode Best First Search dapat digunakan untuk melakukan pencarian secara optimal dalam permainan Tic Tac Toe . <br />

Pada Penerapannya Algoritma Best First Search dapat menggabungkan kelebihan yang ada pada algoritma Breadth First Search (BFS) dan Depth First Search (DFS).  
Penggabungan tersebut dilakukan dengan cara memilih simpul-simpul yang paling menjanjikan menggunakan fungsi heuristik yang memadai pada setiap simpul. 
Kemudian, algoritma ini mengembangkan simpul yang dipilih dengan aturan-aturan tertentu untuk menghasilkan penggantinya. Jika salah satu simpul tersebut merupakan solusi, proses berhenti. Jika tidak, 
semua simpul baru ditambahkan ke himpunan simpul yang telah dibuat, dan proses ini dilanjutkan. 
Dengan demikian, Best First Search menggabungkan kelebihan BFS dalam melakukan pencarian secara terarah dan kelebihan DFS dalam melakukan pencarian secara mendalam, sehingga dapat menemukan solusi dengan lebih efisien <br />
