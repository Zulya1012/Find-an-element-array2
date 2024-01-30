import java.util.Scanner;
public class element51{
	public static void main(String[] arg){
		int c=0;
		int [] a=new int[4];
		a[0]=9;
		a[1]=8;
		a[2]=5;
		a[3]=4;
		Scanner sc=new Scanner(System.in);
		for (int x=1; x<=2; x++){
                	System.out.println("Vvedite chislo");
			int b=sc.nextInt();
			for (int i=0; i<a.length; i++){
				if(a[i]==b){
					c=1;
					System.out.println("There is such a number. Found in the" +" "  + (i+1)+"th"+  " "+ "element.");
					break;
				}
			}
			if (c==0) 
				break;
		}
	}
}