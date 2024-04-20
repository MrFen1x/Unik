import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.print("A:\n№1 = 1\n№2 = 2\n№3(while) = 3\n№4(while) = 4\n№3(do while) = 6\n№4(do while) = 7\nB = 5\n");
		System.out.print("Введите номер прогрраммы:");
		Scanner s = new Scanner(System.in);
		int number=s.nextInt();
		switch (number) {
		case(1):
			System.out.print("Введите число:");
			int n = s.nextInt();
			int i=1;
			while (i<n+1) {
				int k=i;
				int kk=0;
				while(kk<n) {
					System.out.print(k+" ");
					k=k+2;
					kk++;
				}
				System.out.print("\n");
				i++;
			}
			break;
		case(2):
		System.out.print("Введите число:");
		n = s.nextInt();
		int k=1;
		int kk=0;
		while (kk<n) {
			while (k<=kk+1) {
				System.out.printf("%d ",k);
				k++;
			}
			kk++;
			k=1;
			System.out.printf("\n");
		}
		break;
		case(3):
			System.out.print("Введите число:");
			n = s.nextInt();
			k=1;
			kk=n;
			while (kk>=1) {
				while (k<=kk) {
					System.out.printf("%d ",k);
					k++;
				}
				kk--;
				k=1;
				System.out.printf("\n");
			}
			break;
		case(4):
			System.out.print("Введите число:");
			n = s.nextInt();
			k=n;
			i=n;
			kk=0;
			while(k>=1) {
				while(kk<k) {
				System.out.printf("%d ",i);
				i--;
				kk++;
				}
				k--;
				i=n;
				kk=0;
				System.out.printf("\n");
			}
			break;
		case(5):
			System.out.print("Введите число:");
			n = s.nextInt();
			i=0;
			kk=1;
			String str =" "; 
			while(i<n) {
				int o=n;
				k=0;
				System.out.print(str.repeat((n*2)-kk));
				while(k<kk) {
					
					System.out.print(o+" ");
					o--;
					k++;
					if(k>kk/2) {o=o+2;}
				}
				System.out.print("\n");
				kk=kk+2;
				i++;
				}
			i=0;
			int kt=3;
			kk=(n*2)-kt;
			while(i<n-1) {
				int o=n;
				k=0;
				str=" ";
				System.out.print(str.repeat(kt));
				while(k<kk) {
					System.out.print(o+" ");
					o--;
					k++;
					if(k>kk/2) {o=o+2;}
				}
				System.out.print("\n");
				kk=kk-2;
				kt=kt+2;
				i++;
				}
			break;
		case(6):
			System.out.print("Введите число:");
			n = s.nextInt();
			k=1;
			kk=n;
			do {
				do {
					System.out.printf("%d ",k);
					k++;
				}while (k<=kk);
				kk--;
				k=1;
				System.out.printf("\n");
			}while (kk>=1);
			break;
		case(7):
			System.out.print("Введите число:");
			n = s.nextInt();
			k=n;
			i=n;
			kk=0;
			do {
				do {
				System.out.printf("%d ",i);
				i--;
				kk++;
				}while(kk<k);
				k--;
				i=n;
				kk=0;
				System.out.printf("\n");
			}while(k>=1);
			break;
			}
		}

	}
