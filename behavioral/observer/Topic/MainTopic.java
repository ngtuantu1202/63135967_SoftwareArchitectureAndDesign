package behavioral.observer.Topic;

public class MainTopic {
    public static void main(String[] args) {
        Topic topic = new Topic();

        ThanhVienA thanhVienA = new ThanhVienA(topic);
        ThanhVienB thanhVienB = new ThanhVienB(topic);

        TinTuc tinMoi1 = new TinTuc(1, "aaaa", "aaaaa");
        TinTuc tinMoi2 = new TinTuc(2, "bbbb", "bbbbb");

        topic.dangKy(thanhVienA);
        topic.dangKy(thanhVienB);

        topic.themMoi(tinMoi1);
        topic.themMoi(tinMoi2);
    }
}
