public class Transaction {
    
    private Wallet sender;
    private Wallet recipient;
    private int amount;

    public Transaction(Wallet sender, Wallet recipient, int amount){
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    public Wallet getSender(){
        return this.sender;
    }

    public void setSender(Wallet sender){
        this.sender = sender;
    }

    public Wallet getRecipient(){
        return this.recipient;
    }

    public void setRecipient(Wallet recipient){
        this.recipient = recipient;
    }

    public int getAmount(){
        return this.amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
}
