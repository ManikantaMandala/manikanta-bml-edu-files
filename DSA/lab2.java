import java.util.Scanner;

public class lab2{
    public static void main(String[] args){
        int n,first,last,key;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n=sc.nextInt();
        int arr[];
        arr=new int[n];
        System.out.print("Enter the Elements of array : ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Key : ");
        key=sc.nextInt();
        sc.close();
        first=binaryFirstOccurance(arr,n,key);
        last=binaryLastOccurance(arr,n,key);
        System.out.print("["+first+","+last+"]");
    }
    static int linearFirstOccurance(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int linearLastOccurance(int arr[],int n,int key){
        for(int i=n-1;i>0;i--){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int binaryFirstOccurance(int arr[],int n,int key){
        int f=0,l=n-1;
        while(f<=l){
            int mid=(f+l)/2;
            if(arr[mid]==key){
                if(arr[mid-1]!=key){
                    return mid;
                }
                l=mid-1;
            }
            else if(arr[mid]>key){
                l=mid-1;
            }
            else{
                f=mid+1;
            }
        }
        return -1;
    }
    static int binaryLastOccurance(int arr[],int n,int key){
        int f=0,l=n-1;
        while(f<=l){
            int mid=(f+l)/2;
            if(arr[mid]==key){
                if(arr[mid+1]!=key){
                    return mid;
                }
                f=mid+1;
            }
            else if(arr[mid]>key){
                l=mid-1;
            }
            else{
                f=mid+1;
            }
        }
        return -1;
    }

}