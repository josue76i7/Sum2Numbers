import java.util.Random;

class RandomNum {
    Random ran;
    RandomNum(){
        ran = new Random();
    }

    public int getNum(){
<<<<<<< HEAD
        return ran.nextInt(100) + new Numerito().getNum()+2*2+21;    
=======
        return ran.nextInt(100) + new Numerito().getNum()+1*11+11;    
>>>>>>> 20d2f88999d7da7269f02046abf5f5ff2ebb46ef
    }
}
