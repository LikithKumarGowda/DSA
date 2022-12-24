public class Exercise {
        public int searchInArray(int[] intArray, int valueToSearch) {
            // TODO
            for(int i=0;i<intArray.length;i++){
                if(intArray[i]==valueToSearch){
                    return i;
                }
            }
            return 0;
        }


}