interface Transport{
    void deliver();
}

abstract class Animal{}

class Tiger extends Animal{}

class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("delivery meth call Camel");
    }
}

class Deer extends Animal{}

class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("delivery method call Donkey");
    }
}

public class lab11b3 {
    public static void main(String[] args) {
        Animal obj1[]=new Animal[4];
        obj1[0]=new Tiger();
        obj1[1]=new Camel();
        obj1[2]=new Deer();
        obj1[3]=new Donkey();

        for(int i=0;i<4;i++){
            
            if(obj1[i] instanceof Transport){

                ((Transport) obj1[i]).deliver();

            }
        }
    }
}
