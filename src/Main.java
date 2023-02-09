public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int originalBalance = 123;
        int replenishment = 1500;
        int sumBalance;
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (replenishment > 1000) {
            sumBalance = originalBalance + replenishment + replenishment / 100;
        } else {
            sumBalance = originalBalance + replenishment;
        }
        System.out.println("Итоговый баланс: " + sumBalance + " рублей");
    }
}
