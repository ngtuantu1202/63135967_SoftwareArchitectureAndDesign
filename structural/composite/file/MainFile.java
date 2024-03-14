package structural.composite.file;

public class MainFile {
    public static void main(String[] args) {
        AbstractFile file1 = new File("NTT.txt", "2024-03-14", "C:\\");
        AbstractFile file2 = new File("TNT.txt", "2024-03-14", "C:\\");
        AbstractFile file3 = new File("TTN.txt", "2024-03-14", "C:\\");

        AbstractFile folder1 = new Folder("Ahihi", "2024-03-14", "C:\\");
        AbstractFile folder2 = new Folder("Ahaha", "2024-03-14", "C:\\");

        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        folder1.add(folder2);

        System.out.println("Cây thư mục:");
        System.out.println(folder1.getStringTreeFolder());
    }
}
