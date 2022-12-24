public class Exercise {
    public void missingNumber(int[] intArray) {
        // TODO
        int n=intArray.length;
        int total=(n*(n+1))/2;
        int sum=0;
        for(Integer i:intArray){
            sum+=i;
        }
        int missingNos=total-sum;
        System.out.println(missingNos);
    }

}