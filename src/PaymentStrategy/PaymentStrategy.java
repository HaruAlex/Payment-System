package PaymentStrategy;

/**
 * Interface định nghĩa chiến lược thanh toán trong hệ thống.
 *
 * <p>Đây là thành phần cốt lõi của mẫu thiết kế Strategy, cho phép
 * các thuật toán thanh toán được hoán đổi linh hoạt mà không ảnh hưởng
 * đến các lớp sử dụng chúng.</p>
 *
 * <p>Các lớp triển khai interface này cần cung cấp logic xử lý
 * thanh toán cụ thể cho từng phương thức thanh toán.</p>
 *
 * @author 4651050189_NguyenYenNhi
 * @version 1.0
 * @see PaymentService
 */
public interface PaymentStrategy {

    /**
     * Thực hiện thanh toán với số tiền được chỉ định.
     *
     * @param amount số tiền cần thanh toán (đơn vị: VNĐ), phải là giá trị dương
     */
    void pay(double amount);
}
