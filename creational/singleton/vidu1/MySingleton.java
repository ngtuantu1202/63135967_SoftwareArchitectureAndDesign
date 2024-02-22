package creational.singleton.vidu1;

public class MySingleton {
    //1. khai bao bien singleton
    private static MySingleton instance;
    int count =0;
    //2. phuong thuc khoi tao private/protected
    protected MySingleton() {
    }
    //3. phuong thuc tinh dung de tra ve bien instance
    public static MySingleton getInstance(){
        if(instance==null)
            instance = new MySingleton();
        return instance;
    }
    public void inCount(){
        System.out.println(++count);
    }
}
