package leedcodeEasy;
class Solution {
    public static String removeOccurrences(String s, String part) {
        while(s.length()!=0){
            int len=s.length();
            s=s.replaceFirst(part,"");
            int k=s.length();
            if(len==k){
                return s;
            }

        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(removeOccurrences("aabababa","aba"));

    }
}