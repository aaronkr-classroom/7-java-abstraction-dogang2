public class Baby implements Papa, Mama {
	
	//Papa 모든 함수 정의
	public void genderFather() {
		System.out.println("나는 아버지입니다.");
	}
	//Mama 모든 함수 정의
	public void genderMother() {
		System.out.println("나는 어머니입니다.");
	}
	
	public void printInfo() {
		System.out.println("나는 아기입니다.");
	}
}
