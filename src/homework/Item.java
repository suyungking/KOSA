package homework;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

	private final String name;
	private final int price;
	private int quantity;

}
