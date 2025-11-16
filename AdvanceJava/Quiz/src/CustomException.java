class BillException extends Exception{
    public BillException(String mess){
        super(mess);
    }
}

public class CustomException {
    public static void main(String[] args){
        int i = 0, j = 0;
        try{
            j = i/20;
            if(j == 0){
                throw new BillException("I dont wannt print zero");
            }
        }
        catch(BillException e){
             j = 18;
            System.out.println(j);
        }
    }
}
