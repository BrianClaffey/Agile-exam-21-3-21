public class parking {

    public static double getPrice(double time) throws parkingException.parkingExceptionHandler {


        if (time < 3 && time > 0) {
            return 2.00;
        }

        if (time > 3 && time <= 24) {
            double price = (time - 3) / 2;
            double result = price + 2;
            if (result > 10.00) {
                result = 10.00;
            }
            return result;
        }


        return 0;
    }
}