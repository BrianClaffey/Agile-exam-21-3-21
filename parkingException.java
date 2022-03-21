public class parkingException {

    public class parkingExceptionHandler extends Exception {

        String message;

        public parkingExceptionHandler(String errMessage){
            message = errMessage;
        }

        public String getMessage() {
            return message;
        }


    }

}