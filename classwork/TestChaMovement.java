public class TestChaMovement {
    public static void main(String[] args) {
        ChaMovement p1 = new ChaMovement("TheTop",100,0,0);
        ChaMovement p2 = new ChaMovement("Slasherw",101,1920,1080);
        p1.showInfo();
        p2.showInfo();
        p1.move(1920,1080);
        p2.move(-1920,-1080);//เพราะ ค่าแรกเป็น 1920*1080
        p1.showInfo();
        p2.showInfo();
    }
    
}
