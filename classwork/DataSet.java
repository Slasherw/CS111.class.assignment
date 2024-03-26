import java.util.ArrayList;

public class DataSet {
    private double[] data;
    //private ArrayList<Double> myData;
    private int dataSize;

    public DataSet(){
        data = new double[100];
        dataSize = 0; 
        // myData = new ArrayList<Double>();
        //dataSize = myData.size();
    }

    public void add(int x){
        if(dataSize==data.length) {
            extendArray();
        }
        data[dataSize++]=x; 
        
    }
    //public void add(double x){
    //  myData.add(x);
    // dataSize=myData.size();    
    //}

    private void extendArray(){

    }

    public double getAverage(){
        if(dataSize!=0){
            double sum = 0;
            for(int i=0;i<dataSize;i++){
                sum+=data[i];
            }
            return sum/dataSize;
        }else {return 0.0;}
    }
}
