package behavioral.observer.Topic;

public class ThanhVienB implements TopicListener{
    Topic topic;

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        topic.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        for( int i = 0;i < topic.list.size(); i++)
        {
            if(topic.list.get(i).getId()==t.getId())
            {
                topic.list.set(i, t);
                System.out.println(t.toString());
                return;
            }
        }
        topic.list.add(t);
        System.out.println(t.toString());
    }
}
