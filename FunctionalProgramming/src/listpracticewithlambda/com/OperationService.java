package listpracticewithlambda.com;

import java.util.ArrayList;
import java.util.List;

public class OperationService {

	public List<Integer> executeoperation(List<Integer> inputNumbers, Operation operation){
		List<Integer> outputNumbers = new ArrayList<>();
        for (int number : inputNumbers) {
            outputNumbers.add(operation.operate(number));
            }
        
		return outputNumbers;
		
	}
}
