import java.util.Scanner; // test for commit

class Main {
  public static void main(String[] args) {
    Scanner keyedInput = new Scanner(System.in);
    
    double income; //total income
    double bracket1_F = 0; //income in each federal bracket
    double bracket2_F = 0;
    double bracket3_F = 0;
    double bracket4_F = 0;
    double bracket5_F = 0;

    double bracket1_P = 0; //income in each provincial bracket
    double bracket2_P = 0;
    double bracket3_P = 0;
    double bracket4_P = 0;
    double bracket5_P = 0;

    final double BRACKET_1_SIZE_F = 48535; //federal bracket size
    final double BRACKET_2_SIZE_F = 48534; 
    final double BRACKET_3_SIZE_F = 53404;
    final double BRACKET_4_SIZE_F = 638945;
    final double BRACKET_5_SIZE_F = 100000000;

    final double BRACKET_1_SIZE_P = 44740; //provincial bracket size
    final double BRACKET_2_SIZE_P = 44742;
    final double BRACKET_3_SIZE_P = 60518;
    final double BRACKET_4_SIZE_P = 70000;
    final double BRACKET_5_SIZE_P = 100000000;

    final double BRACKET_1_TAX_F = .15;//federal tax
    final double BRACKET_2_TAX_F = .205;
    final double BRACKET_3_TAX_F = .26;
    final double BRACKET_4_TAX_F = .29;
    final double BRACKET_5_TAX_F = .33;

    final double BRACKET_1_TAX_P = .0505; //provincial tax
    final double BRACKET_2_TAX_P = .0915;
    final double BRACKET_3_TAX_P = .1116;
    final double BRACKET_4_TAX_P = .1216;
    final double BRACKET_5_TAX_P = .1316;

    double federalTax;

    double provincialTax;


    System.out.println("Welcome to Income Tax Calculator 2020!");
    System.out.println("Please note this will only work for taxes in Ontario, Canada.");
    System.out.println("Enter your taxable income:");
    income = keyedInput.nextDouble();

    //get income, do if else to find the bracket they're in, then from that put values into the different bracket variables, then multiply those by constant tax ammounts, then sum, output tax and net income.

    //figure out federal bracket, then set the lower ones to their respective max values. should go through and do each one. not sure if i should use else if or if, ill have to test.
    if (true)
    {
      bracket1_F = income;
      System.out.println("Your taxable income is above Federal bracket 0.");
    }

    if (income > BRACKET_1_SIZE_F)
    {
      bracket1_F = BRACKET_1_SIZE_F;
      bracket2_F = income - BRACKET_1_SIZE_F;
      System.out.println("Your taxable income is above Federal bracket 1.");
    }
    
    if (income > BRACKET_2_SIZE_F)
    {
      bracket2_F = BRACKET_2_SIZE_F;
      bracket3_F = income - BRACKET_1_SIZE_F - BRACKET_2_SIZE_F;
      System.out.println("Your taxable income is above Federal bracket 2.");
    }
    
    if (income > BRACKET_3_SIZE_F)
    {
      bracket3_F = BRACKET_3_SIZE_F;
      bracket4_F = income - BRACKET_1_SIZE_F - BRACKET_2_SIZE_F - BRACKET_3_SIZE_F;
      System.out.println("Your taxable income is above Federal bracket 3.");
    }

    if (income > BRACKET_4_SIZE_F)
    {
      bracket4_F = BRACKET_4_SIZE_F;
      bracket5_F = income - BRACKET_1_SIZE_F - BRACKET_2_SIZE_F - BRACKET_3_SIZE_F - BRACKET_4_SIZE_F;
      System.out.println("Your taxable income is above Federal bracket 4.");
    }

    //dump bracket values
    System.out.println(bracket1_F);
    System.out.println(bracket2_F);
    System.out.println(bracket3_F);
    System.out.println(bracket4_F);
    System.out.println(bracket5_F);

    federalTax = bracket1_F * BRACKET_1_TAX_F;
    federalTax = federalTax + (bracket2_F * BRACKET_2_TAX_F);
    federalTax = federalTax + (bracket3_F * BRACKET_3_TAX_F);
    federalTax = federalTax + (bracket4_F * BRACKET_4_TAX_F);
    federalTax = federalTax + (bracket5_F * BRACKET_5_TAX_F);

    System.out.println("Federal Tax: $" + federalTax);

    //FIGURE OUT PROVINCIAL BRACKET
    if (true)
    {
      bracket1_P = income;
      System.out.println("Your taxable income is above Provincial bracket 0.");
    }

    if (income > BRACKET_1_SIZE_P)
    {
      bracket1_P = BRACKET_1_SIZE_P;
      bracket2_P = income - BRACKET_1_SIZE_P;
      System.out.println("Your taxable income is above Provincial bracket 1.");
    }
    
    if (income > BRACKET_2_SIZE_P)
    {
      bracket2_P = BRACKET_2_SIZE_P;
      bracket3_P = income - BRACKET_1_SIZE_P - BRACKET_2_SIZE_F;
      System.out.println("Your taxable income is above Provincial bracket 2.");
    }
    
    if (income > BRACKET_3_SIZE_P)
    {
      bracket3_P = BRACKET_3_SIZE_P;
      bracket4_P = income - BRACKET_1_SIZE_P - BRACKET_2_SIZE_P - BRACKET_3_SIZE_P;
      System.out.println("Your taxable income is above Provincial bracket 3.");
    }

    if (income > BRACKET_4_SIZE_P)
    {
      bracket4_P = BRACKET_4_SIZE_P;
      bracket5_P = income - BRACKET_1_SIZE_P - BRACKET_2_SIZE_P - BRACKET_3_SIZE_P - BRACKET_4_SIZE_P;
      System.out.println("Your taxable income is above Provincial bracket 4.");
    }

    //dump bracket values
    System.out.println(bracket1_P);
    System.out.println(bracket2_P);
    System.out.println(bracket3_P);
    System.out.println(bracket4_P);
    System.out.println(bracket5_P);

    provincialTax = bracket1_P * BRACKET_1_TAX_P;
    provincialTax = provincialTax + (bracket2_P * BRACKET_2_TAX_P);
    provincialTax = provincialTax + (bracket3_P * BRACKET_3_TAX_P);
    provincialTax = provincialTax + (bracket4_P * BRACKET_4_TAX_P);
    provincialTax = provincialTax + (bracket5_P * BRACKET_5_TAX_P);

    System.out.println("Provincial Tax: $" + provincialTax);

    double totalTax = provincialTax + federalTax;
    System.out.println("Total Tax: $" + totalTax);

    double netIncome = income - federalTax - provincialTax;

    System.out.println("Net Income: $" + netIncome);

  }
}