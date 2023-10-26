package kennarddh.main;

class TestException extends Throwable {
    public TestException(String message) {
        super(message);
    }
}

class ExceptionMain {
    public static void main(String[] args) {
        try {
            throw new TestException("error message");
        } catch (TestException e) {
            System.out.println("ERROR: " + e.getMessage());

            e.printStackTrace();
        }
    }
}
