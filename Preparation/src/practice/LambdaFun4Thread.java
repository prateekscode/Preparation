package practice;

public class LambdaFun4Thread{	
public static void main(String[] args) {
	Runnable r=()->{
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName());
	};
	for(int i=0;i<5;i++)
		System.out.println(Thread.currentThread().getName());
		
	
	Thread t=new Thread(r);
	t.start();
}
}
