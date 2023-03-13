package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name="jan";
        String []names={"roman","khan","jan","baba","nat"};
        //create a methods which cna search
        System.out.println(contians(name,names));
        String[] arr=new String[2];
        names[4]="shah";
    }
    public static boolean contians(String nameToBeSearch, String[]names) {
        for (String name : names) {
            if (nameToBeSearch.equals(name)) {
                return true;
            }
            }

        return false;
    }
}
