interface Playable{
    void play();
}

class football implements Playable{
    public void play(){
        System.out.println("Play Football");
    }
}

class Volleyball implements Playable{
    public void play(){
        System.out.println("Play Volleyball");
    }
}

class Basketball implements Playable{
    public void play(){
        System.out.println("Play Basketball");
    }
}

public class lab11c5 {
    public static void main(String[] args) {

    football f=new football();
    f.play();

    Volleyball v =new Volleyball();
    v.play();

    Basketball b=new Basketball();
    b.play();
    
    }
}
