class Menu {
   static RandomNum ran;
   static SumaNum sum;
   int a = 100;
    public static void main(String[] args) {
        ran = new RandomNum();
        sum = new SumaNum();
        sum.sumaFinal(ran.getNum(), ran.getNum());
    }
}    


