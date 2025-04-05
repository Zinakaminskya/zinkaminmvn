public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int count = service.calculate(10000, 3000, 20000);
        System.out.println(count);
    }
}
