package java_ooa;

public class StringVersusStringBuilder {
    public static void main(String[] args) {
        String vowelsS = "aei";
//        StringBuilder vowelsSB = "aei"; // compiler error
        StringBuilder vowelsSB = new StringBuilder("aei");
        
        addRemainingVowels(vowelsS);
        addRemainingVowels(vowelsSB);
        
        System.out.println(vowelsS);    // aei
        System.out.println(vowelsSB);   // aeiou
    }
    public static void addRemainingVowels(String vowels){
        vowels += "ou";     // no effect on 'vowelS' in main()
        vowels.concat("ou");
    }
    public static void addRemainingVowels(StringBuilder vowels){
        vowels.append("ou");// changes 'vowelsSB' in main()
    }
}



