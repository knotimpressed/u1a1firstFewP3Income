import java.util.Scanner; // test for commit

class Main {
  public static void main(String[] args) {
    Scanner keyedInput = new Scanner(System.in);
    
    final double FBRACKET1_SIZE = 48535; // ammount of dollars in w
    final double FBRACKET2_SIZE = 48534;
    final double FBRACKET3_SIZE = 53404;
    final double FBRACKET4_SIZE = 63895;
    final double FBRACKET5_SIZE = 214368;
    
    final double FBRACKET1_END = 48535; //end monetary ammount of each bracket
    final double FBRACKET2_END = 97069;
    final double FBRACKET3_END = 150473;
    final double FBRACKET4_END = 214368;
    final double FBRACKET5_END = 1000000000;
    
    final double FBRACKET1_TAX = .15;//federal tax
    final double FBRACKET2_TAX = .205;
    final double FBRACKET3_TAX = .26;
    final double FBRACKET4_TAX = .29;
    final double FBRACKET5_TAX = .33;
    
    double Ftax = 0;
    double incomeCalc;
    
    System.out.println("Welcome to Canadaian Income Tax Calculator 2020!");
    System.out.println("(Please note due to java double rounding error\nfinal tax may be off by up to $1.)");
    System.out.println("Please enter your income:"); // test
    double income = keyedInput.nextDouble();
    
    if (income > FBRACKET4_END) // if the income is more than the end of federal bracket 4
    {
        Ftax = FBRACKET1_SIZE * FBRACKET1_TAX; // Bracket one is full, so its tax is the maximum
        Ftax = Ftax + (FBRACKET2_SIZE * FBRACKET2_TAX); //same for these, its just added on to the previous tax
        Ftax = Ftax + (FBRACKET3_SIZE * FBRACKET3_TAX);
        Ftax = Ftax + (FBRACKET4_SIZE * FBRACKET4_TAX);
        
        incomeCalc = income; // shift income into incomeCalc
        incomeCalc = incomeCalc - FBRACKET4_END; //subtract all the money from brackets 1-4
        Ftax = Ftax + (incomeCalc * FBRACKET5_TAX); // result is money in bracket 5, multiply by brqacket 5 tax.
    }
    
    else if (income > FBRACKET3_END) // if the income is more than the end of federal bracket 4
    {
        Ftax = FBRACKET1_SIZE * FBRACKET1_TAX;
        Ftax = Ftax + (FBRACKET2_SIZE * FBRACKET2_TAX);
        Ftax = Ftax + (FBRACKET3_SIZE * FBRACKET3_TAX);
        
        incomeCalc = income;
        incomeCalc = incomeCalc - FBRACKET3_END;
        Ftax = Ftax + (incomeCalc * FBRACKET4_TAX);
    }
    
    else if (income > FBRACKET2_END) // if the income is more than the end of federal bracket 4
    {
        Ftax = FBRACKET1_SIZE * FBRACKET1_TAX;
        Ftax = Ftax + (FBRACKET2_SIZE * FBRACKET2_TAX);
        
        incomeCalc = income;
        incomeCalc = incomeCalc - FBRACKET2_END;
        Ftax = Ftax + (incomeCalc * FBRACKET3_TAX);
    }
    
    else if (income > FBRACKET1_END) // if the income is more than the end of federal bracket 4
    {
        Ftax = FBRACKET1_SIZE * FBRACKET1_TAX;
        
        incomeCalc = income;
        incomeCalc = incomeCalc - FBRACKET1_END;
        Ftax = Ftax + (incomeCalc * FBRACKET2_TAX);
    }
    
    else if (income > 0) // if the income is more than the end of federal bracket 4
    {
        incomeCalc = income;
        incomeCalc = incomeCalc - 0;
        Ftax = Ftax + (income * FBRACKET1_TAX);
    }
    
    System.out.println("Federal Tax: $" + Ftax);
    
    
    
    //start of provincial tax
    final double PBRACKET1_SIZE = 44740; // ammount of dollars in w
    final double PBRACKET2_SIZE = 44742;
    final double PBRACKET3_SIZE = 60518;
    final double PBRACKET4_SIZE = 70000;
    //final double PBRACKET5_SIZE = 220000;
    
    final double PBRACKET1_END = 44740; //end monetary ammount of each bracket
    final double PBRACKET2_END = 89482;
    final double PBRACKET3_END = 150000;
    final double PBRACKET4_END = 220000;
    //final double PBRACKET5_END = 1000000000;
    
    final double PBRACKET1_TAX = .0505;//federal tax
    final double PBRACKET2_TAX = .0915;
    final double PBRACKET3_TAX = .1116;
    final double PBRACKET4_TAX = .1216;
    final double PBRACKET5_TAX = .1316;
    
    double Ptax = 0;
    
    if (income > PBRACKET4_END) // if the income is more than the end of federal bracket 4
    {
        Ptax = PBRACKET1_SIZE * PBRACKET1_TAX; // Bracket one is full, so its tax is the maximum
        Ptax = Ptax + (PBRACKET2_SIZE * PBRACKET2_TAX); //same for these, its just added on to the previous tax
        Ptax = Ptax + (PBRACKET3_SIZE * PBRACKET3_TAX);
        Ptax = Ptax + (PBRACKET4_SIZE * PBRACKET4_TAX);
        
        incomeCalc = income; // shift income into incomeCalc
        incomeCalc = incomeCalc - PBRACKET4_END; //subtract all the money from brackets 1-4
        Ptax = Ptax + (incomeCalc * PBRACKET5_TAX); // result is money in bracket 5, multiply by brqacket 5 tax.
    }
    
    else if (income > PBRACKET3_END) // if the income is more than the end of federal bracket 4
    {
        Ptax = PBRACKET1_SIZE * PBRACKET1_TAX;
        Ptax = Ptax + (PBRACKET2_SIZE * PBRACKET2_TAX);
        Ptax = Ptax + (PBRACKET3_SIZE * PBRACKET3_TAX);
        
        incomeCalc = income;
        incomeCalc = incomeCalc - PBRACKET3_END;
        Ptax = Ptax + (incomeCalc * PBRACKET4_TAX);
    }
    
    else if (income > PBRACKET2_END) // if the income is more than the end of federal bracket 4
    {
        Ptax = PBRACKET1_SIZE * PBRACKET1_TAX;
        Ptax = Ptax + (PBRACKET2_SIZE * PBRACKET2_TAX);
        
        incomeCalc = income;
        incomeCalc = incomeCalc - PBRACKET2_END;
        Ptax = Ptax + (incomeCalc * PBRACKET3_TAX);
    }
    
    else if (income > PBRACKET1_END) // if the income is more than the end of federal bracket 4
    {
        Ptax = PBRACKET1_SIZE * PBRACKET1_TAX;
        
        incomeCalc = income;
        incomeCalc = incomeCalc - PBRACKET1_END;
        Ptax = Ptax + (incomeCalc * PBRACKET2_TAX);
    }
    
    else if (income > 0) // if the income is more than the end of federal bracket 4
    {
        incomeCalc = income;
        incomeCalc = incomeCalc - 0;
        Ptax = Ptax + (income * PBRACKET1_TAX);
    }
    
    System.out.println("Provincial Tax: $" + Ptax);
    double Ttax = Ftax + Ptax;
    System.out.println("Total Tax: $" + Ttax);

  }
}