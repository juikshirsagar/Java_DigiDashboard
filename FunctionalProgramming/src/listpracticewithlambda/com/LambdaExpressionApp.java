package listpracticewithlambda.com;

import java.util.List;

public class LambdaExpressionApp {

	public static void main(String[] args) {
		List<Integer> inputNumbers = List.of(1,2,3,4,5);
		
		OperationService service= new OperationService();
		Operation operation= number -> number * number ;
		List<Integer> outputNumbers= service.executeoperation(inputNumbers, operation);
		System.out.println(outputNumbers);
	}

}
