package PaymentStrategy;

/**
 * Chiến lược thanh toán qua chuyển khoản ngân hàng.
 *
 * <p>Triển khai cụ thể của {@link PaymentStrategy} cho phương thức
 * thanh toán bằng chuyển khoản ngân hàng trực tiếp. Lớp này xử lý
 * logic xác minh tài khoản và thực hiện giao dịch chuyển khoản liên ngân hàng.</p>
 *
 * @author 4651050189_NguyenYenNhi
 * @version 1.0
 * @see PaymentStrategy
 * @see PaymentService
 */
public class BankTransferPayment implements PaymentStrategy {

    /**
     * Thực hiện thanh toán qua chuyển khoản ngân hàng với số tiền được chỉ định.
     *
     * @param amount số tiền cần thanh toán (đơn vị: VNĐ), phải là giá trị dương
     */
    @Override
    public void pay(double amount) {
        System.out.println(
            "Thanh toán bằng chuyển khoản ngân hàng: "
            + amount
        );
    }
}
