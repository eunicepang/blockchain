import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Block {
    
    private Date timestamp; 
    private int previousHash;
    private int currentHash;
    private ArrayList<Transaction> transactions;

    public Block(Date timestamp, int previousHash, ArrayList<Transaction> transactions){
        this.timestamp = timestamp;
        this.previousHash = previousHash;
        this.currentHash = Arrays.hashCode(new int[] {transactions.hashCode() ,this.previousHash});
        this.transactions = transactions;
    }

    public Date getTimestamp(){
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp){
        this.timestamp = timestamp;
    }

    public int getPreviousHash(){
        return this.previousHash;
    }

    public void setPreviousHash(int previousHash){
        this.previousHash = previousHash;
    }

    public int getCurrentHash(){
        return this.currentHash;
    }

    public void setCurrentHash(int currentHash){
        this.currentHash = currentHash;
    }

    public ArrayList<Transaction> getTransactions(){
        return this.transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions){
        this.transactions = transactions; 
    }

    public void addTransactions(ArrayList<Transaction> transactions, Transaction transaction){
        transactions.add(transaction);
        this.transactions = transactions;
        
    }
}
