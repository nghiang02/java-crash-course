# Java Core – Bài tập AlgoMaster

Code luyện tập Java Core theo khóa [AlgoMaster](https://algomaster.io), nằm trong lộ trình học Backend Java Spring Boot để đi thực tập.

## Môi trường

- JDK 21
- Maven
- IntelliJ IDEA Community

## Cấu trúc

```
src/main/java
├── array/
│   ├── Main.java                    # File mẫu của IntelliJ
│   ├── MinMax.java                  # Tìm min/max bằng vòng lặp và Stream, kiểm tra input
│   ├── DeepCopy.java                # Deep copy vs shallow copy mảng 2 chiều
│   └── MultidimensionalArrays.java  # Bẫy Arrays.asList với int[] và Integer[]
└── string/
    ├── Initial.java                 # Lấy chữ cái đầu của họ tên, xử lý khoảng trắng thừa
    └── MaskEmail.java               # Validate và che email (vd: n*****@gmail.com)
```

## Chạy code

Mỗi class có hàm `main` riêng. Trong IntelliJ: mở file và bấm nút ▶ bên cạnh `main`.

Hoặc dùng terminal:

```bash
mvn compile
java -cp target/classes string.MaskEmail
```

## Tiến độ

| Chủ đề | Trạng thái |
|--------|------------|
| Arrays | ✅ |
| Strings | 🚧 Đang học |
