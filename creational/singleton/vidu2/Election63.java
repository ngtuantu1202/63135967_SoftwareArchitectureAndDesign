package creational.singleton.vidu2;

import java.util.ArrayList;
import java.util.List;

//Singleton
public class Election63 {
    //Khai bao
    private static Election63 instance;
    private int biden = 0, trump = 0;
    List<String> users = new ArrayList<>();
    public static Election63 getInstance(){
        if(instance == null )
            instance = new Election63();
        return instance;
    }
    private boolean isVote(){
        return false;
    }
    public void vote(Candidate c, String user){
        if(!isVote()) {
            if (c == Candidate.JOE_BIDEN)
                biden++;
            else if (c == Candidate.DONAL_TRUMP)
                trump++;
            users.add(user);
        }
    }
    //Phuong thuc khoi tao
    public void inKQ() {
        System.out.println("Donal Trump: "+ trump);
        System.out.println("Joe Biden: "+ biden);
    }

}
