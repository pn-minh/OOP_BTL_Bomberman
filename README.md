# OOP_BTL_Bomberman
Trường Đại học Công nghệ - Đại học Quốc gia Hà Nội

Môn học: Lập trình hướng đối tượng (Object-oriented programming)

Lớp học phần: INT2204 40

Giảng viên: TS.Trần Hoàng Việt ,Ths.Mai Thanh Minh

Bài tập lớn - Game Bomberman

Ngôn ngữ lập trình: Java

IDE: IntelliJ IDEA 2022.2.3 (Ultimate Edition)

JDK & Dependencies:

- JDK 20 early access (build 20+ea+20) - Link download: https://jdk.java.net/20/
- JavaFx version 20-ea+4 - Link download: https://gluonhq.com/products/javafx/
- Javazoom JLayer MP3 Library version 1.0 -
  Link: https://mvnrepository.com/artifact/de.huxhorn.sulky/de.huxhorn.sulky.3rdparty.jlayer/1.0
- Sulky Sounds API version 8.3.0 -
  Link: https://mvnrepository.com/artifact/de.huxhorn.sulky/de.huxhorn.sulky.sounds-api/8.3.0
- Sulky Sounds Impl JLayer version 8.3.0 -
  Link: https://mvnrepository.com/artifact/de.huxhorn.sulky/de.huxhorn.sulky.sounds-impl-jlayer/8.3.0
- SLF4J API Module version 1.7.32 - Link: https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.32

Thành viên nhóm:

- 21020651 Phạm Nhật Minh (Leader): Các phần điều khiển nhân vật, hành vi của các đối tượng (Bomber, Enemy, Block,
  Items), thuật toán tìm đường cho Enemy (A*), cấu hình Level, cập nhật JDK và các Dependencies
- 21020109 Nguyễn Tuấn Minh: Thu thập các tài nguyên hình ảnh, âm thanh, texture, font chữ, animation, README.md.

Hướng dẫn cài đặt:

- Clone project về IntelliJ IDEA trên máy.
- Trong lúc chờ IntelliJ IDEA tải các dependencies, tải JDK 20 và JavaFx 20-ea+4. Giải nén các file vừa tải xuống với
  đường dẫn là:

* Đối với JDK 20: C:\Program Files\Java\jdk-20
* Đối với JavaFx 20-ea+4: C:\Program Files\Java\javafx-sdk-20-ea+4

- Bấm tổ hợp phím Ctrl + Alt + Shift + S để mở cửa sổ Project Structure. Chọn Project -> SDK -> Edit -> SDK Home -> Chọn
  đường dẫn đến JDK 20 vừa tải về. Sau đó bấm Apply và OK.
- Tìm file BombermanGame.java trong thư mục src\GameRunner\, chuột phải vào file -> More Run/Debug -> Modify Run
  Configuration -> Build and run -> More options -> Add VM options -> Paste đoạn code sau vào: --module-path "C:
  \Users\nhatm\Downloads\Compressed\javafx-sdk-20\lib" --add-modules javafx.controls,javafx.fxml.
- Bấm OK để lưu lại cấu hình. Bấm Run để chạy game.

Các tính năng đã hoàn thành:

- Bomberman có thể di chuyển, đặt bom, phá hủy các gạch, tiêu diệt các Enemy.
- Các loại Enemy: Balloom, Oneal, Doll, Kondoria.
- Các loại Item: FlameItem, SpeedItem.
- Game mặc định có 3 level, có thể chỉnh sửa bản đồ màn chơi theo file .txt nằm trong thư mục res\Levels.
- Mỗi màn chơi giới hạn thời gian là 120s, giới hạn số bomb có thể đặt.
- Game có hiệu ứng âm thanh khá sống động :D
