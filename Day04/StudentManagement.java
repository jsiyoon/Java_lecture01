package Day04;

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];
		
		int count = 0;//사람 수
		int index = -1; //위치 값
		
		wh:while(true) {
			System.out.println("[정보]사람 수:" + count + ", 현재위치:" + index);
			System.out.println("[메뉴]1.insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.exit");
			System.out.print("메뉴 입력>");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				//이름 ,성별(f/m),나이 입력받아 각 배열에 저장
				//사람 수 증가
				index++;
				count++;
				System.out.println("고객 정보를 입력해 주세요.");
				System.out.print("이름>");
				String name = scan.next();
				nameList[index] = name;
				
				System.out.print("성별(f/m)>");
				String gender = scan.next();
				genderList[index] = gender;
	
				System.out.print("나이>");
				int age = scan.nextInt();
				ageList[index] = age;
				System.out.println();
				break;
			case 2:
				//ex)index는 0이하로 내려갈 수 없기 때문에, 0이하면 "정보가 없습니다"
				//그렇지 않으면 인덱스 조정해 이전정보 출력해서 보여주면 됨.
				if(index >=0 && index < count) {
					System.out.printf("이름: %s, 성별: %s, 나이: %d\n", nameList[index-1], genderList[index-1], ageList[index-1]);
				}
				else {
					System.out.println("이전 고객정보가 없습니다.");
				}
				System.out.println();
				break;
			case 3:
				//다음 고객정보 없는 조건 생각해 출력(index와 count연관)
				if(index < count-1 && index >= -1) {
					System.out.printf("%d번째 고객입니다.\n", index+2);
					System.out.printf("이름: %s, 성별: %s, 나이: %d\n", nameList[index+1], genderList[index+1], ageList[index+1]);
				}
				else {
					System.out.println("다음 고객 정보가 없습니다.");
				}
				System.out.println();
				break;
			case 4:
				//현재 고객정보가 없는(출력할 수 없는) 조건 생각해 출력
				//ex)사람 수 5명인데 index 5나타나면 출력 불가
				if(index < count && index >= 0) {
					System.out.printf("%d번째 고객입니다.\n", index+1);
					System.out.printf("이름: %s, 성별: %s, 나이: %d\n", nameList[index], genderList[index], ageList[index]);
				}
				else {
					System.out.println("현재 위치의 고객 정보가 없습니다.");
				}
				System.out.println();
				break;
			case 5:
				//4번과 조건 동일
				//Scanner통해 순서대로 이름, 성별, 나이 입력받아 현재위치 값 수정
				System.out.print("바꾸고 싶은 위치를 선택해 주세요>");
				int num1 = scan.nextInt();
				if(num1 <= index && num1 > 0) {
					for(int i = count+1; i >= num1-1; i--) {
						nameList[i+1] = nameList[i];
						genderList[i+1] = genderList[i];
						ageList[i+1] = ageList[i];
						}
						System.out.print("이름>");
						String chname = scan.next();
						System.out.print("성별>");
						String chgender = scan.next();
						System.out.print("나이>");
						int chage = scan.nextInt();
						nameList[num1-1] = chname;
						genderList[num1-1] = chgender;
						ageList[num1-1] = chage;
						index++;
						count++;
				}
				else {
					System.out.println("존재하지 않는 위치입니다.");
				}
				System.out.println();
				break;
			case 6:
				//4번과 조건 동일
				//현재 위치~사람 수까지 배열 요소 당겨서 덮어 씌워줌
				//삭제할 데이터 없으면 "없습니다"출력
				System.out.print("몇번째 고객을 삭제하시겠습니까>");
				int num2 = scan.nextInt();
				if(num2 <= index && num2 > 0) {
					for(int j = num2-1; j < count; j++) {
						nameList[j] = nameList[j+1];
						genderList[j] = genderList[j+1];
						ageList[j] = ageList[j+1];
					}
					count--;
					index--;
				}
				else {
					System.out.println("존재하지 않는 고객입니다.");
				}
				System.out.println();
				break;
			case 7:
				//루프 탈출
				System.out.println("입력을 종료합니다.");
				break wh;
			default:
				//잘못 입력된 경우
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요.\n");
				break;
			}
		}
	scan.close();	
	}
}
//if(index < 0) {
//	System.out.println("정보가 없습니다.");
//}
//else {
//	for(int i = 0; i <= index; i++) {
//		System.out.printf("%d. 이름: %s, 성별: %s, 나이: %d\n", i+1, nameList[i], genderList[i], ageList[i]);
//	}
//}
//System.out.println();
