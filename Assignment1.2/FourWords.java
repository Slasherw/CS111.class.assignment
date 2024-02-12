//นพกรณ์ สงเคราะห์
//6609540023
import java.lang.String;
public class FourWords {
    private String word1="";
    private String word2="";
    private String word3="";
    private String word4="";
    private int count=0;

    public void add(String word){
            switch (count) {
                case 0:
                    word1=word;
                    break;
                case 1:
                    word2=word;
                    break;
                case 2:
                    word3=word;
                    break;
                case 3:
                    word4=word;
                    break;
                default:
                    System.out.println("Can't add a word "+word+"!");
                    break;
            }
            count++;
    }


    public String getMin(){
        if(count==0){
            return null;
        }
        String min=word1;
        if(word2!=""&&word2.compareTo(min)<0){
            min=word2;
        }
        if(word3!=""&&word3.compareTo(min)<0){
            min=word3;
        }
        if(word4!=""&&word4.compareTo(min)<0){
            min=word4;
        }
        if(min==""){
            return getMax();
        }
        return min;
    }

    public String getMax(){
        if(count==0){
            return null;
        }
        String max=word1;
        if(word2.compareTo(max)>0){
            max=word2;
        }
        if(word3.compareTo(max)>0){
            max=word3;
        }
        if(word4.compareTo(max)>0){
            max=word4;
        }
        return max;
    }

    public void printWords(){
        if(count==0){
            System.out.println("No words set up yet!");
        }
        if(count==0){
            System.out.println("List of words:\n"+
            "\t"+word1+"\n"+
            "\t"+word2+"\n"+
            "\t"+word3+"\n"+
            "\t"+word4+"\n");
        }else System.out.println("Round "+count+": "+"List of words:\n"+
        "\t"+word1+"\n"+
        "\t"+word2+"\n"+
        "\t"+word3+"\n"+
        "\t"+word4+"\n");
        
        System.out.println("The lexicographic minimum is "+getMin());
        System.out.println("The lexicographic maximum is "+getMax());

        if(count==0){
            System.out.println("Total lenght 0");
        }else System.out.println("Total length "+(word1.length()+word2.length()+word3.length()+word4.length()));
        if(count==0){
            System.out.println("Average lenght 0");
        }else System.out.println("Average lenght "+((word1.length()+word2.length()+word3.length()+word4.length())/4f));
    }
}