import java.util.ArrayList;

public class BlockchainApp {

    public static void main(String[] args) {


        ArrayList<Block> blockchain = new ArrayList<Block>();

        Wallet wallet1 = new Wallet("Allison", 100);
        Wallet wallet2 = new Wallet("Billy", 100);
        Wallet wallet3 = new Wallet("Candice", 100);
        Wallet wallet4 = new Wallet("Dave", 100);
        Wallet wallet5 = new Wallet("Elliot", 100);
        Wallet wallet6 = new Wallet("Francis", 100);
        Wallet wallet7 = new Wallet("Georgia", 100);
        Wallet wallet8 = new Wallet("Harold", 100);

        Transaction transaction1 = new Transaction(wallet1, wallet2, 10);
        Transaction transaction2 = new Transaction(wallet3, wallet4, 20);
        Transaction transaction3 = new Transaction(wallet5, wallet6, 10);
        Transaction transaction4 = new Transaction(wallet7, wallet8, 10);


        ArrayList<Transaction> list1 = new ArrayList<Transaction>();
        list1.add(transaction1);
        list1.add(transaction2);
        Block block1 = new Block(0, list1);
        blockchain.add(block1);
        System.out.println(blockchain);

        ArrayList<Transaction> list2 = new ArrayList<Transaction>();
        list2.add(transaction3);
        list2.add(transaction4);
        Block block2 = new Block(block1.getCurrentHash(), list2);
        blockchain.add(block2);
        System.out.println(blockchain);

        System.out.println(blockchain.get(0).getTransactions().get(1).getSender().getOwner());
    }
}
