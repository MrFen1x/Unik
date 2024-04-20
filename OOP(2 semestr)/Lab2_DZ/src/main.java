import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	System.out.print("A:\n№1(while) = 1\n№1(do while) = 2\n");
	System.out.print("Введите номер прогрраммы:");
	Scanner s = new Scanner(System.in);
	int number=s.nextInt();
	System.out.print("Введите N = ");
	switch (number) {
	case(1):
		int n=s.nextInt();
		int i =1;
		int k=n;
		while(k>0) {
			i=k;
			while (i<n+1) {
				System.out.print(i);
				i++;
			}
			k--;
			System.out.print("\n");
		}
		break;
	case(2):
		 n=s.nextInt();
		 i =1;
		 k=n;
		do {
			i=k;
			do {
				System.out.print(i);
				i++;
			}while (i<n+1);
			k--;
			System.out.print("\n");
		}while(k>0);
	
	}
	}
}
