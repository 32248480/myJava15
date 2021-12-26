class CTest extends Thread{
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
 hi.start();
 bye.start();
 morning.start();
}
}

//Hello 1
//Good morning 1
//Good bye 1
//Good bye 2
//Good morning 2
//Good morning 3
//Hello 2
//Good morning 4
//Good morning 5
//Good bye 3
//Hello 3
//Hello 4
//Good bye 4
//Hello 5
//Good bye 5