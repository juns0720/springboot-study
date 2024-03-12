package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();    //자신의 객체를 instance에 넣어둔다.

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){

    }
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }



}
