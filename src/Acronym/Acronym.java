package Acronym;

public class Acronym {
    private String phrase;
    public Acronym(String phrase){
        this.phrase = phrase;
    }

    public String get() {
        StringBuilder str = new StringBuilder();
        for (String s: phrase.split("[- ]+")){
            for (int i = 0; i< s.length();i++){
                if (Character.isAlphabetic(s.charAt(i))){
                    str.append(s.toUpperCase().charAt(i));
                    break;
                }
            }
        }
        return str.toString();
    }

}
