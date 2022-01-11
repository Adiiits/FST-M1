package activities;

public class Activity8 {

    static void exceptionTest(String ss) throws CustomException {
        if( ss == null){
            throw new CustomException("new custom excep.- value is null");
        }else
            System.out.println(ss);


    }
    public static void main(String[] args) {
        try {
            exceptionTest("no exception String");
            exceptionTest(null);
            exceptionTest("won't execute");
        } catch (CustomException e) {
          //  e.printStackTrace();
            System.out.println("in catch block: "+e.getMessage());
        }
    }
}
