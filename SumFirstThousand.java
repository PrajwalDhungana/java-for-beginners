public class SumFirstThousand {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1; i<=1000;i++){
            sum += i;
        }
        System.out.println("The sum of first 1000 numbers is " + sum);
    }
}
