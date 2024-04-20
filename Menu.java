class Menu {
   static RandomNum ran;
   static SumaNum sum;

    public static void main(String[] args) {
        ran = new RandomNum();
        sum = new SumaNum();
        sum.sumaFinal(ran.getNum(), ran.getNum());
        System.out.println("MAIN3");
    }
}    


