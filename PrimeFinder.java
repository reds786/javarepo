import java.util.*;
class PrimeFinder{
	public static void main(String args[]){
		/*int n,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
			{
			
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(n + " is a prime number");
		else
		System.out.println(n + " is not a prime number");*/
		//System.out.println(100/9);
		//System.out.println(myMethod(3));
		int z = myMethod(5, 3);
    System.out.println(z);
    checkAge(20); // Call the checkAge method and pass along an age of 20
	}
	
	/*static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }*/
  
  static int myMethod(int x, int y) {
    return x + y;
  }
  
  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }
}
	


