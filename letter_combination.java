import java.util.*;
public class letter_combination{
public static void find(String digits,List<String> result,StringBuilder temp,String letter[],int s){
if(s==digits.length()){
result.add(temp.toString());
return;
}
int index=digits.charAt(s)-'0';
for(int i=0;i<letter[index].length();i++){
temp.append(letter[index].charAt(i));
find(digits,result,temp,letter,s+1);
temp.deleteCharAt(temp.length()-1);
}
}
public static void main(String args[]){
String digits="23";
List<String> result=new ArrayList<>();
StringBuilder temp=new StringBuilder();
String letter[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
find(digits,result,temp,letter,0);
System.out.println(result);
}
}
