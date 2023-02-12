package leedcodeEasy;

public class CountDigit {
    public static int countDigits(int num) {
        String s=num+"";
        int count=0;
        for(char c:s.toCharArray()){
            if(num%Integer.valueOf(c+"")==0){
                count+=1;
            }
        }
        return count;
    }
}
