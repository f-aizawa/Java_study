public class RepB {
	public static void main(String[] args){
	int a;
	int b;
	int c;
	int d;
	int X;
	System.out.println("課題B-0");
		for(a=0; a<10; a++){
			System.out.println("#");
		}
	System.out.println("課題B-1");
		for(a=0; a<20; a++){
			System.out.print("#");
		}
		System.out.println();
	System.out.println("課題B-2");
		for(b=0; b<10; b++){
			for(a=0; a<20; a++){
				System.out.print("#");
			}
		System.out.println();
		}
	System.out.println("課題B-3");
		for(b=0; b<10; b++){
			for(a=0; a<10; a++){
				X = a;
				System.out.print(X);
			}
		System.out.println();
		}
	System.out.println("課題B-4");
		for(b=0; b<10; b++){
			X = b;
			for(a=0; a<10; a++){
				System.out.print(X);
			}
		System.out.println();
		}
	System.out.println("課題B-5");
		for(b=0; b<10; b++){
			for(a=0; a< 1+b; a++){
				System.out.print("#");
			}
		System.out.println();
		}
	System.out.println("課題B-6");
		for(b=10; b>0; b--){
			for(a=0; a<b; a++){
				System.out.print("#");
			}
		System.out.println();
		}
	System.out.println("課題B-7");
		for(b=0; b<10; b++){
			for(a=0; a< 9-b; a++){
				System.out.print(" ");
			}
			for(c=0; c< 1+b; c++){
				System.out.print("#");
			}
		System.out.println();
		}
	System.out.println("課題B-8");
		for(b=0; b<5; b++){
			X = b+1;
			for(a=0; a<X ; a++){
					for(c=0; c<X; c++){
						System.out.print(X);
					}
					System.out.println();	
			}
		}
	System.out.println("課題B-9");
		for(c=0; c<3; c++){
			for(b=0; b<5; b++){
				for(a=0; a< 1+b; a++){
					System.out.print("#");
				}
			System.out.println();
			}
		}
	System.out.println("課題B-10");
		for(c=0; c<5; c++){
			for(b=0; b<3; b++){
				for(a=0; a< 1+c; a++){
					System.out.print("#");
				}
				for(d=0; d< 5-c; d++){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
