package hr.unipu.primjeri;

public class A014PrintArgument {

    public static void main(String[] args) {
        int argumentNum = args.length;
        for(int i = 0; i < argumentNum; i++) {
            System.out.println("Argument " + (i+1) + ": " + args[i]);
        }
    }

}