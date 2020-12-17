import java.util.HashMap;
import java.util.Map;

public class HashMap {

public static void main(String[] args) {
// TODO Auto-generated method stub
Map<String,student> docMap = new HashMap<String,student>();

student s1 = new student("22","Swetha","","","",44);
student s2 = new student("20","Shashi","","","",42);
student s3 = new student("10","Tanish","","","",40);

stuMap.put(d1.getsid(), s1);
stuMap.put(d2.getsid(), s2);
stuMap.put(d3.getsid(), s3);

for(String key:stuMap.keySet()) {

student  td= stuMap.get(key);
System.out.println("Id:"+td.getsid());
System.out.println("Name:"+td.getsname());
System.out.println("fee:"+td.getsfee());


}
}

}
