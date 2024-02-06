//นพกรณ์ สงเคราะห์
//6609540023
import java.lang.String;
public class FourWords {
    private String word1;
    private String word2;
    private String word3;
    private String word4;
    private int count;//ไม่ควร set ค่าตัวแปรไว้ใน instanceVariable ควรเซทไว้ในMethods

    public void add(String word){
        count=1;//ควร Setค่าแบบนี้ที่ MethodF
        for(int i=count;i<=4;i++){
            if(count==1){
                word1=word;
            }else if(count==2){
                    word2=word;
                }else if(count==3){
                        word3=word;
                    }else if(count==4){
                            word4=word;
                        }
        }
    }
    public String getMin(){
        if(word1)
        return 0;
    }

    public String getMax(){
        return 0;
    }
    
    public void printWords(){

    }
}