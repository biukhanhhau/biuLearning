public class SAM {  // SAM = Single Abstract Method
    public static void main(String [] args){
        human biu = () -> System.out.println("gay a");
        biu.bill();

        human biuu = () -> {
            System.out.println("gay aaaa");
        };
        biuu.bill();
    }
}

@FunctionalInterface    // this interface class only have one method
interface human{
    void bill();
}