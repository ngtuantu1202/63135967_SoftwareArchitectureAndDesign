package creational.singleton.vidu2;

public class MainVote63 {
    public static void main(String[] args) {
        User63 u1 = new User63("Tú 1");
        User63 u2 = new User63("Tú 2");
        User63 u3 = new User63("Tú 3");
        User63 u4 = new User63("Tú 4");
        u1.vote(Candidate.JOE_BIDEN);
        u2.vote(Candidate.DONAL_TRUMP);
        u3.vote(Candidate.DONAL_TRUMP);
        u4.vote(Candidate.DONAL_TRUMP);
        Election63.getInstance().inKQ();
    }
}
