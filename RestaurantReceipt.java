	

	public class RestaurantReceipt {
		private MenuItem orderedItems;

		public RestaurantReceipt(){
			orderedItems = new MenuItem[12];
		}

		public void add(MenuItem item){
			int count = 0;
	        for(OrderItem o: orders.getOrderItems()) {
	            receipt[count] = menu.getMenuItem(o.getItemNumber()).toString();
	            count++;
	        }
	        return receipt;
	    }		
		

		public double getCost(){
		        for(OrderItem o: orders.getOrderItems()) {
		            total += menu.getMenuItem(o.getItemNumber()).getPrice();
		        }

		        total -= getDiscounts();

		        return total;
		    }
		
		public double display() {
			double totalCost
			totalCost = call trailer(t);
			
			System.out.println("Receipt");
			for(String s: systemInterface.display()) {
	            System.out.println(s);
		}

		public toString() {
			return String.format("/n", itemNumber, entree, getCost());
		} // can return a single string with /n chars
	}

