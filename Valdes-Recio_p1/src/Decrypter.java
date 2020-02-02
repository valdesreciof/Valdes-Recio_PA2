/*
 * split input by digit
 * reverse modulo 
 * reorder the digits
 */
public class Decrypter {
	
	public int decrypt(int input) {
		
		int fourthDigit = (input/1000)%10;
		int thirdDigit = (input/100)%10;
		int secondDigit = (input/10)%10;
		int firstDigit = input%10;
		
		int newFirst;
		int newSecond;
		int newThird;
		int newFourth;
		
		if(firstDigit>=7) {
			newFirst=firstDigit-7;
		}
		else {
			newFirst=firstDigit+3;
		}
		if(secondDigit>=7) {
			newSecond=secondDigit-7;
		}
		else {
			newSecond=secondDigit+3;
		}
		if(thirdDigit>=7) {
			newThird=thirdDigit-7;
		}
		else {
			newThird=thirdDigit+3;
		}
		if(fourthDigit>=7) {
			newFourth=fourthDigit-7;
		}
		else {
			newFourth=fourthDigit+3;
		}
		
		return (newSecond*1000)+(newFirst*100)+(newFourth*10)+newThird;
		
	}
}
