package team.two.goodwill;

@org.springframework.stereotype.Service
public class Service {

    public Dao getValue(){
        return new Dao();
    }
}
