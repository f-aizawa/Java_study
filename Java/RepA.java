import java.util.Scanner;
public class RepA {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("年齢は？");
		int age;
		age = stdIn.nextInt();
		System.out.print("水曜日ですか？(Yes->1,No->2)");
		int day;
		day = stdIn.nextInt();
		System.out.println("年齢"+age);
		System.out.println("曜日"+day);
		
		if(day == 1){
			if( age <= 6  ){
				System.out.println("入場料は500円です");
			} else if( age <= 12 ){
				System.out.println("入場料は1000円です");
			} else if( age <= 59 ){
				System.out.println("入場料は1000円です");
			} else {
				System.out.println("入場料は1000円です");
			}
		} else {
			if( age <= 6  ){
				System.out.println("入場料は500円です");
			} else if( age <= 12 ){
				System.out.println("入場料は1000円です");
			} else if( age <= 59 ){
				System.out.println("入場料は2000円です");
			} else {
				System.out.println("入場料は1800円です");
			}
		}
	}
}
