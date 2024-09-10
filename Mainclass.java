import java.util.Random;

public class Mainclass {
    public static void main(String[] args) {
        String Upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="1234567890";
        String specialchar="<>/:,.+=_-()&*^%$#@!";
        String combination=Upper+lower+specialchar+num;
        int len=10;
        char[]password=new char[len];
        Random r=new Random();
        for(int i=0;i<len;i++){
            password[i]=combination.charAt(r.nextInt(combination.length()));

        }
        System.out.println("Generated password is:"+new String(password));

        
    }

    
}