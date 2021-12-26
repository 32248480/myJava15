class CTest implements Runnable{
 private String id;
public CTest(String str){
 id=str;
}
public void run(){
for(int i=1;i<=5;i++){
 for(int j=0;j<100000000;j++);
 System.out.println(id+" "+i);
}
}
}

public class Main{
public static void main(String args[]){
 CTest hi=new CTest("Hello");
 CTest bye=new CTest("Good bye");
 CTest morning=new CTest("Good morning");
 Thread t1=new Thread(hi);
 Thread t2=new Thread(bye);
 Thread t3=new Thread(morning);
 t1.start();
 t2.start();
 t3.start();
}
}

//Hello 1
//Hello 2
//Good bye 1
//Good bye 2
//Good morning 1
//Good morning 2
//Good morning 3
//Good bye 3
//Hello 3
//Hello 4
//Hello 5
//Good bye 4
//Good morning 4
//Good morning 5
//Good bye 5