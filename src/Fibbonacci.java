/**
 * Created by cale146 on 9/26/18.
 */
public class Fibbonacci {

    public int fibToN(int userSeed, int n){
        int previous = 0, temp;
        if(userSeed <= 0)
            return 0;
        System.out.print(userSeed + "\n");
        for(int i = 0; i <= n; i++){
            temp = userSeed+previous;
            previous=userSeed;
            userSeed = temp;
            System.out.print(userSeed + "\n");
        }
        return userSeed;
    }

}
