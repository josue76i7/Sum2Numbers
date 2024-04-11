import java.util.Random;

class RandomNum {
    Random ran;
    RandomNum(){
        ran = new Random();
    }

    public int getNum(){
        System.out.println("jajajaj");
        return ran.nextInt(100) + new Numerito().getNum() +1000;    
    }
}