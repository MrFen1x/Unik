import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.print("№1(while) = 1\n№1(do while) = 2\n№2(while) = 3\n№2(do while) = 4\n");
		System.out.print("Введите номер прогрраммы:");
		Scanner s = new Scanner(System.in);
		int number=s.nextInt();
		switch(number) {
		case(1):
			System.out.print("Введите максимальное число:");
			int n=s.nextInt();
			System.out.printf("Числа от 1 до %d\n",n);
			int i=1;
			while (i<=n) {
				System.out.printf("%d ",i);
				i++;
			}
			break;
			
		case(2):
			System.out.print("Введите максимальное число:");
			n=s.nextInt();
			System.out.printf("Числа от 1 до %d\n",n);
			i =1;
			do{
			System.out.printf("%d ",i);
			i++;
			}while (i<=n);
			break;
			
		case(3):
			System.out.print("Введите максимальное число:");
			n=s.nextInt();
			System.out.printf("Числа от %d до 10\n",n);
			i =n;
			while (i>=10) {
				System.out.printf("%d ",i);
				i=i-10;
			}
			break;
			
		case(4):
			System.out.print("Введите максимальное число:");
			n=s.nextInt();
			System.out.printf("Числа от %d до 10\n",n);
			i =1;
			do{
			System.out.printf("%d ",i);
			i=i-10;
			}while (i>=10);
			break;
			
		case(5):
			System.out.print("Введите максимальное число:");
			n=s.nextInt();
			System.out.printf("Числа от 1 до %d\n",n);
			i =n;
			while (i<=n) {
				System.out.printf("%d ",i);
				i=i*2;
			}
			break;
			
		case(6):
			System.out.print("Введите максимальное число:");
			n=s.nextInt();
			System.out.printf("Числа от 1 до %d\n",n);
			i =1;
			do{
				System.out.printf("%d ",i);
				i=i*2;;
			}while (i<=n);
			break;
			
		case(7):
			System.out.print("Введите количество чисел:");
			n=s.nextInt();
			System.out.printf("Количество чисел = %d\n",n);
			i =1;
			int k=0;
			while (k<n) {
				System.out.printf("%d ",i*i);
				i=i+1;
				k++;
			}
			break;
			
		case(8):
			System.out.print("Введите количество чисел:");
			n=s.nextInt();
			System.out.printf("Количество чисел = %d\n",n);
			i =1;
			k=0;
			do{
				System.out.printf("%d ",i*i);
				i=i+1;
				k++;
			}while (k<n);
			break;
			
			case(9):
				System.out.print("Введите количество чисел:");
				n=s.nextInt();
				System.out.printf("Количество чисел = %d\n",n);
				i =1;
				k=0;
				int a=1;
				while (k<n) {
					a=a*i;
					System.out.printf("%d ",a);
					i=i+1;
					k++;
				}
				break;
				
		case(10):
			System.out.print("Введите количество чисел:");
			n=s.nextInt();
			System.out.printf("Количество чисел = %d\n",n);
			i =1;
			k=0;
			a=1;
			do{
				a=i*a;
				System.out.printf("%d ",a);
				i=i+1;
				k++;
			}while (k<n);
			break;
			
			}
		}
	}

