package PaymentStrategy;

/**
 * Chiến lược thanh toán qua PayPal.
 *
 * <p>Triển khai cụ thể của {@link PaymentStrategy} cho phương thức
 * thanh toán qua dịch vụ PayPal. Lớp này xử lý logic xác thực tài khoản
 * và thực hiện giao dịch thông qua API của PayPal.</p>
 *
 * @author 4651050189_NguyenYenNhi
 * @version 1.0
 * @see PaymentStrategy
 * @see PaymentService
 */
public class PaypalPayment implements PaymentStrategy {

    /**
     * Thực hiện thanh toán qua PayPal với số tiền được chỉ định.
     *
     * @param amount số tiền cần thanh toán (đơn vị: VNĐ), phải là giá trị dương
     */
    @Override
    public void pay(double amount) {
        System.out.println(
            "Thanh toán bằng PayPal: " + amount
        );
    }
}
