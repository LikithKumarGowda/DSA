import java.util.Scanner;
class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many day's temperature?   ");
        int numberOfDays=sc.nextInt();
        int[] temperature=new int[numberOfDays];
        double average=0.0;
        for(int i=0;i<numberOfDays;i++){
            System.out.println("Day"+(i+1)+"'s high temp: ");
            temperature[i]=sc.nextInt();
            average+=temperature[i];
        }
        average=average/numberOfDays;
        System.out.println(average);
        int days=0;
        for(int i=0;i<numberOfDays;i++){
            if(temperature[i]>average){
                days+=1;
            }
        }
        System.out.println(days+" day(s) above average");
    }
}