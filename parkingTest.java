import junit.framework.TestCase;

public class parkingTest extends TestCase {


    // Test Number: 1
    // Objective: get the price when the time value is 1
    // Input(s): 1
    // Expected Output: price is 2.00

    public void getTime001() {

    parking time = new parking();

    try {
        time.getPrice(1);
    }
    catch (parkingException.parkingExceptionHandler e) {
        assertEquals("2.00", e.getMessage());
        }
    }


    // Test Number: 2
    // Objective: get the price when the time value is 24
    // Input(s): 24
    // Expected Output: price is 10.00

    public void getTime002(){

        parking time = new parking();

        try {
            time.getPrice(24);
        }
        catch (parkingException.parkingExceptionHandler e) {
            assertEquals("10.00", e.getMessage());
        }
    }


    // Test Number: 3
    // Objective: get the price when the time value is 0
    // Input(s): 0
    // Expected Output: 0

    public void getTime003() {

        parking time = new parking();

        try {
            time.getPrice(0);
        }
        catch (parkingException.parkingExceptionHandler e) {
            assertEquals("0.00", e.getMessage());
        }
    }


    // Test Number: 4
    // Objective: get the price when the time value is 8
    // Input(s): 8
    // Expected Output: 4

    public void getTime004() {

        parking time = new parking();

        try {
            time.getPrice(8);
        }
        catch (parkingException.parkingExceptionHandler e) {
            assertEquals("0.00", e.getMessage());
        }
    }

    // Test Number: 5
    // Objective: get the price when the time value is -5
    // Input(s): -5
    // Expected Output: 0

    public void getTime005() {

        parking time = new parking();

        try {
            time.getPrice(-5);
        }
        catch (parkingException.parkingExceptionHandler e) {
            assertEquals("0.00", e.getMessage());
        }
    }
}