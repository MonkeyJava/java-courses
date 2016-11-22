/**
Класс реализует калькулятор.
*/
public class Calculator {
	/**
	Результат вычисления.
	*/
	private int result;
	/**
	Суммируем аргументы.
	@param params Аргументы суммирования.
	*/
	public void add(int first, int second){
		
			this.result = first + second;
	}
	/**Вычитаем аргументы.
	@param params Аргументы вычитания.
	*/
	public void subtract(int first, int second){
			
			this.result = first - second;
	}
	/**Умножаем аргументы.
	@param params Аргументы умножения.
	*/
	public void multiplication (int first, int second){
		
			this.result = first * second;
	}
	/**Делим аргументы.
	@param params Аргументы деления.
	*/
	public void division(int first, int second){

			this.result = first / second;
		
	}
	/**
	Получить результат.
	@return результат вычисления.
	*/
	public int getResult(){
		return this.result;
	}
	/**
	Очистить результат вычисления.
	*/
	public void cleanResult(){
		this.result = 0;
	}
}