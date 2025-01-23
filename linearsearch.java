
public class linearsearch{
    public static int linearsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i; 
            }
        }
        return -1; //key exist nhi krti
    }

    public static void main(String[] args) {
        int number[] = {3, 5, 78, 4, 66, 3}; 
        int key = 80; 
        int index = linearsearch(number, key);

        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found at index " + index);
        }
    }
}