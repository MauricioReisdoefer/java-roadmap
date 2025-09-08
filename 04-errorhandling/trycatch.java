public class trycatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result " + result);
        } 
        catch (Exception e){
            System.out.println("An error ocurred!");
        } 
        finally {
            System.out.println("Always run");
        }
    }
}
