package PaymentStrategy;

public class Client {

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