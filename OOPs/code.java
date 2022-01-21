import java.util.Scanner;

public class code{
    public static void main(String[] args){
        int r=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        r=sc.nextInt();
        sphere myobj =new sphere();
        interest myInterest =new interest();
        myInterest.setInterest(1000, 5, 6);
        System.out.println("Surface area of sphere: "+myobj.surfaceAreaOfSphere(r)+" Volume of sphere"+myobj.volume(r));
        System.out.println(myInterest.simpleInterest());
        sc.close();
    }
}
class sphere{
     double surfaceAreaOfSphere(int r){
        return 4*(Math.PI)*r*r;
    }
     double volume(int r){
        return (4*(Math.PI)*r*r*r)/3;
    }
}
class interest{
    double p,r,t;
    void setInterest(double principle, double rate,double time ){
        p=principle;
        r=rate;
        t=time;
    }
    double simpleInterest(){
        return p*r*t/100;
    }
}