
import java.util.Arrays;

public class pstring {
    public static void main(String[] args) {
        //String str="Apnacollege".replace("l", "");
        //System.out.println(str);
        //String str1="ShradhaDidi";
        //String str2="ApnaCollege";
        //String str3="ShradhaDidi";
        //System.out.println(str1.equals(str2)+" "+str1.equals(str3));
        //String str=new String();
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str=sc.nextLine();
        System.out.println(str);
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
                i++;
    
            }
        }
        System.out.println(count);*
        String str1="earth";
        String str2="heart";
        str1=str1.toLowerCase();
        str2=str1.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result=Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1+" and"+" "+str2+" are anagrams");
            }
            else{
                System.out.println(str1+" and"+str2+" not anagrams");
            }
            
        }*/
        String s1="eat";
        String s2="ate";
        char s1Arr[]=s1.toCharArray();
        char s2Arr[]=s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        System.out.println(s1Arr.equals(s2Arr));
    
    }
    
}


        