class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int lm=0;
        int jh=0;
        int kl=0;
        for(int i=0;i<firstWord.length();i++){
             lm=lm*10+firstWord.charAt(i)-'a';

        }
        for(int i=0;i<secondWord.length();i++){
       jh=jh*10+secondWord.charAt(i)-'a';
            
        }
        for(int i=0;i<targetWord.length();i++){
           kl=kl*10+targetWord.charAt(i)-'a';
            
        }
        
    return lm+jh==kl;
    }
}
