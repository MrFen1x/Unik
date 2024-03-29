import java.util.Scanner;

public class source {
	public static void main(String[] args) {
		System.out.print("№1 = 1\n№2 = 2\n№3 = 3\n№4 = 4\n");
		System.out.print("Введите номер прогрраммы:");
		Scanner s = new Scanner(System.in);
		int number=s.nextInt();
		switch (number) {
		case(1):
			System.out.print("Введите число:");
			int n = s.nextInt();
			int k=0;
			int kk=0;
			int i=1;
			while (kk<=n) {
				while (k<n) {
					System.out.printf("%d ",i);
					i=i+2;
					k++;
				}
				kk++;
				i=kk;
				k=0;
				System.out.printf("\n");
			}
		case(2):
		System.out.print("Введите число:");
		n = s.nextInt();
		k=1;
		kk=0;
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
		case(5):
			System.out.print("Введите число:");
			n = s.nextInt();
			i=1;
			while(n>=1) {
			while(i<=n-1) {System.out.print(" ");i++;}
			System.out.printf("%d",n);
			n--;
			i=1;
			}}
		}
	}

