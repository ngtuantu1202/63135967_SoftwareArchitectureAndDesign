package structural.composite.file;

public class MainFile {
    public static void main(String[] args) {
        AbstractFile file1 = new File("CreationalPattern.pptx ", "2024-03-14", "C:\\");
        AbstractFile file2 = new File("StructuralPattern.pptx ", "2024-03-14", "C:\\");
        AbstractFile file3 = new File("LapTrinhJavaCoBan.docx", "2024-03-14", "C:\\");
        AbstractFile file4 = new File("LapTrinhJavaNangCao.pdf", "2024-03-14", "C:\\");
        AbstractFile file5 = new File("NgonNguLapTrinhC.pdf", "2024-03-14", "C:\\");
        AbstractFile file6 = new File("CoBan.pptx", "2024-03-14", "C:\\");
        AbstractFile file7 = new File("NangCao.pptx", "2024-03-14", "C:\\");

        AbstractFile folder1 = new Folder("Design Pattern", "2024-03-14", "C:\\");
        AbstractFile folder2 = new Folder("Lap Trinh Java ", "2024-03-14", "C:\\");
        AbstractFile folder3 = new Folder("LapTrinhThietBiDiDong  ", "2024-03-12", "C:\\");

        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        folder2.add(file4);
        folder3.add(file6);

        System.out.println("Cây thư mục:");
        System.out.println(folder1.getStringTreeFolder());
        System.out.println(folder2.getStringTreeFolder());
        System.out.println(file5.getStringTreeFolder());
        System.out.println(folder3.getStringTreeFolder());
    }
}
