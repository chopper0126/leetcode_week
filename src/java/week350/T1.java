package week350;
//6901. 总行驶距离
public class T1 {
    public static void main(String[] args) {
        System.out.println(distanceTraveled(14, 4));
    }
    public static int distanceTraveled(int mainTank, int additionalTank) {
        int ans = 0;
        int i = 0;
        while (mainTank > 0){
            i++;
            mainTank--;
            if (i % 5 == 0 && additionalTank > 0){
                 mainTank++;
                 additionalTank--;
            }
            ans += 10;
        }
        return ans;
    }
    public static int distanceTraveled2(int mainTank, int additionalTank) {
        int ans = 0;
        int ma = mainTank;
        int times = ma / 5;
        times = times > additionalTank ? (additionalTank+ma) / 5:(times+ma) / 5;
        ans = mainTank * 10;
        while (additionalTank > 0 && times > 0){
            ans += 10;
            times --;
            additionalTank--;
        }
        return ans;
    }
}
