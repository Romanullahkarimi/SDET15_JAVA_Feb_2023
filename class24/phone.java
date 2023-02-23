package class24;

public abstract class phone {
    //create a phone class lets create abstrct methods like displayPictures
    // unlockPhone
    //sendText
    //2 child classes Iphone samsung Google  and provide  specific implementtion
    //lets write code to achieve runtime polmarphism
    abstract void unlockPhone();
    abstract  void sendText();
    abstract void displayPictures();
}
class Iphone extends phone{
    @Override
    void unlockPhone() {
        System.out.println("faceID to unlock the phone");
    }

    @Override
    void sendText() {
        System.out.println("let's use the IMessage to send text");

    }

    @Override
    void displayPictures() {
        System.out.println("Iphone to browse to picture");

    }
}
class Sumsung extends phone{
    @Override
    void unlockPhone() {
        System.out.println("using prinID senser or cmera");
    }

    @Override
    void sendText() {
        System.out.println("message  app to send the message ");

    }

    @Override
    void displayPictures() {
        System.out.println(" Gallery app to browse photos ");

    }
}
