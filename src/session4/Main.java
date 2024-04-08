package session4;


public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng TaxManager
        TaxManager taxManager = new TaxManager();

        // Thêm các người nộp thuế vào danh sách
        taxManager.addTaxpayer(new Company());
        taxManager.addTaxpayer(new FreeLand());
        taxManager.addTaxpayer(new Employee());

        // Tính tổng số tiền thuế và in ra màn hình
        double totalTax = taxManager.getTax();
        System.out.println("Total tax collected: " + totalTax);
    }
}

