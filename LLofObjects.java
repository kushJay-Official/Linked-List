

package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LLofObj {
     static BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        LinkedList<Emp> lO=new LinkedList<>();
        for (int i=0;i<3;i++){
            System.out.printf("Enter Details...\nName   Age   Salary\n");
            String n=b.readLine();
            int a=Integer.parseInt(b.readLine());
            double s=Double.parseDouble(b.readLine());
            lO.add(new Emp(n,a,s));
        }
        for(Emp s:lO) System.out.print("[" + s + "]--->");
        System.out.printf("Null");
    }
}
class Emp{
    String Name;
    int age;
    double sal;

   public Emp(String n,int a,double s){
        Name=n;age=a;sal=s;
    }
    public void show(){
        System.out.printf("%s\t%s\t%s\t",Name,age,sal);
    }
}
