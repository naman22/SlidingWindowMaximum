package stringReverse;

public class ReverseString {
    public String reverseWords(String s){
        int i=s.length()-1;
        String answer="";
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')
                i--;
            int j=i;
            while(i>=0 && s.charAt(i)!=' ')
                i--;
            if(answer.isEmpty()) {
                answer.concat(s.substring(i + 1, j + 1));
            }
            else{
                answer.concat(" "+s.substring(i + 1, j + 1));
            }
        }
        return answer;
    }
}
