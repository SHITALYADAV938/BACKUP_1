

public class recursion2 {
    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1=tilingProblem(n-1);
        //horizontal choice
        int fnm2=tilingProblem(n-2);
        int totalWays=fnm1+fnm2;
        return totalWays;

    }
    public static void removeDup(String str,int indx,StringBuilder newStr,boolean map[]){

        //base case
        if(indx==str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currchar=str.charAt(indx);
        if(map[currchar-'a']==true){
            //duplicate
            removeDup(str, indx+1, newStr, map);
        }else{
            map[currchar-'a']=true;
            removeDup(str, indx+1, newStr.append(currchar), map);
        }


        
    }
    public static int friendsPair(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //kaam
        //int fnm1=friendsPair(n-1);
        //int fnm2=friendsPair(n-2);
        //int pairWays=(n-1)*fnm2;
        //int totalPair=fnm1+pairWays;
        //return totalPair;
        return friendsPair(n-1)+(n-1)*friendsPair(n-2);

    }
    //problem no 14
    public static void printBinStr(int n,int lastplace,String str) {
        //base case
        if(n==0){
            System.out.println(str);
            return;

        }        //kaam
        printBinStr(n-1, 0, str+"0");
        if(lastplace==0){
            printBinStr(n-1, 1, str+"1");

        }
        //if n is 1
        /*  if(lastplace==1){
            printBinStr(n-1, 0, str.append("0"));

        }else{
            printBinStr(n-1, 0, str.append("1"));
        }*/
        
    }
    public static void main(String[] args){
        printBinStr(3,0,"");
    }
    
}
