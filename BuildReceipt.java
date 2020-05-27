
public class BuildReceipt (RestaurantREceipt t) {
	
	if (!haveCoupon) {
		return RestaurantReceipt;
	else 
			return new CouponReceiptDecorator(t);
	}
	
}
