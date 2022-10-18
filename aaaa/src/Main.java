import java.util.Iterator;
import java.util.LinkedHashSet;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        /*Boolean adding=false, side=false;
        int minus=0;
        int[][] array=new int[5][5];
        for ()*/
        System.out.println(new BigInteger("0").equals(0));
        System.out.println(new BigInteger("0").equals(BigInteger.ZERO));
        }




        public static int lastDigit(BigInteger n1, BigInteger n2) {
        if (n2.equals(0)) return 1;
            if (n2.equals(BigInteger.ZERO)) return 1;
            System.out.println(n2.equals(0));
            n1=n1.remainder(BigInteger.TEN);
            int turner=n1.intValue();

            int reseller;
            switch (turner){
                case 0: return 0;
                case 1: return 1;
                case 2: reseller=n2.mod(BigInteger.valueOf(4)).intValue();
                    switch (reseller-1){
                        case 0:return 2;
                        case 1:return 4;
                        case 2:return 8;
                        case 3:return 6;
                        case -1:return 6;
                    }
                case 3: reseller=n2.mod(BigInteger.valueOf(4)).intValue();
                    switch (reseller-1){
                        case 0:return 3;
                        case 1:return 9;
                        case 2:return 7;
                        case 3:return 1;
                        case -1:return 1;
                    }
                case 4: if (n2.getLowestSetBit()!=0){return 6;}else return 4;
                case 5: return 5;
                case 6: return 6;
                case 7: reseller=n2.mod(BigInteger.valueOf(4)).intValue();
                    switch (reseller-1){
                        case 0:return 7;
                        case 1:return 9;
                        case 2:return 3;
                        case 3:return 1;
                        case -1:return 1;
                    }
                case 8: reseller=n2.mod(BigInteger.valueOf(4)).intValue();
                    switch (reseller-1){
                        case 0:return 8;
                        case 1:return 4;
                        case 2:return 2;
                        case 3:return 6;
                        case -1: return 6;
                    }
                case 9: if (n2.getLowestSetBit()!=0){return 1;}else return 9;


            }
            return 1;
        }

}


    /*int [][] arr=new int[10][10];
        for (int i=0;i!=10;i++){
            for (int y=0;y!=10;y++){
                arr[i][y]=i+y;
            }
        }
        for (int [] sub : arr){
            for (int num : sub){
                System.out.print(num+" ");
            }
            System.out.println();
        }*/
//}