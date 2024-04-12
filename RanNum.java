import java.util.Random;

class RandomNum {
    Random ran;
    RandomNum(){
        ran = new Random();
    }

    public int getNum(){
<<<<<<< HEAD
        return ran.nextInt(100) + new Numerito().getNum();    
=======
        return ran.nextInt(100) + new Numerito().getNum()+1111;    
>>>>>>> 3a8cc6f2f7188db678dd49a9f4934bb99c78c2c8
    }
}
