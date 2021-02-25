import java.util.ArrayList;

public class BlockchainApp {

    public static void main(String[] args) {


        ArrayList<Block> blockchain = new ArrayList<Block>();

        Transaction transaction1 = new Transaction("Ally", "Ben", 10);
        Transaction transaction2 = new Transaction("Candice", "Dave", 20);
        Transaction transaction3 = new Transaction("Emily", "Francis", 30);
        Transaction transaction4 = new Transaction("George", "Holly", 40);
        Transaction transaction5 = new Transaction("Isabel", "Jenny", 50);
        Transaction transaction6 = new Transaction("Kim", "Larry", 60);


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

        ArrayList<Transaction> list3 = new ArrayList<Transaction>();
        list2.add(transaction5);
        list2.add(transaction6);
        Block block3 = new Block(block2.getCurrentHash(), list3);
        blockchain.add(block3);
        System.out.println(blockchain);
    }
}
