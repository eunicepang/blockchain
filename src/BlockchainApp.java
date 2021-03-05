import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class BlockchainApp {

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        blockchain.modifyBlockchain(blockchain);
    }
}
        
    class Blockchain{
        ArrayList<Block> blocks;
        int length;

        Blockchain(){
            this.blocks = new ArrayList<>();
            this.length = 0;
            Block genesisBlock = new Block(new java.util.Date(), 0, new ArrayList<>());
            this.blocks.add(genesisBlock);
            this.length = 1;
        }

        void modifyBlockchain(Blockchain blockchain){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome");
            System.out.println("\n");
            System.out.println("A : Print previous block");
            System.out.println("B : Add Block");
            System.out.println("C : Exit app");
    
            char option;
            do {
                System.out.println("==========================================================================");
                System.out.println("What would you like to do?");
                option = scanner.next().charAt(0);
                System.out.println("\n");
    
                String sender;
                int amount;
                String receiver;
                switch (option) {
                    case 'A' :
                        if (blockchain.blocks.size() > 0){
                            System.out.println(blockchain.blocks.get(blocks.size()-1));
                        } else {
                            System.out.println("Blockchain is empty, please add a transaction");
                            System.out.println("\n");
                            blockchain.modifyBlockchain(blockchain);
                        }
                        System.out.println("----------------------------------------");
                        System.out.println("Previous block = " + blockchain.blocks.get(blocks.size()-1));
                        System.out.println("----------------------------------------");
                        System.out.println("\n");
                        break;
    
                    case 'B' :
                        System.out.println("----------------------------------------");
                        System.out.println("Who is the sender?");
                        sender = scanner.next();
                        Wallet wallet1 = new Wallet(sender, 100);
                        System.out.println("How much is being sent?");
                        amount = scanner.nextInt();
                        System.out.println("Who is the receiver?");
                        receiver = scanner.next();
                        Wallet wallet2 = new Wallet(receiver, 200);
                        wallet1.setSum(wallet1.getSum()-amount);
                        wallet2.setSum(wallet2.getSum()+amount);
                        Transaction transaction = new Transaction(wallet1, wallet2, amount);
                        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
                        transactions.add(transaction);
                        Block block = new Block(new java.util.Date(), 0, transactions);
                        blockchain.blocks.add(block);
                        System.out.println(blockchain.blocks);
                        System.out.println(wallet1.getOwner() + " now has " + wallet1.getSum());
                        System.out.println(wallet2.getOwner() + " now has " + wallet2.getSum());
                        blockchain.length++;
                        System.out.println("Blockchain size: " + blockchain.length);
                        break;
    
                    case 'C' :
                        System.out.println("----------------------------------------");
                        break;
                }
            }
    
            while(option != 'C');
            System.out.println("Thank you!");
        }

    }
