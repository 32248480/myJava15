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
//��{���b�����,�|���N"Hello 1"~"Hello 5"�C�L��������,�A��"Good bye 1"~"Goodbye 5"�L�X�C�n�ϥΦh�������,�ݭn��start() method�Ӷi��Ұ�,��start() method�b�Ƶ{�����n���Ӱ����,��o�Ӱ�����}�l�����,run() method�۵M�N�|�Q�I�s�C�p�o�D�����I�srun() method,�u�O�b�{�����Nrun() method����,�ä��|�Ұʦh������C