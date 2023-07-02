public class Exercise1_4 {
    public static void main(String[] args) {
        int current_pop = 312032486;
        int num_sec = 60 * 60 * 24 * 365;
        int num_b_ayear = num_sec / 7, num_D_ayear = num_sec / 13, num_IM_ayear = num_sec / 45;
        System.out.println(num_sec);
        System.out.println("Number of birth in one year = " + num_b_ayear);
        System.out.println("Number of death in one year = " + num_D_ayear);
        System.out.println("Number of immigrants in one year = " + num_IM_ayear);
        System.out.println("Total population after one year = " + (current_pop + num_b_ayear - num_D_ayear + num_IM_ayear));
        System.out.println((current_pop + num_b_ayear - num_D_ayear + num_IM_ayear) * 5);
    }
}
