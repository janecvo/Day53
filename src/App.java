import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<BankAccount> accountList = new ArrayList<>();

    public static void main(String[] args) {

//Animal

        ArrayList<Animal> animalList = new ArrayList<>();
//adding overloaded animals
        Animal percy = new Animal ("Percy");
        Animal bella = new Animal("Bella", true);
        Animal babe = new Animal(false);
        
        animalList.add(percy);
        animalList.add(bella);
        animalList.add(babe);

        System.out.println("Animal Menu \n Entering nothing will stop the loop.");

        while(true){
            boolean dogOrNah = false;
            System.out.println("Please enter your animal's name");
            String animalNm = scanner.nextLine();
            // System.out.println("Is it a dog?");
            
                if (animalNm.equalsIgnoreCase("")){
                    break;
                }
                System.out.println("Is it a dog?");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("yes")){
                    dogOrNah = true;
                }

                animalList.add(new Animal(animalNm, dogOrNah));
                System.out.println(animalList);
                continue;
            }

                for (Animal animal: animalList){
                    System.out.println(animal);
                }
        
//TV Shows
        ArrayList<TvShow> showList = new ArrayList<>();
                showList.add(new TvShow("Bones"));
                showList.add(new TvShow("Castle",  120));
                showList.add(new TvShow("Sesame Street", 1200, "Children"));

        while(true){
            System.out.println("Enter a tv show name.");
            String showName = scanner.nextLine();

            if (showName.equalsIgnoreCase("")){
                break;
            }

            System.out.println("Enter the number of episodes the show has: ");
            Integer epiNum = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter the show's genre.");
            String tvGenre = scanner.nextLine();

            showList.add(new TvShow(showName, epiNum, tvGenre)); 
            System.out.println(showList);
            continue;            
    }
            for (TvShow tvShow: showList ){
                System.out.println(tvShow);
            }

//Books
    ArrayList<Book>bookList = new ArrayList<>();

                Book cat = new Book(1968);
                Book lord = new Book("Lord of the Flies", 245);
                Book heart = new Book ("Atlas of the Heart");
                Book janeBio = new Book ("Life, JV Style", 999, 1981);

            bookList.add(cat);
            bookList.add(lord);
            bookList.add(heart );
            bookList.add(janeBio);


    while(true){
        System.out.println("Enter a book title.");
        String bTitle = scanner.nextLine();
            if (bTitle.equalsIgnoreCase("")){
                break;
            }

            System.out.println("Enter the number of pages in your book. ");
            Integer bPages = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter the publication year of your book.");
            Integer bPubYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book (bTitle, bPages, bPubYear));
            }

            System.out.println("What would you like to see about the book: name or everything?");
            String response = scanner.nextLine();

        for (Book book: bookList ){
                    System.out.println(book.toString(response));
        }

//BankAccount
    
    BankAccount acct00 = new BankAccount("Jane", 1000, 001);
    BankAccount acct01 = new BankAccount("Maico", 5000, 002);
    BankAccount acct02 = new BankAccount("Tabby", 451.02,003);

    accountList.add(acct00);
    accountList.add(acct01);
    accountList.add(acct02);

    System.out.println(accountList);

    for ( BankAccount bankAccount: accountList ){
                System.out.println(bankAccount);
            }

    System.out.println("Hello world!  Welcome to the Bank of Jane! \n  Are you an existing customer? (-1 to exit) \n 1. Yes \n 2. No");
    
    while(true){
    int response1 =Integer.valueOf(scanner.nextLine());

    if (response1 == 1){
        System.out.println("What is your account number?");
        Integer acctNumb = Integer.valueOf(scanner.nextLine());

        boolean hasAcct = false;
        int index = -1;
        for (int i = 0;  i < accountList.size(); i++){
            if (accountList.get(i).getAccountNumber() == acctNumb){
                hasAcct = true;
                index = i;
            }

            if (hasAcct){
                mainMenu(accountList.get(index));
            }else {
                System.out.println("Account not found. Please try again.");
            }
        }
    } else if (response1 == 2) {
        System.out.println("Let's make a new account!");
        BankAccount newAcct = new BankAccount();

        System.out.println("What is the name on the account?");
        String userName = scanner.nextLine();
        newAcct.setAccountHolderName(userName);

        System.out.println("What is the account beginning balance?");
        double userBeginBalance = Double.valueOf(scanner.nextLine());
        newAcct.setBankAccountBalance(userBeginBalance);

        accountList.add(newAcct); 
        mainMenu(accountList.get((accountList.size())-1));
    
    } else if (response1 == -1){
        System.out.println("You have exited the system. Goodbye.");
    }
}
    }

    //Bank Menu
    public static void mainMenu(BankAccount acct) {
        // takes object user currently interacting with
        System.out.println("Hello " + acct.getAccountHolderName());
        System.out.println(
                "Welcome to the Main Menu, what would like to do today? \n 1. Check account balance. \n 2. Make a withdrawal \n 3. Make a deposit \n 4. Make a transfer to another account. \n 0. Exit.");

        int userResponse = Integer.valueOf(scanner.nextLine());

        while (true) {
            if (userResponse == 1) {
                System.out.println(acct.getBankAccountBalance());
                break;

            } else if (userResponse == 2) {
                System.out.println("How much would you like to withdraw?");
                double withdrawAmt = Double.valueOf(scanner.nextLine());
                acct.withdrawal(withdrawAmt);
                System.out.println("Your withdrawal of " + withdrawAmt + " is complete. Your new balance is " + acct.getBankAccountBalance() + ".");
                break;

            } else if (userResponse == 3) {
                System.out.println("How much would you like to deposit?");
                double depositAmt = Double.valueOf(scanner.nextLine());
                acct.deposit(depositAmt);
                System.out.println("Your deposit of" + depositAmt + "is complete. Your new balance is " + acct.getBankAccountBalance() + ".");
                break;

            } else if (userResponse == 4 ) {
                // transfer
                System.out.println("Please enter the account number you'd like to transfer a balance to.");
                int acctToTransfer = Integer.valueOf(scanner.nextLine());

                BankAccount transferAcct = new BankAccount();
                boolean transferAcctFound = false;
                int index = -1;

                for (int i = 0; i < accountList.size(); i++){
                    BankAccount accts = accountList.get(i);
                    if (acctToTransfer == accts.getAccountNumber()){
                        transferAcct = accts;
                        transferAcctFound = true;
                        index = i;
                    }
                }
                if (transferAcctFound){
                    System.out.println("Account " + acctToTransfer + " is available for transfer. How much would you like transfer?");
                    double transferAmt = Double.valueOf(scanner.nextLine());
                    acct.transfer(transferAcct, transferAmt);
                    System.out.println("The balance of $" + transferAmt + " has been transfered from " +  acct.getAccountNumber() + " to " + acctToTransfer + ". Your current balance of the transfer is " + acct.getBankAccountBalance() + ".");
                    break;

                }else {
                    System.out.println("Account not found. Please try again.");
                }

            } else if (userResponse == 0) {
                System.out.println("You are exiting the system. Goodbye!");
                break;
            }
        }

//Counter
Counter counting = new Counter();
Counter counting1 = new Counter(1);
Counter counting100 = new Counter(100);
Counter counting15 = new Counter(15);

System.out.println(counting);
counting.increase();
System.out.println("Increase by 1: " + counting);
counting.decrease();
System.out.println("Decrease by 1: " + counting);
System.out.println(counting1);

System.out.println(counting100);
counting100.decrease(50);
System.out.println(counting100);

System.out.println(counting15);
counting15.increase(73);
System.out.println(counting15);
    }
}


