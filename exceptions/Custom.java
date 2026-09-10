public class Custom extends Exception{
    Custom(String message){
        super(message);
    }
}


public class Main(){
    psvm(String[] args){
        try{
            method1();
        }
        catch(Custom e){
            //handle exception
        }
    }

    psv method1() throws Custom{
        throw new Custom("some issue arise");
    }
}
        
 