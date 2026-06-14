import java.util.Random;

public class OTPGenerator {

    public static int generateOTP()
    {
        Random random = new Random();

        return 100000 + random.nextInt(900000);
    }

    public static void main(String[] args) {

        int otp = generateOTP();

        System.out.print("\nGenerated OTP is : " + otp );

    }
}