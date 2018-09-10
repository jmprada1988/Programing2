package arraysReview;

public class CLDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("You entered " + args.length + " comand line arguments");
        
        if(args.length > 0) {
            System.out.println("They were: ");
            for (int i = 0; i < args.length; i++)
                System.out.println(" " + args[i]);
        }

    }

}
