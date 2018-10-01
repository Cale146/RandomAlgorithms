/**
 * Created by cale146 on 9/28/18.
 */
public class Duplicate {

    int firstDuplicate(int[] a) {

        int[][] lowestValueArray = new int[2][a.length+1];
        int tempOne, tempTwo, returnValue;

        for(int j = 0; j < a.length; j++){
            tempOne = a[j];
            for(int i = 0; i < a.length; i++){
                if(tempOne == a[i++]){
                    lowestValueArray[0][i] = tempOne;
                    lowestValueArray[1][i] = i;
                }
            }
        }

        if(lowestValueArray.length > 0){
            tempTwo = lowestValueArray[1][0];
            for(int i = 0; i < lowestValueArray.length; i++){
                if(tempTwo >= lowestValueArray[1][i]){
                    tempTwo = i;
                }
            }
            System.out.print(lowestValueArray[0][tempTwo]);
            return lowestValueArray[0][tempTwo];
        }
        System.out.print("-1");
        return -1;
    }
}
