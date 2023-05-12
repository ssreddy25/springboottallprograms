package collectionsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListLaptop {

	public static void main(String[] args) {

		List<LaptopComparator> laptop = new ArrayList();
		laptop.add(new LaptopComparator("dell", 123, 55000));

		laptop.add(new LaptopComparator("dell", 123, 55000));
		laptop.add(new LaptopComparator("hp", 122, 59000));
		laptop.add(new LaptopComparator("lenvo", 126, 65000));

		laptop.add(new LaptopComparator("dell", 129, 75000));

		Comparator<LaptopComparator> com = new Comparator<LaptopComparator>() {

			@Override
			public int compare(LaptopComparator l1, LaptopComparator l2) {
				if (l1.getPrice() > l2.getPrice()) {
					return 1;
				} else {
					return -1;
				}
			}

		};

		Comparator<LaptopComparator> com1 = new Comparator<LaptopComparator>() {

			@Override
			public int compare(LaptopComparator l1, LaptopComparator l2) {

				return l1.getLaptopName().compareTo(l2.getLaptopName());
			}

		};
           System.out.println("price based sorting ");
		Collections.sort(laptop, com);

		for (LaptopComparator lap : laptop) {
			System.out.println(lap);
		}
         System.out.println("name based sorting ");
		Collections.sort(laptop, com1);

		for (LaptopComparator lap : laptop) {
			System.out.println(lap);
		}

	}

}
