package cisc181q2;

public class carclass {

	



		private double APR;
		private double CarCost;
		private double CarDownPayment;
		private int lengthOfLoan;
		private double interestRate;
		private double MonthlyCarPayment;
		private double TotalInterest;
		
		
		
		  public carclass(double aPR, double carCost, double carDownPayment, int lengthOfLoan) {
			super();
			APR = aPR;
			CarCost = carCost;
			CarDownPayment = carDownPayment;
			this.lengthOfLoan = lengthOfLoan;
			MonthlyCarPayment = monthlyCarPayment();
			TotalInterest = totalInterest();
		}



		public double getMonthlyCarPayment() {
			return MonthlyCarPayment;
		}



		public void setMonthlyCarPayment(double monthlyCarPayment) {
			MonthlyCarPayment = monthlyCarPayment;
		}



		public double getTotalInterest() {
			return TotalInterest;
		}



		public void setTotalInterest(double totalInterest) {
			TotalInterest = totalInterest;
		}



		public double monthlyCarPayment() {
		   return (CarCost * ((APR*Math.pow((1+APR),lengthOfLoan))/((Math.pow((1+APR),lengthOfLoan)-1))));
		  }
		   
		  
		 
		/*
		public double monthlyCarPayment () {
			return ((interestRate/12)*(CarCost - CarDownPayment))/(1-Math.pow(1+(interestRate/12),-lengthOfLoan));
		}
		*/
				   
		public double totalInterest () {
			return (monthlyCarPayment() * lengthOfLoan) - (CarDownPayment + CarCost);
		}
		
		
		public double APR () {
			return (interestRate / 12 *100);
		}
		
		public double getCarCost() {
			return CarCost;
		}
		
		public void setCarCost(int CarCost) {
			this.CarCost = CarCost;
		}
		
		
		public double getCarDownPayment() {
			return CarDownPayment;
		}
		
		
			
		public int getlengthOfLoan() {
			return lengthOfLoan;
		}
		
		public void setgetinterestRate() {
			this.interestRate  = getinterestRate();
		}
		
		public double getinterestRate() {
			return (CarCost * .10);
		}
		
		public double MonthlyCarPayment() {
			return (CarCost / lengthOfLoan);
		}
		
		
		/*
		public double TotalInterest() {
			return TotalInterest;
		}
		*/
		/*
		  monthlypayment =35000 * (.0085(1+.0085)^60)/((1+.0085)^60 -1)
	*/

}

