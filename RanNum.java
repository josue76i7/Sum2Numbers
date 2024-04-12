import java.util.Random;

class RandomNum {
    Random ran;
    RandomNum(){
        ran = new Random();
    }

    public int getNum(){
        return ran.nextInt(100) + new Numerito().getNum()+2*2+21;    
    }
}
