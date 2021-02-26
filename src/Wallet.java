
public class Wallet{
    
    private String owner;
    private int sum; 
    private String privateKey;
    private String publicKey;

    public Wallet(String owner, int sum){
        this.owner = owner;
        this.sum = sum;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public int getSum(){
        return this.sum;
    }

    public void setSum(int sum){
        this.sum = sum;
    }
}
