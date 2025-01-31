package BitManipulation;

public class BitManipulation {
    public static void OddOrEvenBit(int n) {
        System.out.println("Entered Number: " + n);
        int bitMask = 1;
        if((n & bitMask) == 0) System.out.println("Even");
        else System.out.println("Odd");
    }

    public static int GetIthBit(int n, int i) {
        int bitMask = 1<<i;

        if((n & bitMask) == 0) return 0;
        else return 1;
    }

    public static int SetIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int ClearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        if(newBit == 0) return ClearIthBit(n,i);
        else return SetIthBit(n,i);
    }

    public static int ClearLastBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int ClearRangeOfBits(int n, int i, int j) {
        int a = (~0)<< j+1;
        int b = (1<<i) - 1;
        int bitMask = a|b;
        return n & bitMask;
    }

    public static Boolean CheckPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static int CountSetBits(int n) {
        int count = 0;

        while(n >0){
            if((n & 1) != 0) count++;
            n = n>>1;
        }

        return count;
    }

    public static void main(String[] args) {
        OddOrEvenBit(12);
        int ithBit = GetIthBit(10, 2);
        System.out.println("Ith Bit is = " + ithBit);
        int setIthBit = SetIthBit(10,2);
        System.out.println("Set Ith Bit is = " + setIthBit);
        int clearIthBit = ClearIthBit(10,2);
        System.out.println("Clear Ith Bit is = " + clearIthBit);
        int updateIthBit = UpdateIthBit(10,2,1);
        System.out.println("Update Ith Bit is = " + updateIthBit);
        int clearLastBits = ClearLastBits(10,2);
        System.out.println("Clear Last Bit is = " + clearLastBits);
        int clearRangeOfBits = ClearRangeOfBits(10,2,1);
        System.out.println("Clear Range of Bit is = " + clearRangeOfBits);
        boolean checkPowerOfTwo = CheckPowerOfTwo(16);
        System.out.println("Check Power of Two is = " + checkPowerOfTwo);
        int countSetBits = CountSetBits(10);
        System.out.println("Count Set Bit is = " + countSetBits);
    }
}
