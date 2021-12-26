//(a)~(c),
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
 hi.run();
 bye.run();
}
}

//Hello 1
//Hello 2
//Hello 3
//Hello 4
//Hello 5
//Good bye 1
//Good bye 2
//Good bye 3
//Good bye 4
//Good bye 5

//(d),
//當程式在執行時,會先將"Hello 1"~"Hello 5"列印完畢之後,再把"Good bye 1"~"Goodbye 5"印出。要使用多執行緒時,需要用start() method來進行啟動,由start() method在排程器中登錄該執行緒,當這個執行緒開始執行時,run() method自然就會被呼叫。如這題直接呼叫run() method,只是在程式中將run() method執行,並不會啟動多執行緒。
