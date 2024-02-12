import java.lang.String;
public class FourWords {
    private String word1;
    private String word2;
    private String word3;
    private String word4;
    private static int count;
    
    public void add(String word){
           for(int i=count;i<=count;i++){
                if(count==1){
                    word1=word;
                    count++;
                }else if(count==2){
                    word2=word;
                    count++;
                }else if(count==3){
                    word3=word;
                    count++;
                }else if(count==4){
                    word4=word;
                    count++;
                }else if(count>4){
                    System.out.println("Can't add new word "+word+"!");
                }
           }
    }

    public String getMin(){
        String min=word1;
        //compare word1
        if(word1.compareTo(word2)<0){
            min=word1;
        }
        if(word1.compareTo(word3)<0){
            min=word1;
        }
        if(word1.compareTo(word4)<0){
            min=word1;
        }

        //compare word2
        if(word2.compareTo(word1)<0){
            min=word2;
        }
        if(word2.compareTo(word3)<0){
            min=word2;
        }
        if(word2.compareTo(word4)<0){
            min=word2;
        }

        //compare word3
        if(word3.compareTo(word1)<0){
            min=word3;
        }
        if(word3.compareTo(word2)<0){
            min=word3;
        }
        if(word3.compareTo(word4)<0){
            min=word3;
        }

        //compare word4
        if(word4.compareTo(word1)<0){
            min=word4;
        }
        if(word4.compareTo(word2)<0){
            min=word4;
        }
        if(word4.compareTo(word3)<0){
            min=word4;
        }
        return min;
    }

    public String getMax(){
        String max=word1;
        //compare word1
        if(word1.compareTo(word2)<0){
            max=word1;
        }
        if(word1.compareTo(word3)<0){
            max=word1;
        }
        if(word1.compareTo(word4)<0){
            max=word1;
        }

        //compare word2
        if(word2.compareTo(word1)<0){
            max=word2;
        }
        if(word2.compareTo(word3)<0){
            max=word2;
        }
        if(word2.compareTo(word4)<0){
            max=word2;
        }

        //compare word3
        if(word3.compareTo(word1)<0){
            max=word3;
        }
        if(word3.compareTo(word2)<0){
            max=word3;
        }
        if(word3.compareTo(word4)<0){
            max=word3;
        }

        //compare word4
        if(word4.compareTo(word1)<0){
            max=word4;
        }
        if(word4.compareTo(word2)<0){
            max=word4;
        }
        if(word4.compareTo(word3)<0){
            max=word4;
        }
        return max;
    }

    public void printWords(){
        System.out.println(" List of words:");
        System.out.println("\t"+word1);
        System.out.println("\t"+word2);
        System.out.println("\t"+word3);
        System.out.println("\t"+word4);
        System.out.println("The lexicographic minimum is "+getMin());
        System.out.println("The lexicographic minimum is "+getMax());
        System.out.println("Total length"+(word1.length()+word2.length()+word3.length()+word4.length()));
        System.out.println("Average lenght "+((word1.length()+word2.length()+word3.length()+word4.length())/4.00));
    }
}