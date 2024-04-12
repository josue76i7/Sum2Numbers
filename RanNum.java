import java.util.Random;

class RandomNum {
    Random ran;
    RandomNum(){
        ran = new Random();
    }

    public int getNum(){
<<<<<<< HEAD
        return ran.nextInt(100) + new Numerito().getNum() +10000;    
=======
        return ran.nextInt(100) + new Numerito().getNum()+2*2+2;    
>>>>>>> 737637743e96ec361acce24b09b4af7fe097874b
    }
}
