package c7;

import java.util.Random;

/**
 * Created by SuSong on 2014/12/22 0022.
 */
public class FinalData {
    private static Random random = new Random(1);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    private final int i4 = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);
    static int INT_6 = random.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + " ,INT_5 = " + INT_5 + " ,INT_6 = " + INT_6;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
//        fd1.valueOne;
        fd1.v2.i++;
//        fd1.v2 = new Value(32);
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
//        fd1.VAL_3= new Value(1);
//        fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Create new FinalData");
//        fd1.INT_6 = 10;
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }

}
