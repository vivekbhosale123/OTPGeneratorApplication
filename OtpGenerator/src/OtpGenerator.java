import java.security.SecureRandom;

public class OtpGenerator {

    static void main()
    {

        // First Method to generate OTP

//        SecureRandom  secureRandom=new SecureRandom();
//
//        int otp=secureRandom.nextInt(9000)+1000;
//
//        IO.println(otp);

        // Second Method to generate OTP

        int otp= (int) (Math.random()*9000+1000);

        IO.println(otp);
  }

}
