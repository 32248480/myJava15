class PrePaid extends Thread{
 private static int sum=200;

public void run(){
 int fee;
while(sum>10){
 fee=(int)(100*Math.random());
 talk(fee);
}
}
public synchronized static void talk(int n){
 int tmp=sum-n;
try{
 sleep((int)(1000*Math.random()));
}
catch(InterruptedException e){
}
if(tmp>0){
 sum=tmp;
 System.out.println("通話費"+n+"元,餘額為"+sum+"元");
}
}
}

public class Main{
public static void main(String args[]){
 PrePaid phone1=new PrePaid();
 PrePaid phone2=new PrePaid();
 PrePaid phone3=new PrePaid();
 phone1.start();
 phone2.start();
 phone3.start();
}
}

//通話費99元,餘額為101元
//通話費40元,餘額為61元
//通話費55元,餘額為6元
