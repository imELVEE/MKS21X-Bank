public class Driver{
        public static void main(String[] args) {
                BankAccount test = new BankAccount(5000.0, 44351, "demo password");

                System.out.println("The balance is " + test.getBalance());

                System.out.println("The account ID is " + test.getAccountID());

                test.setPassword("real demo password");

                System.out.println(test);

                if (test.deposit(5)) {
                        System.out.println("Desposited successfully");
                }
                else {
                        System.out.println("Failure");
                }

		if (test.deposit(-5)) {
                        System.out.println("Desposited successfully");
                }
                else {
                        System.out.println("Failure");
                }

		if (test.withdraw(5)) {
                        System.out.println("Withdrawn successfully");
                }
                else {
                        System.out.println("Failure");
                }


		if (test.withdraw(9000)) {
                        System.out.println("Withdrawn successfully");
                }
                else {
                        System.out.println("Failure");
                }
	}
}
