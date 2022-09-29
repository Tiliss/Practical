import java.util.Scanner;
public class Degree {

	public static void main(String[] args) {
		
		//Задание 2
		int ch = 1;
		System.out.println("Введите n");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		for(int i = 1; i <= num; i++)
		{
			ch = ch * 2;
		}
		System.out.println("2 в степени " + num + " = " + ch);

	}

}
