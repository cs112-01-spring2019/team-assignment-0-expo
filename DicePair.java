public class DicePair {
   private Die die1;
   private Die die2;
   public sum;

    public DicePair (){
        die1 = new Die();
        die2 = new Die();
      
    }
    public int roll(){
        int x , y;
        x = die1.roll();
        y = die2.roll();
        sum = x + y;
        return sum;

    }
    public int Getdie1(){
        return die1;
    }
    public int Getdie2(){
        return die2;
    }
    Public String toString(){

        String result = "Sum: " + sum;
        return result;
    }
}
           