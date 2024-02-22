package creational.builder.computer;

    //1. Lớp cần tạo đối tượng gồm nhiều đối tượng qua nhiều bước
public class Computer63 {
    //2. Xác định thành phần phức tạp cần khởi tạp thông qua các bước
        String CPU, RAM, storage, screen;
    //4. Viết hàm khởi tạo
        private Computer63(Builder b) {
            CPU = b.CPU;
            RAM = b.RAM;
            storage = b.storage;
            screen = b.screen;
        }

        @Override
        public String toString() {
            return "Computer63{" +
                    "CPU='" + CPU + '\'' +
                    ", RAM='" + RAM + '\'' +
                    ", storage='" + storage + '\'' +
                    ", screen='" + screen + '\'' +
                    '}';
        }

        //3. Viết lớp Builder
        public static class Builder{
           private String CPU, RAM, storage, screen;
        //6. Các phương thức để xd từng thành phần
        public Builder buildCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder buildRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        public Builder buildStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder buildScreen(String screen){
            this.screen = screen;
            return this;
        }
        //5. Phương thưc Build trả về đối tượng cần khởi tạo
        public Computer63 build(){
            return new Computer63(this);
        }
    }
}
