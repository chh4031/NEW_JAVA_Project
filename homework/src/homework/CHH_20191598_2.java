package homework;

import java.util.Scanner;

public class CHH_20191598_2 {
	public static void main(String[] args) {
		
		CHH_20191598_2 game_function = new CHH_20191598_2();//�޼��带 ȣ���ϱ� ���� ���.
		Scanner sc = new Scanner(System.in);
		
		do {//��ü �ݺ���.
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.print("���� ��带 ������ �ּ���.\n1���� 3�� ���������� ����, 2���� ���������� �ϳ����� ����, 1�� 2�� ������ ���ڴ� ���� �Դϴ�.\n�Է� : ");
			int select_game = sc.nextInt();
			
			if(select_game == 1) {//3�� ���������� ������ ����
			
				while(true) {// 3�� ���������� ���� ����
					System.out.println("----------------------------------------------------------------------------------------------------");
					System.out.println("3�� ���������� ������ �����մϴ�. <����� vs ��ǻ��_1 vs ��ǻ��_2>");
					System.out.print("������ 1, ������ 2, ���� 3 �Դϴ�. �����ߴ��� 4 �Դϴ�. \n�Է� : ");
					int user_value = sc.nextInt();//���� �Է°� 
					
					int[] com_select = new int[2];// 3���� �������� ���� �ϹǷ� ������ ������ ��ǻ�ʹ� �� 2���̴�. �׷��Ƿ� �̴� �迭�� ����� ���� ���� ������ ����� �Ͽ���.
					
					for(int i = 0; i<com_select.length;i++) {
						com_select[i] = (int) (Math.random()* 3) + 1;// ��ǻ��[0] ��ǻ��[1]�� �迭���� �־� �δ��� ��ǻ�Ϳ� �������� ������.
					}
					
					//System.out.println("user �Է°� : " + user_value + " com_1 �Է°� : " + com_select[0] + " com_2 �Է°� : " + com_select[1]);//����� �Է°��� ��ǻ�� 2�밡 ������ ���� ���ڰ��� Ȯ��
					
					if((user_value == 1)&&(com_select[0])==1) {
						if(com_select[1]==1) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��� ���º��Դϴ�.");
						}
						else if(com_select[1]==2) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��ǻ��_2�� �¸��Ͽ����ϴ�.");
						}
						else {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <��>");
							System.out.println("����ڿ� ��ǻ��_1�� �¸��Ͽ����ϴ�.");
						}
					}
					else if((user_value == 1)&&(com_select[0])==2) {
						if(com_select[1]==1) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>"); 
							System.out.println("��ǻ��_1�� �¸��Ͽ����ϴ�.");
						}
						else if(com_select[1]==2) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��ǻ��_1�� ��ǻ��_2�� �¸��Ͽ����ϴ�.");
						}
						else {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <��>");
							System.out.println("��� ���º��Դϴ�.");
						}
					}
					else if((user_value == 1)&&(com_select[0])==3) {
						if(com_select[1]==1) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <��>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("����ڿ� ��ǻ��_2�� �¸��Ͽ����ϴ�.");
						}
						else if(com_select[1]==2) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <��>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��� ���º��Դϴ�.");
						}
						else {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <��>, ��ǻ��_2 �Է°� : <��>");
							System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
						}
					}
					
					else if((user_value == 2)&&(com_select[0])==1) {
						if(com_select[1]==1) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("����ڰ� �¸��Ͽ�������.");
						}
						else if(com_select[1]==2) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("����ڿ� ��ǻ��_2�� �¸��Ͽ����ϴ�.");
						}
						else {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <��>");
							System.out.println("��� ���º��Դϴ�.");
						}
					}
					else if((user_value == 2)&&(com_select[0])==2) {
						if(com_select[1]==1) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("����ڿ� ��ǻ��_1�� �¸��Ͽ����ϴ�.");
						}
						else if(com_select[1]==2) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��� ���º��Դϴ�.");
						}
						else {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <��>");
							System.out.println("��ǻ��_2�� �¸��Ͽ����ϴ�.");
						}
					}
					else if((user_value == 2)&&(com_select[0])==3) {
						if(com_select[1]==1) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <��>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��� ���º��Դϴ�.");
						}
						else if(com_select[1]==2) {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <��>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��ǻ��_1�� �¸��Ͽ����ϴ�.");
						}
						else {
							System.out.println("����� �Է°� : <����>, ��ǻ��_1 �Է°� : <��>, ��ǻ��_2 �Է°� : <��>");
							System.out.println("��ǻ��_1�� ��ǻ��_2�� �¸��Ͽ����ϴ�.");
						}
					}
					
					else if((user_value == 3)&&(com_select[0])==1) {
						if(com_select[1]==1) {
							System.out.println("����� �Է°� : <��>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
						}
						else if(com_select[1]==2) {
							System.out.println("����� �Է°� : <��>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��� ���º��Դϴ�.");
						}
						else {
							System.out.println("����� �Է°� : <��>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <��>");
							System.out.println("��ǻ��_1�� �¸��Ͽ����ϴ�.");
						}
					}
					else if((user_value == 3)&&(com_select[0])==2) {
						if(com_select[1]==1) {
							System.out.println("����� �Է°� : <��>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��� ���º��Դϴ�.");
						}
						else if(com_select[1]==2) {
							System.out.println("����� �Է°� : <��>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
						}
						else {
							System.out.println("����� �Է°� : <��>, ��ǻ��_1 �Է°� : <����>, ��ǻ��_2 �Է°� : <��>");
							System.out.println("����ڿ� ��ǻ��_2�� �¸��Ͽ����ϴ�.");
						}
					}
					else if((user_value == 3)&&(com_select[0])==3) {
						if(com_select[1]==1) {
							System.out.println("����� �Է°� : <��>, ��ǻ��_1 �Է°� : <��>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("��ǻ��_2�� �¸��Ͽ����ϴ�.");
						}
						else if(com_select[1]==2) {
							System.out.println("����� �Է°� : <��>, ��ǻ��_1 �Է°� : <��>, ��ǻ��_2 �Է°� : <����>");
							System.out.println("����ڿ� ��ǻ��_1�� �¸��Ͽ����ϴ�.");
						}
						else {
							System.out.println("����� �Է°� : <��>, ��ǻ��_1 �Է°� : <��>, ��ǻ��_2 �Է°� : <��>");
							System.out.println("��� ���º��Դϴ�.");
						}
					}
					
					else if(user_value == 4) {
						System.out.println("������ �����մϴ�.");
						break;
					}
					
					else {
						System.out.println("�߸��� ���Դϴ�.");
					}
				}//3�� ���������� ������ ����
			}//3�ΰ��������� ������ if��
			
			
			else if(select_game == 2) {//���������� �ϳ����� ���� ����
			
				while(true) {//���������� �ϳ����� ������ ����
					System.out.println("----------------------------------------------------------------------------------------------------");
					System.out.println("���������� �ϳ����� ������ �����մϴ�.\n������ 1, ������ 2, ���� 3 �Դϴ�. �����ߴ��� 1,2,3�� ������ ���� �Դϴ�.");
					
					System.out.print("ù��°�� �� �� �Է� : ");
					int user_value_1 = sc.nextInt();
					System.out.print("�ι�°�� �� �� �Է� : ");
					int user_value_2 = sc.nextInt();// String������ enter���� ���ڷ� �ν��� ������ ������ INT���̱⿡ enter���� ���� �ʾ� ������ �߻����� �ʴ´�.
					
					if((user_value_1 > 3)||(user_value_2 > 3)||(user_value_1 < 1)||(user_value_2 < 1)) {
						System.out.println("�Էµ� ���� �߸��Ǿ����ϴ�.\n�ڵ����� ������ �����ϰ� �ʱ�ȭ������ �ǵ��ư��ϴ�.");
						break;
					}
					
					game_function.Print_game(user_value_1, user_value_2);//����ڰ� �������� �����ߴ��� �˷��ִ� �޼��带 �����.
					
					System.out.println("����� �Է°� " + user_value_1 +" "+ user_value_2);
					
					int com_value_1 = (int) (Math.random()* 3) + 1;
					int com_value_2 = (int) (Math.random()* 3) + 1;
					
					game_function.Print_game(com_value_1, com_value_2);//��ǻ�Ͱ� �������� �����ߴ��� �˷��ִ� �޼��带 �����. ���������� �ϳ� ���� ������ ���� �λ���� �� �´��� �� �� ����.
					
					System.out.println("��ǻ�� �Է°� " + com_value_1 +" "+ com_value_2);
					
					System.out.print("����ڰ� �� ���� �Է��� �ּ���. �Է� : ");
					
					int user_value_select = sc.nextInt();//����ڰ� ù��°�� �ι�°�� ������ ���� ����.
					int com_value_select = (int) (Math.random()* 2) + 1;//��ǻ�Ͱ� ù��°�� �ι�°�� ������ ���� ����. �� �����̶�� ���� ���������� ���� �̱���ӵ� ���ų� �� �� �ִ�.(�����̱⿡)
					
					
					if((user_value_select == 1)&&(com_value_select == 1)) {//����ڿ� ��ǻ�Ͱ� �Ѵ� ù��° ���� ���Ұ��
						//System.out.println("����� ������ ���� <" + user_value_1 + "> �̰�, ��ǻ�ʹ� <" + com_value_1 + ">�� �����߽��ϴ�." );//������ �����ߴ��� ����� �������� Ȯ���� �뵵�θ� ���.
						
						game_function.game_logic(user_value_1, com_value_1);//�޼���� ������������ ó���ϱ�.
						
					}//��ǻ�Ϳ� ����ڰ� �Ѵ� ù��°�� ���� ����� if�� ����
					
					
					
					else if((user_value_select == 1)&&(com_value_select == 2)) {//����ڴ� ù��° ��ǻ�ʹ� �ι�°�� ����
						//System.out.println("����� ������ ���� <" + user_value_1 + "> �̰�, ��ǻ�ʹ� <" + com_value_2 + ">�� �����߽��ϴ�." );
						
						game_function.game_logic(user_value_1, com_value_2);
						
					}
					
					
					else if((user_value_select == 2)&&(com_value_select == 1)) {//����ڴ� �ι�° ��ǻ�ʹ� ù��°�� ����
						//System.out.println("����� ������ ���� <" + user_value_2 + "> �̰�, ��ǻ�ʹ� <" + com_value_1 + ">�� �����߽��ϴ�." );
						
						game_function.game_logic(user_value_2, com_value_1);
						
					}
					else{//����ڿ� ��ǻ�Ͱ� �Ѵ� �ι�° ���� ���Ұ��
						//System.out.println("����� ������ ���� <" + user_value_2 + "> �̰�, ��ǻ�ʹ� <" + com_value_2 + ">�� �����߽��ϴ�." );
						
						game_function.game_logic(user_value_2, com_value_2);
						
					}
					
					
				}//���������� �ϳ����� ������ ����
			}//���������� �ϳ����� ������ if��
			
			else {
				System.out.println("----------------------------------------------------------------------------------------------------");
				System.out.println("������ �����մϴ�.");
				break;
			}
			
		}while(true);//��ü ���� �ݺ��� ���κ�.
	}//���� �κ�

	
	
	
	
	public void game_logic(int select_1, int select_2) {
		switch(select_1) {//switch�� ����. ����� ������ ù��° ��.
		
		case 1://����ڰ� �Է��� ���� ù��° ���� 1(����)�� ���. �̰Ŵ� 1������.
			if(select_1 == select_2) {//����ڰ� 1, ��ǻ�Ͱ� 1�϶� �ΰ��� �����Ƿ� ==�� ����, �̴� ���� ����.
				System.out.println("����� �Է°� : <����>, ��ǻ�� �Է°� : <����>");
				System.out.println("����ڿ� ��ǻ�ʹ� ���º��Դϴ�.");
				break;
			}
			else if((select_1 + select_2) == 3) {//����ڴ� 1(����), ��ǻ�ʹ� 2(����)�� �� �ΰ� ���ϸ� 3�̴�. �̶� 3�� ��ǻ�Ͱ� �̱�� ��.
				System.out.println("����� �Է°� : <����>, ��ǻ�� �Է°� : <����>");
				System.out.println("����ڰ� �й��Ͽ����ϴ�.");
				break;
			}
			else if((select_1 + select_2) == 4) {//����ڴ� 1(����), ��ǻ�ʹ� 3(��)�� �� �ΰ� ���ϸ� 4�̴�. �̶� 4�� ����ڰ� �̱�� ��.
				System.out.println("����� �Է°� : <����>, ��ǻ�� �Է°� : <��>");
				System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
				break;
			}
			else {
				break;//�� ���� ����.
			}
			
		case 2://����ڰ� �Է��� ���� ù��° ���� 2(����)�� ���. �̰Ŵ� 2������. �Ʒ� �ڵ�� ���� ���� ������ �۵���.
			if(select_1 == select_2) {// 2 2
				System.out.println("����� �Է°� : <����>, ��ǻ�� �Է°� : <����>");
				System.out.println("����ڿ� ��ǻ�ʹ� ���º��Դϴ�.");
				break;
			}
			else if((select_1 + select_2) == 3) {// 2 1
				System.out.println("����� �Է°� : <����>, ��ǻ�� �Է°� : <����>");
				System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
				break;
			}
			else if((select_1 + select_2) == 5) {// 2 3
				System.out.println("����� �Է°� : <����>, ��ǻ�� �Է°� : <��>");
				System.out.println("����ڰ� �й��Ͽ����ϴ�.");
				break;
			}
			else {
				break;//�� ���� ����.
			}
			
		case 3://����ڰ� �Է��� ���� ù��° ���� 3(��)�� ���. �̰Ŵ� 3������. �Ʒ� �ڵ�� ���� ���� ������ �۵���.
			if(select_1 == select_2) {// 3 3
				System.out.println("����� �Է°� : <��>, ��ǻ�� �Է°� : <��>");
				System.out.println("����ڿ� ��ǻ�ʹ� ���º��Դϴ�.");
				break;
			}
			else if((select_1 + select_2) == 4) {// 3 1
				System.out.println("����� �Է°� : <��>, ��ǻ�� �Է°� : <����>");
				System.out.println("����ڰ� �й��Ͽ����ϴ�.");
				break;
			}
			else if((select_1 + select_2) == 5) {// 3 2
				System.out.println("����� �Է°� : <��>, ��ǻ�� �Է°� : <����>");
				System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
				break;
			}
			else {
				break;//�� ���� ����.
			}
		default:
			//�̰�쵵 ����. ���� �ٸ����� ������ ���� ����Ǵ� ���� ���๮���� ���ϵ��� �� ����.
			break;
			
		}//switch���� ����
	}//game_logic �޼����� ����.
	
	
	
	
	public void Print_game(int select_3, int select_4) {
		if(select_3 == 1) {
			if(select_4 == 1) {
				System.out.println("����ڴ� 1. <����> 2. <����>�� �����߽��ϴ�.");
			}
			else if(select_4 == 2) {
				System.out.println("����ڴ� 1. <����> 2. <����>�� �����߽��ϴ�.");
			}
			else if(select_4 == 3) {
				System.out.println("����ڴ� 1. <����> 2. <��>�� �����߽��ϴ�.");
			}
		}
		
		else if(select_3 == 2) {
			if(select_4 == 1) {
				System.out.println("����ڴ� 1. <����> 2. <����>�� �����߽��ϴ�.");
			}
			else if(select_4 == 2) {
				System.out.println("����ڴ� 1. <����> 2. <����>�� �����߽��ϴ�.");
			}
			else if(select_4 == 3) {
				System.out.println("����ڴ� 1. <����> 2. <��>�� �����߽��ϴ�.");
			}
		}
		
		else if(select_3 == 3) {
			if(select_4 == 1) {
				System.out.println("����ڴ� 1. <��> 2. <����>�� �����߽��ϴ�.");
			}
			else if(select_4 == 2) {
				System.out.println("����ڴ� 1. <��> 2. <����>�� �����߽��ϴ�.");
			}
			else if(select_4 == 3) {
				System.out.println("����ڴ� 1. <��> 2. <��>�� �����߽��ϴ�.");
			}
		}
	}//Print_game �޼����� ����
	
}//class�� ����





/*
 * 1 : ���� 2: ���� 3: ��
 * 
 * ��뺯�� ��� �� ����
 * 
 * sc(����) = ��ĳ�� ����
 * 
 * select_game(����) = ����ڰ� ������ ���Ӹ�带 ����
 * 
 * user_value(����) = ����� �Է°�
 * 
 * user_value_1(����) = ���������� �ϳ� ���⿡���� ������� ���ð� 1
 * user_value_2(����) = ���������� �ϳ� ���⿡���� ������� ���ð� 2
 * com_value_1(����) = ���������� �ϳ� ���⿡���� ��ǻ���� ������ 1
 * com_value_2(����) = ���������� �ϳ� ���⿡���� ��ǻ���� ������ 2
 * user_value_select(����) = ����ڰ� �Է��� �ΰ��� ���������� ���� �ϳ��� ����
 * com_value_select(����) = ��ǻ�Ͱ� ���� ������ �ΰ��� ���������� ���� �ϳ��� ����
 * 
 * com_select[](��ü �迭) = ��ǻ�Ͱ� ������ ������(�迭) [0] = com_1 [1] = com_2
 * 
 * select_1, select_2, select_3, select_4 = �޼��忡�� ����� ����(?) ��. �Ϻη� ȥ�� ������ ���� 1 2 3 4�� ������.
 * 
 * �޼��� ���(�ݺ��Ǵ� �κп� ���� �����.)
 * 
 * 1. game_logic(select_1, select_2)
 * ������ ���и� �����ϴ� �޼ҵ�� select_1���� ����ڰ�, select_2���� ��ǻ�Ͱ��� ����.
 * 
 * 2. Print_game(select_3, select_4)
 * ����ڳ� ��ǻ�Ͱ� ������ ������������ ���� �ѱ۷� ���������� ��� ����� �ش�. ex)�Է°��� 1 1 �϶� ����� <����> <����>
 * 
 * ��Ÿ
 * ���������� �ϳ����� ���ӿ����� ��ǻ�Ͱ� ù��°�� �ι�°�� ���� ����ں��� ������ ��Ȳ�� �־ ���������� ���� �ϳ��� �����ϱ⿡ �¸��� ����� �޶��� �� �ִ�.
 * (AI�� �����ϸ� ��ǻ���� ������ �����ϰ� ����ǹǷ� �� ���̵��� ���� ������ ���� ������ ����.)
 */