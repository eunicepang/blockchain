import java.util.ArrayList;
import java.util.Arrays;

public class Block {
    
    private int previousHash;
    private int currentHash;
    private ArrayList<Transaction> transactions;

    public Block(int previousHash, ArrayList<Transaction> transactions){
        this.previousHash = previousHash;
        this.currentHash = Arrays.hashCode(new int[] {transactions.hashCode() ,this.previousHash});
        this.transactions = transactions;
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
