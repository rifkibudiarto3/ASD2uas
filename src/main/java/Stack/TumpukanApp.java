package Stack;
public class TumpukanApp {
     public static void main(String[] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(4);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        long nilai1=tumpukan.peek();
        System.out.println("nilai teratas  = " +nilai1);
            System.out.println("Nama Saya Noor Rifki Budiarto");
        long nilai2=tumpukan.pop(); 
        System.out.println("nilai yang dihapus  = " +nilai2);
        tumpukan.baca();
            System.out.println("");
        tumpukan.push(4);
        tumpukan.baca();
    }
}