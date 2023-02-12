package leedcodeEasy;

class NumberReversal {

    public boolean isSameAfterReversals(int num) {
        int i=reverse(num);
        int j=reverse(i);
if(num==j){
    return true;
}else return false;
    }

   public static int  reverse(int number)
    {
        int  reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
       return reverse;
    }

}