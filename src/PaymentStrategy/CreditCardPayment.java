package PaymentStrategy;

/**
 * Chiến lược thanh toán bằng thẻ tín dụng.
 *
 * <p>Triển khai cụ thể của {@link PaymentStrategy} cho phương thức
 * thanh toán qua thẻ tín dụng. Lớp này xử lý logic kết nối và
 * giao dịch với cổng thanh toán thẻ tín dụng.</p>
 *
 * @author 4651050189_NguyenYenNhi
 * @version 1.0
 * @see PaymentStrategy
 * @see PaymentService
 */
public class CreditCardPayment implements PaymentStrategy {

    /**
     * Thực hiện thanh toán bằng thẻ tín dụng với số tiền được chỉ định.
     *
     * @param amount số tiền cần thanh toán (đơn vị: VNĐ), phải là giá trị dương
     */
    @Override
    public void pay(double amount) {
        System.out.println(
            "Thanh toán bằng thẻ tín dụng: " + amount
        );
    }
}
