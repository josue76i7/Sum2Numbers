import java.util.Random;

class RandomNum {
    Random ran;
    RandomNum(){
        ran = new Random();
    }

    public int getNum(){
<<<<<<< HEAD
        return ran.nextInt(100) + new Numerito().getNum()+2*2+2112;    
=======
        return ran.nextInt(100) + new Numerito().getNum();    
>>>>>>> 4755ab57842f7c954e1f8893a4416d95e8135151
    }
}
