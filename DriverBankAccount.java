public class DriverBankAccount{
  public static void main(String[]args){
    BankAccount b1 = new BankAccount(1000.0, 1000001, "abc123");
    BankAccount b2 = new BankAccount(1234.0, 1000231, "abcasdg23");

    System.out.println("Account b1:");
    System.out.println(b1);
    System.out.println("Account b2:");
    System.out.println(b2);
    System.out.println();


    double cashAmount = 300.0;
    while(cashAmount < 3000){
      System.out.println("Attempt to move "+cashAmount+" from the b1 to b2 account:");
      if(b1.withdraw(cashAmount) ){
        if(b2.deposit(cashAmount)){
          System.out.println("Success");
        }else{
          //This should never happen.
          //Error message provided to make sure that is the case
          System.out.println(cashAmount + " withdrawn from" +
                             b1 + "Failed to add to "+b2);
        }
      }else{
        System.out.println("Failed to withdraw "+cashAmount+" from "+b1);
      }

      System.out.println("Account b1:");
      System.out.println(b1);
      System.out.println("Account b2:");
      System.out.println(b2);
      System.out.println();
      cashAmount *= 2;
    }
    

    double cash = 100.0;
    String pass = "abcasdg23";
    for (int i = 0; i < 3; i++) {
     if (pass.equals("abcasdg23")) {

	if (cash > 0) {

		if (b2.getBalance() > cash) {
     			b2.transferTo(b1, cash, pass);
			System.out.println("SUCCESS: tranferred " + cash);
		}
		else {
			System.out.println("cannot transfer more money than in account: tried to transfer " + cash);
		}

     	}
	else {
		System.out.println("cannot deposit transfer negative amount: tried to transfer " + cash);
	}
	
	
     }
     else {
        System.out.println("Transfer failed, password incorrect");
     }

     System.out.println("Account b1:");
     System.out.println(b1);
     System.out.println("Account b2:");
     System.out.println(b2);
     System.out.println();
	
     cash -= 200.0;
     if (i == 1) {
	pass = "wrongpass";
     }
    
    }


  }
}
