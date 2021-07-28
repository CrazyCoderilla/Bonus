public class Main {
  public static void main(String[] args) {
    int balance = 100;
    int amount = Integer.parseInt(args[0]);
    int bonus = 0;
    
    if(amount>1000){
        bonus = amount/100;
    }
    
    balance += amount + bonus; 
    
    System.out.println("Пополнение: " + amount + "\nБонус: " + bonus + "\nБаланс: " + balance);
  
    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта, 
    // суммы пополнения и тп
    
    // Условным оператором проверяете превысила ли
    // сумма пополнения порог и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.
  }
}
