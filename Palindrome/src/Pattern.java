import java.util.Scanner;
	class Pattern {
	public static void main(String args[]){
	int r,n,no,space,p;
	System.out.println("Enter the number of rows");
	Scanner sc=new Scanner(System.in);
	no=sc.nextInt();
	n=no;
	for(r=1;r<=no;r++)
	{
		for(space=1;space<=n;space++)
		{
			System.out.print(" ");
			n-- ;
				}
		for(p=1;p<=r;p++)
		{
			System.out.print(" *");
				}
		System.out.print(" ");
	
	}
	}
}
