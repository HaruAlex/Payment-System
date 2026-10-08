package PaymentStrategy;

/**
 * Lớp client minh họa cách sử dụng mẫu thiết kế Strategy trong hệ thống thanh toán.
 *
 * <p>Lớp này thể hiện khả năng thay đổi chiến lược thanh toán linh hoạt tại runtime
 * thông qua {@link PaymentService}. Người dùng có thể chuyển đổi giữa các phương thức
 * thanh toán như thẻ tín dụng, PayPal, ví điện tử và chuyển khoản ngân hàng
 * mà không cần thay đổi cấu trúc code.</p>
 *
 * @author 4651050189_NguyenYenNhi
 * @version 1.0
 * @see PaymentService
 * @see PaymentStrategy
 */
public class Client {

    /**
     * Điểm khởi đầu của chương trình, minh họa việc sử dụng các chiến lược thanh toán khác nhau.
     *
     * <p>Thực hiện lần lượt 4 giao dịch với 4 phương thức thanh toán:
     * thẻ tín dụng, PayPal, ví điện tử và chuyển khoản ngân hàng.</p>
     *
     * @param args tham số dòng lệnh (không sử dụng)
     */
    public static void main(String[] args) {

        // Thanh toán bằng thẻ tín dụng
        PaymentService service = new PaymentService(new CreditCardPayment());

        service.pay(1_000_000);

        // Chuyển sang PayPal
        service.setStrategy(new PaypalPayment());

        service.pay(2_000_000);

        // Chuyển sang ví điện tử
        service.setStrategy(new EWalletPayment());

        service.pay(500_000);

        // Chuyển sang chuyển khoản ngân hàng
        service.setStrategy(new BankTransferPayment());

        service.pay(3_000_000);
    }
}
