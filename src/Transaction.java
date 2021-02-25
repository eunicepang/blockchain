public class Transaction {
    
    private String sender;
    private String recipient;
    private int amount;

    public Transaction(String sender, String recipient, int amount){
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    public String getSender(){
        return this.sender;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public String getRecipient(){
        return this.recipient;
    }

    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    public int getAmount(){
        return this.amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
}
