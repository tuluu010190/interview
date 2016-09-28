package interview;

import java.util.List;

public class numberListHelper {

	public static double sum(List<Double> items){
		double sum = 0d;
		for (int i = 0; i < items.size(); i ++){
			sum += items.get(i);
		}
	return sum;
	}
	
	public static double max(List<Double> items){
		if(items.isEmpty()){
			throw new IllegalArgumentException("Can not compute maximum of empty list");
		}
		//double max = -9999999.999999;
		double max = -9999999.999999;
		for (int i = 0; i < items.size(); i++){
			if(items.get(i) > max){
				max = items.get(i);
			}
		}
		return max;
	}

}
