public class multiply1to10 {
    public static void main(String[] args) {
        int k=1;   //променливите които ще  увеличаваме и умножаваме
        int i=1;
        for (i=1; i<=10; i++){
            for (k=1; k<=10; k++){
            int sum=k*i;
            System.out.printf("%d * %d = %d%n", i,k,sum);}
        }
    }
}
