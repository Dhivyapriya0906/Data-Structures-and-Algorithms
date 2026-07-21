public class FIndCase {
    public static void main(String[] args) {
        String[] word={"Abccc","abbcc","ABCCC"};
            for(int i=0;i< word.length;i++){
                if(check(word[i],'A','Z')){
                    System.out.println("UPPERCASE");

                } else if (check(word[i],'a','z')) {
                    System.out.println("LOWERCASE");

                }
                else if((Character.isUpperCase(word[i].charAt(0)) && check(word[i].substring(1,word[i].length()),'a','z'))){
                    System.out.println("SENTENCE CASE");

                }

            }
            //System.out.println(false);

        }
        static boolean check(String word,char st,char end){
            for(int i=0;i<word.length();i++){
            if (word.charAt(i) < st || word.charAt(i) > end) {
                return false;

            }
            }
            return true;

        }

}
