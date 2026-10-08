package PaymentStrategy;

/**
 * Lớp ngữ cảnh (Context) trong mẫu thiết kế Strategy.
 *
 * <p>{@code PaymentService} duy trì một tham chiếu đến đối tượng {@link PaymentStrategy}
 * và ủy quyền việc thực hiện thanh toán cho chiến lược đang được cấu hình.
 * Lớp client có thể thay đổi chiến lược thanh toán tại runtime mà không cần
 * sửa đổi lớp này.</p>
 *
 * <p>Ví dụ sử dụng:</p>
 * <pre>{@code
 * PaymentService service = new PaymentService(new CreditCardPayment());
 * service.pay(1_000_000);
 *
 * service.setStrategy(new PaypalPayment());
 * service.pay(2_000_000);
 * }</pre>
 *
 * @author 4651050189_NguyenYenNhi
 * @version 1.0
 * @see PaymentStrategy
 */
public class PaymentService {

    /**
     * Chiến lược thanh toán hiện tại được sử dụng bởi service.
     */
    private PaymentStrategy strategy;

    /**
     * Khởi tạo {@code PaymentService} với chiến lược thanh toán ban đầu.
     *
     * @param strategy chiến lược thanh toán được sử dụng, không được {@code null}
     */
    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Thay đổi chiến lược thanh toán tại runtime.
     *
     * <p>Cho phép chuyển đổi linh hoạt giữa các phương thức thanh toán
     * mà không cần tạo lại đối tượng {@code PaymentService}.</p>
     *
     * @param strategy chiến lược thanh toán mới, không được {@code null}
     */
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Thực hiện thanh toán bằng cách ủy quyền cho chiến lược hiện tại.
     *
     * @param amount số tiền cần thanh toán (đơn vị: VNĐ), phải là giá trị dương
     */
    public void pay(double amount) {
        strategy.pay(amount);
    }
}
