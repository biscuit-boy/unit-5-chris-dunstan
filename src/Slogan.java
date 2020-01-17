public class Slogan {
    private String phrase;
    static int instances = 0;

    public Slogan(String phrase){
        this.phrase = phrase;
        ++instances;
    }

    public String toString(){
        return phrase;
    }

    public static int numInstances(){
        return instances;
    }
}
