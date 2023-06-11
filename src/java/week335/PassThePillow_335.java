package week335;

public class PassThePillow_335 {
    public int passThePillow(int n, int time) {
        //先把n扩大两倍，再求time/2（n-1）的倍数，求time%2（n-1）余数。
        int[] list = new int[2*(n-1)];
        int idx = 0;
        for(int i = 1;i<=n;i++){
            list[idx++] = i;
        }

        for(int j = n-1;j>1;j--){
            list[idx++] = j;
        }
        int resIdx = 0;
        resIdx = time%(2*(n-1));
        return list[resIdx];
    }

    public static void main(String[] args) {
        PassThePillow_335 passThePillow335 = new PassThePillow_335();
        System.out.println(passThePillow335.passThePillow(3, 2));
        System.out.println(12/18);
    }
}
