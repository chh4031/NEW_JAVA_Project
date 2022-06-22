package homework;

import java.util.Scanner;

public class CHH_20191598_2 {
	public static void main(String[] args) {
		
		CHH_20191598_2 game_function = new CHH_20191598_2();//메서드를 호출하기 위해 사용.
		Scanner sc = new Scanner(System.in);
		
		do {//전체 반복문.
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.print("게임 모드를 선택해 주세요.\n1번은 3인 가위바위보 게임, 2번은 가위바위보 하나빼기 게임, 1과 2를 제외한 숫자는 종료 입니다.\n입력 : ");
			int select_game = sc.nextInt();
			
			if(select_game == 1) {//3인 가위바위보 게임을 선택
			
				while(true) {// 3인 가위바위보 게임 시작
					System.out.println("----------------------------------------------------------------------------------------------------");
					System.out.println("3인 가위바위보 게임을 시작합니다. <사용자 vs 컴퓨터_1 vs 컴퓨터_2>");
					System.out.print("가위는 1, 바위는 2, 보는 3 입니다. 게임중단은 4 입니다. \n입력 : ");
					int user_value = sc.nextInt();//유저 입력값 
					
					int[] com_select = new int[2];// 3명에서 가위바위 보를 하므로 유저를 제외한 컴퓨터는 총 2대이다. 그러므로 이는 배열로 만들어 값을 각각 저장해 보기로 하였다.
					
					for(int i = 0; i<com_select.length;i++) {
						com_select[i] = (int) (Math.random()* 3) + 1;// 컴퓨터[0] 컴퓨터[1]의 배열값을 주어 두대의 컴퓨터에 랜덤값을 지정함.
					}
					
					//System.out.println("user 입력값 : " + user_value + " com_1 입력값 : " + com_select[0] + " com_2 입력값 : " + com_select[1]);//사용자 입력값과 컴퓨터 2대가 설정된 랜덤 숫자값을 확인
					
					if((user_value == 1)&&(com_select[0])==1) {
						if(com_select[1]==1) {
							System.out.println("사용자 입력값 : <가위>, 컴퓨터_1 입력값 : <가위>, 컴퓨터_2 입력값 : <가위>");
							System.out.println("모두 무승부입니다.");
						}
						else if(com_select[1]==2) {
							System.out.println("사용자 입력값 : <가위>, 컴퓨터_1 입력값 : <가위>, 컴퓨터_2 입력값 : <바위>");
							System.out.println("컴퓨터_2가 승리하였습니다.");
						}
						else {
							System.out.println("사용자 입력값 : <가위>, 컴퓨터_1 입력값 : <가위>, 컴퓨터_2 입력값 : <보>");
							System.out.println("사용자와 컴퓨터_1이 승리하였습니다.");
						}
					}
					else if((user_value == 1)&&(com_select[0])==2) {
						if(com_select[1]==1) {
							System.out.println("사용자 입력값 : <가위>, 컴퓨터_1 입력값 : <바위>, 컴퓨터_2 입력값 : <가위>"); 
							System.out.println("컴퓨터_1이 승리하였습니다.");
						}
						else if(com_select[1]==2) {
							System.out.println("사용자 입력값 : <가위>, 컴퓨터_1 입력값 : <바위>, 컴퓨터_2 입력값 : <바위>");
							System.out.println("컴퓨터_1과 컴퓨터_2가 승리하였습니다.");
						}
						else {
							System.out.println("사용자 입력값 : <가위>, 컴퓨터_1 입력값 : <바위>, 컴퓨터_2 입력값 : <보>");
							System.out.println("모두 무승부입니다.");
						}
					}
					else if((user_value == 1)&&(com_select[0])==3) {
						if(com_select[1]==1) {
							System.out.println("사용자 입력값 : <가위>, 컴퓨터_1 입력값 : <보>, 컴퓨터_2 입력값 : <가위>");
							System.out.println("사용자와 컴퓨터_2가 승리하였습니다.");
						}
						else if(com_select[1]==2) {
							System.out.println("사용자 입력값 : <가위>, 컴퓨터_1 입력값 : <보>, 컴퓨터_2 입력값 : <바위>");
							System.out.println("모두 무승부입니다.");
						}
						else {
							System.out.println("사용자 입력값 : <가위>, 컴퓨터_1 입력값 : <보>, 컴퓨터_2 입력값 : <보>");
							System.out.println("사용자가 승리하였습니다.");
						}
					}
					
					else if((user_value == 2)&&(com_select[0])==1) {
						if(com_select[1]==1) {
							System.out.println("사용자 입력값 : <바위>, 컴퓨터_1 입력값 : <가위>, 컴퓨터_2 입력값 : <가위>");
							System.out.println("사용자가 승리하였습ㄴ다.");
						}
						else if(com_select[1]==2) {
							System.out.println("사용자 입력값 : <바위>, 컴퓨터_1 입력값 : <가위>, 컴퓨터_2 입력값 : <바위>");
							System.out.println("사용자와 컴퓨터_2가 승리하였습니다.");
						}
						else {
							System.out.println("사용자 입력값 : <바위>, 컴퓨터_1 입력값 : <가위>, 컴퓨터_2 입력값 : <보>");
							System.out.println("모두 무승부입니다.");
						}
					}
					else if((user_value == 2)&&(com_select[0])==2) {
						if(com_select[1]==1) {
							System.out.println("사용자 입력값 : <바위>, 컴퓨터_1 입력값 : <바위>, 컴퓨터_2 입력값 : <가위>");
							System.out.println("사용자와 컴퓨터_1이 승리하였습니다.");
						}
						else if(com_select[1]==2) {
							System.out.println("사용자 입력값 : <바위>, 컴퓨터_1 입력값 : <바위>, 컴퓨터_2 입력값 : <바위>");
							System.out.println("모두 무승부입니다.");
						}
						else {
							System.out.println("사용자 입력값 : <바위>, 컴퓨터_1 입력값 : <바위>, 컴퓨터_2 입력값 : <보>");
							System.out.println("컴퓨터_2가 승리하였습니다.");
						}
					}
					else if((user_value == 2)&&(com_select[0])==3) {
						if(com_select[1]==1) {
							System.out.println("사용자 입력값 : <바위>, 컴퓨터_1 입력값 : <보>, 컴퓨터_2 입력값 : <가위>");
							System.out.println("모두 무승부입니다.");
						}
						else if(com_select[1]==2) {
							System.out.println("사용자 입력값 : <바위>, 컴퓨터_1 입력값 : <보>, 컴퓨터_2 입력값 : <바위>");
							System.out.println("컴퓨터_1이 승리하였습니다.");
						}
						else {
							System.out.println("사용자 입력값 : <바위>, 컴퓨터_1 입력값 : <보>, 컴퓨터_2 입력값 : <보>");
							System.out.println("컴퓨터_1과 컴퓨터_2가 승리하였습니다.");
						}
					}
					
					else if((user_value == 3)&&(com_select[0])==1) {
						if(com_select[1]==1) {
							System.out.println("사용자 입력값 : <보>, 컴퓨터_1 입력값 : <가위>, 컴퓨터_2 입력값 : <가위>");
							System.out.println("사용자가 승리하였습니다.");
						}
						else if(com_select[1]==2) {
							System.out.println("사용자 입력값 : <보>, 컴퓨터_1 입력값 : <가위>, 컴퓨터_2 입력값 : <바위>");
							System.out.println("모두 무승부입니다.");
						}
						else {
							System.out.println("사용자 입력값 : <보>, 컴퓨터_1 입력값 : <가위>, 컴퓨터_2 입력값 : <보>");
							System.out.println("컴퓨터_1이 승리하였습니다.");
						}
					}
					else if((user_value == 3)&&(com_select[0])==2) {
						if(com_select[1]==1) {
							System.out.println("사용자 입력값 : <보>, 컴퓨터_1 입력값 : <바위>, 컴퓨터_2 입력값 : <가위>");
							System.out.println("모두 무승부입니다.");
						}
						else if(com_select[1]==2) {
							System.out.println("사용자 입력값 : <보>, 컴퓨터_1 입력값 : <바위>, 컴퓨터_2 입력값 : <바위>");
							System.out.println("사용자가 승리하였습니다.");
						}
						else {
							System.out.println("사용자 입력값 : <보>, 컴퓨터_1 입력값 : <바위>, 컴퓨터_2 입력값 : <보>");
							System.out.println("사용자와 컴퓨터_2가 승리하였습니다.");
						}
					}
					else if((user_value == 3)&&(com_select[0])==3) {
						if(com_select[1]==1) {
							System.out.println("사용자 입력값 : <보>, 컴퓨터_1 입력값 : <보>, 컴퓨터_2 입력값 : <가위>");
							System.out.println("컴퓨터_2가 승리하였습니다.");
						}
						else if(com_select[1]==2) {
							System.out.println("사용자 입력값 : <보>, 컴퓨터_1 입력값 : <보>, 컴퓨터_2 입력값 : <바위>");
							System.out.println("사용자와 컴퓨터_1이 승리하였습니다.");
						}
						else {
							System.out.println("사용자 입력값 : <보>, 컴퓨터_1 입력값 : <보>, 컴퓨터_2 입력값 : <보>");
							System.out.println("모두 무승부입니다.");
						}
					}
					
					else if(user_value == 4) {
						System.out.println("게임을 종료합니다.");
						break;
					}
					
					else {
						System.out.println("잘못된 값입니다.");
					}
				}//3인 가위바위보 게임의 종료
			}//3인가위바위보 게임의 if문
			
			
			else if(select_game == 2) {//가위바위보 하나빼기 게임 선택
			
				while(true) {//가위바위보 하나빼기 게임의 시작
					System.out.println("----------------------------------------------------------------------------------------------------");
					System.out.println("가위바위보 하나빼기 게임을 시작합니다.\n가위는 1, 바위는 2, 보는 3 입니다. 게임중단은 1,2,3를 제외한 숫자 입니다.");
					
					System.out.print("첫번째로 낼 값 입력 : ");
					int user_value_1 = sc.nextInt();
					System.out.print("두번째로 낼 값 입력 : ");
					int user_value_2 = sc.nextInt();// String에서는 enter까지 문자로 인식해 오류가 나지만 INT형이기에 enter값은 받지 않아 오류가 발생하지 않는다.
					
					if((user_value_1 > 3)||(user_value_2 > 3)||(user_value_1 < 1)||(user_value_2 < 1)) {
						System.out.println("입력된 값이 잘못되었습니다.\n자동으로 게임을 종료하고 초기화면으로 되돌아갑니다.");
						break;
					}
					
					game_function.Print_game(user_value_1, user_value_2);//사용자가 무슨값을 선택했는지 알려주는 메서드를 사용함.
					
					System.out.println("사용자 입력값 " + user_value_1 +" "+ user_value_2);
					
					int com_value_1 = (int) (Math.random()* 3) + 1;
					int com_value_2 = (int) (Math.random()* 3) + 1;
					
					game_function.Print_game(com_value_1, com_value_2);//컴퓨터가 무슨값을 선택했는지 알려주는 메서드를 사용함. 가위바위보 하나 빼기 게임은 애초 두사람이 멀 냈는지 알 수 있음.
					
					System.out.println("컴퓨터 입력값 " + com_value_1 +" "+ com_value_2);
					
					System.out.print("사용자가 낼 값을 입력해 주세요. 입력 : ");
					
					int user_value_select = sc.nextInt();//사용자가 첫번째랑 두번째중 무엇을 낼지 결정.
					int com_value_select = (int) (Math.random()* 2) + 1;//컴퓨터가 첫번째랑 두번째중 무엇을 낼지 결정. 단 랜덤이라는 점이 지능적이지 못해 이길게임도 비기거나 질 수 있다.(랜덤이기에)
					
					
					if((user_value_select == 1)&&(com_value_select == 1)) {//사용자와 컴퓨터가 둘다 첫번째 값을 정할경우
						//System.out.println("당신이 선택한 값은 <" + user_value_1 + "> 이고, 컴퓨터는 <" + com_value_1 + ">을 선택했습니다." );//무엇을 선택했는지 제대로 나오는지 확인할 용도로만 사용.
						
						game_function.game_logic(user_value_1, com_value_1);//메서드로 가위바위보를 처리하기.
						
					}//컴퓨터와 사용자가 둘다 첫번째를 정한 경우의 if문 종료
					
					
					
					else if((user_value_select == 1)&&(com_value_select == 2)) {//사용자는 첫번째 컴퓨터는 두번째를 선택
						//System.out.println("당신이 선택한 값은 <" + user_value_1 + "> 이고, 컴퓨터는 <" + com_value_2 + ">을 선택했습니다." );
						
						game_function.game_logic(user_value_1, com_value_2);
						
					}
					
					
					else if((user_value_select == 2)&&(com_value_select == 1)) {//사용자는 두번째 컴퓨터는 첫번째를 선택
						//System.out.println("당신이 선택한 값은 <" + user_value_2 + "> 이고, 컴퓨터는 <" + com_value_1 + ">을 선택했습니다." );
						
						game_function.game_logic(user_value_2, com_value_1);
						
					}
					else{//사용자와 컴퓨터가 둘다 두번째 값을 정할경우
						//System.out.println("당신이 선택한 값은 <" + user_value_2 + "> 이고, 컴퓨터는 <" + com_value_2 + ">을 선택했습니다." );
						
						game_function.game_logic(user_value_2, com_value_2);
						
					}
					
					
				}//가위바위보 하나빼기 게임의 종료
			}//가위바위보 하나빼기 게임의 if문
			
			else {
				System.out.println("----------------------------------------------------------------------------------------------------");
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}while(true);//전체 게임 반복의 끝부분.
	}//메인 부분

	
	
	
	
	public void game_logic(int select_1, int select_2) {
		switch(select_1) {//switch문 시작. 기분은 유저의 첫번째 값.
		
		case 1://사용자가 입력한 값중 첫번째 값이 1(가위)일 경우. 이거는 1고정임.
			if(select_1 == select_2) {//사용자값 1, 컴퓨터값 1일때 두개가 같으므로 ==을 썻고, 이는 비기는 경우다.
				System.out.println("사용자 입력값 : <가위>, 컴퓨터 입력값 : <가위>");
				System.out.println("사용자와 컴퓨터는 무승부입니다.");
				break;
			}
			else if((select_1 + select_2) == 3) {//사용자는 1(가위), 컴퓨터는 2(바위)일 때 두개 더하면 3이다. 이때 3은 컴퓨터가 이기는 것.
				System.out.println("사용자 입력값 : <가위>, 컴퓨터 입력값 : <바위>");
				System.out.println("사용자가 패배하였습니다.");
				break;
			}
			else if((select_1 + select_2) == 4) {//사용자는 1(가위), 컴퓨터는 3(보)일 때 두개 더하면 4이다. 이때 4은 사용자가 이기는 것.
				System.out.println("사용자 입력값 : <가위>, 컴퓨터 입력값 : <보>");
				System.out.println("사용자가 승리하였습니다.");
				break;
			}
			else {
				break;//이 경우는 없음.
			}
			
		case 2://사용자가 입력한 값중 첫번째 값이 2(바위)일 경우. 이거는 2고정임. 아래 코드는 위와 같은 원리로 작동됨.
			if(select_1 == select_2) {// 2 2
				System.out.println("사용자 입력값 : <바위>, 컴퓨터 입력값 : <바위>");
				System.out.println("사용자와 컴퓨터는 무승부입니다.");
				break;
			}
			else if((select_1 + select_2) == 3) {// 2 1
				System.out.println("사용자 입력값 : <바위>, 컴퓨터 입력값 : <가위>");
				System.out.println("사용자가 승리하였습니다.");
				break;
			}
			else if((select_1 + select_2) == 5) {// 2 3
				System.out.println("사용자 입력값 : <바위>, 컴퓨터 입력값 : <보>");
				System.out.println("사용자가 패배하였습니다.");
				break;
			}
			else {
				break;//이 경우는 없음.
			}
			
		case 3://사용자가 입력한 값중 첫번째 값이 3(보)일 경우. 이거는 3고정임. 아래 코드는 위와 같은 원리로 작동됨.
			if(select_1 == select_2) {// 3 3
				System.out.println("사용자 입력값 : <보>, 컴퓨터 입력값 : <보>");
				System.out.println("사용자와 컴퓨터는 무승부입니다.");
				break;
			}
			else if((select_1 + select_2) == 4) {// 3 1
				System.out.println("사용자 입력값 : <보>, 컴퓨터 입력값 : <가위>");
				System.out.println("사용자가 패배하였습니다.");
				break;
			}
			else if((select_1 + select_2) == 5) {// 3 2
				System.out.println("사용자 입력값 : <보>, 컴퓨터 입력값 : <바위>");
				System.out.println("사용자가 승리하였습니다.");
				break;
			}
			else {
				break;//이 경우는 없음.
			}
		default:
			//이경우도 없음. 만약 다른수가 나오면 먼저 실행되는 선행 실행문에서 못하도록 할 예정.
			break;
			
		}//switch문의 종료
	}//game_logic 메서드의 종료.
	
	
	
	
	public void Print_game(int select_3, int select_4) {
		if(select_3 == 1) {
			if(select_4 == 1) {
				System.out.println("사용자는 1. <가위> 2. <가위>를 선택했습니다.");
			}
			else if(select_4 == 2) {
				System.out.println("사용자는 1. <가위> 2. <바위>를 선택했습니다.");
			}
			else if(select_4 == 3) {
				System.out.println("사용자는 1. <가위> 2. <보>를 선택했습니다.");
			}
		}
		
		else if(select_3 == 2) {
			if(select_4 == 1) {
				System.out.println("사용자는 1. <바위> 2. <가위>를 선택했습니다.");
			}
			else if(select_4 == 2) {
				System.out.println("사용자는 1. <바위> 2. <바위>를 선택했습니다.");
			}
			else if(select_4 == 3) {
				System.out.println("사용자는 1. <바위> 2. <보>를 선택했습니다.");
			}
		}
		
		else if(select_3 == 3) {
			if(select_4 == 1) {
				System.out.println("사용자는 1. <보> 2. <가위>를 선택했습니다.");
			}
			else if(select_4 == 2) {
				System.out.println("사용자는 1. <보> 2. <바위>를 선택했습니다.");
			}
			else if(select_4 == 3) {
				System.out.println("사용자는 1. <보> 2. <보>를 선택했습니다.");
			}
		}
	}//Print_game 메서드의 종료
	
}//class의 종료





/*
 * 1 : 가위 2: 바위 3: 보
 * 
 * 사용변수 목록 및 설명
 * 
 * sc(전역) = 스캐너 변수
 * 
 * select_game(지역) = 사용자가 선택할 게임모드를 정의
 * 
 * user_value(지역) = 사용자 입력값
 * 
 * user_value_1(지역) = 가위바위보 하나 빼기에서의 사용자의 선택값 1
 * user_value_2(지역) = 가위바위보 하나 빼기에서의 사용자의 선택값 2
 * com_value_1(지역) = 가위바위보 하나 빼기에서의 컴퓨터의 랜덤값 1
 * com_value_2(지역) = 가위바위보 하나 빼기에서의 컴퓨터의 랜덤값 2
 * user_value_select(지역) = 사용자가 입력한 두개의 가위바위보 값중 하나를 선택
 * com_value_select(지역) = 컴퓨터가 정한 랜덤한 두개의 가위바위보 값중 하나를 선택
 * 
 * com_select[](객체 배열) = 컴퓨터가 선택한 랜덤값(배열) [0] = com_1 [1] = com_2
 * 
 * select_1, select_2, select_3, select_4 = 메서드에서 사용할 인자(?) 들. 일부러 혼란 방지를 위해 1 2 3 4로 구분함.
 * 
 * 메서드 목록(반복되는 부분에 한해 사용함.)
 * 
 * 1. game_logic(select_1, select_2)
 * 게임의 승패를 결정하는 메소드로 select_1에는 사용자값, select_2에는 컴퓨터값이 들어간다.
 * 
 * 2. Print_game(select_3, select_4)
 * 사용자나 컴퓨터가 선택한 가위바위보에 대해 한글로 가위바위보 라고 출력해 준다. ex)입력값이 1 1 일때 출력은 <가위> <가위>
 * 
 * 기타
 * 가위바위보 하나빼기 게임에서의 컴퓨터가 첫번째와 두번째의 값이 사용자보다 유리한 상황에 있어도 랜덤값으로 둘중 하나를 선택하기에 승리의 결과가 달라질 수 있다.
 * (AI를 융합하면 컴퓨터의 선택이 유리하게 진행되므로 더 난이도가 높은 게임이 되지 않을까 싶음.)
 */