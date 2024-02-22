package creational.singleton.vidu2;
//Singleton
public class User63 {
    String name;
    //constructor
    public User63(String name) {
        this.name = name;
    }
    public void vote(Candidate c) {
        Election63.getInstance().vote(c,name);
    }
}
