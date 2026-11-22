package java8;

interface IbankBalance{
	 public double Bankbalance();
	}

	class BankBalance implements IbankBalance{
		public double Bankbalance(){
			return 900000.00;
		}
	}

	class Me{
		public static void main(String[]args){

			BankBalance obj = new BankBalance();
			double money = obj.Bankbalance();
		System.out.println("Hi Deepak your bankBalance is " +money);
		}
	}
