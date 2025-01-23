

public class string {
    public static void printstring(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        
    }
    public static boolean  isPalindrome(String str) {
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) !=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
        
    }
    public static float  shortestpath(String path) {
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){
                y++;

            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
        
    }
    public static String substring(String str,int si,int ei){
        String substring="";
        for(int i=si;i<ei;i++){
            substring+=str.charAt(i);
        }
        return substring;
    }
    public static String Uppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static String compression(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        /*  String str="123";//creation of string
        Scanner sc=new Scanner(System.in);
    
       // String str1=sc.next(); //it take input single word not more than single word

        
        String str2=sc.nextLine(); //it take input more than single word
        System.out.println(str2);
        //string concatenation
        String str1="Shital";
        String str2="Yadav";
        String fullname=str1+" "+str2;
        System.out.println(fullname);
        System.out.println(fullname.length());
        System.out.println(fullname.charAt(4));
        printstring(fullname);
        
        String str="eye";
        System.out.println(isPalindrome(str));*/
        //String path="WNEENESENNN";
        //System.out.println(shortestpath(path));
        //String s1="tony";
        //String s2="tony";
        //String s3=new String("tony");
        /*if(s1==s2){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not  equal");
        }
        if(s1==s3){
            System.out.println("strings are equal");//if we create stirng with new keyword it assume new tony 
        }
        else{
            System.out.println("strings are not  equal");
        }
        if(s1.equals(s3)){
            System.out.println("strings are equal");

        }
        else{
            System.out.println("strings are not  equal");

        }
       // String str="hello world";
        //System.out.println(substring(str, 0,2));
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
        StringBuilder sb=new StringBuilder("");
        for(char ch='A';ch<='Z';ch++){
            sb.append(ch+" ");
        }//tc is O(26)
        System.out.println(sb);
        String str="hi, i am shital";
        System.out.println(Uppercase(str));*/
        String str="aaabbbccddddd";
        System.out.println(compression(str));




        



        }
    
}
