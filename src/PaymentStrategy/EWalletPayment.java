package PaymentStrategy;

/**
 * Chiến lược thanh toán qua ví điện tử.
 *
 * <p>Triển khai cụ thể của {@link PaymentStrategy} cho phương thức
 * thanh toán qua ví điện tử (e-wallet). Lớp này xử lý logic kết nối
 * và thực hiện giao dịch với các nền tảng ví điện tử phổ biến.</p>
 *
 * @author 4651050189_NguyenYenNhi
 * @version 1.0
 * @see PaymentStrategy
 * @see PaymentService
 */
public class EWalletPayment implements PaymentStrategy {

    /**
     * Thực hiện thanh toán qua ví điện tử với số tiền được chỉ định.
     *
     * @param amount số tiền cần thanh toán (đơn vị: VNĐ), phải là giá trị dương
     */
    @Override
    public void pay(double amount) {
        System.out.println(
            "Thanh toán bằng ví điện tử: " + amount
        );
    }
}
