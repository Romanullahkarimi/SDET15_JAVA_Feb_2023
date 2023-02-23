package class24;

public class phoneTester {
    public static void main(String[] args) {
        phone []phones={new Sumsung(),new Iphone()};
        for (phone po:phones){
            po.unlockPhone();
            po.sendText();
            po.displayPictures();
        }
    }
}
