/*Table Create with Escape-Sequences*/
public class Variablen1{
    public static void main(String[] args){
        byte bNumber = 28;
        short sNumber = -18453;
        int iNumber = 4356576;
        long lNumber = 345236577970L;
        float fNumber = 4.37456678F;
        double dNumber = 3645.564782D;
        boolean Success = true;
        char String = '%';
        System.out.print("Variable\tWert");
        System.out.print("\n bZahl" + "\t" + "\t" + bNumber);
        System.out.print("\n sZahl" + "\t" + "\t" + sNumber);
        System.out.print("\n iZahl" + "\t" + "\t" + iNumber);
        System.out.print("\n lZahl" + "\t" + "\t" + lNumber);
        System.out.print("\n fZahl" + "\t" + "\t" + fNumber);
        System.out.print("\n dZahl" + "\t" + "\t" + dNumber);
        System.out.print("\n bestanden" + "\t" + Success);
        System.out.print("\n zeichen"  + "\t" + String);
    }
}
