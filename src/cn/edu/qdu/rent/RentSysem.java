package cn.edu.qdu.rent;

import java.util.Scanner;

public class RentSysem {
	Scanner input=new Scanner(System.in);
	
	
	//��ӭϵͳ
	public void welcom(){
		System.out.println("--------���ã���ӭ����--------");
	}
	
	
	
	
	//˵����������������۸�
	public void rentCarDays(int fee){
		Scanner input=new Scanner(System.in);
		System.out.print("����Ҫ�⼸�죿");
		int days=input.nextInt();
		System.out.println("����Ϊ��"+days*fee+"Ԫ");
	}
	
	
	//�⳵ϵͳ
	public void rentCar(){
		boolean flag=true;
		int j=0;
		double fee;
		double fee1=0;
		String[] type=new String[10];
		String[] typec=new String[10];
		int[] feec=new int[10];
		int[] day=new int[10];
		do{
			System.out.print("������Ҫ���������ĳ���1.�γ� 2.������:");
			int choice=input.nextInt();
//			String[] type1={"�γ�","����"};
			if(choice==1){
				System.out.print("��ѡ������Ҫ�Ľγ�����(1.bmw 2.Audi 3.benc):");
				String[] typeCar={"bmw","Audi","benc"};
				int[] feeCar={500,400,600};
				Auto c=new Car("³B888888");
				int i=input.nextInt();
				((Car) c).setType(typeCar[i-1]);
				type[j]="�γ�";
				typec[j]=typeCar[i-1];
				feec[j]=feeCar[i-1];
				System.out.print("����Ҫ�⼸�죿");
				int days=input.nextInt();
				day[j]=days;
				fee=c.rent(days);
				fee1=fee1+fee;
			}
			else if(choice==2){
				System.out.print("��ѡ������Ҫ�Ľγ�����(1.<=16 2.>16):");
				int[] typeBus={16,22};
				String[] typeBus1={"<=16",">16"};
				int[] feeBus={1000,2000};
				Auto b=new Bus("³B688888");
				int i=input.nextInt();
				((Bus) b).setSeatCount(typeBus[i-1]);
				type[j]="�ͳ�";
				typec[j]=typeBus1[i-1];
				feec[j]=feeBus[i-1];
				System.out.print("����Ҫ�⼸�죿");
				int days=input.nextInt();
				day[j]=days;
				fee=b.rent(days);
				fee1=fee1+fee;
			}
			System.out.print("���Ƿ�Ҫ���� y/n:");
			String cont=input.next();
			if(cont.equals("n")){
				for(int k=0;k<=j;k++){
					System.out.println("���Ϊ:"+type[k]+"  ����Ϊ��"+typec[k]+"  �����Ϊ��"+feec[k]
							+"  ����Ϊ��"+day[k]);
				}
				flag=false;
				System.out.println("�ܷ���Ϊ��"+fee1+"Ԫ");
			}
			j=j+1;
		}
		while(flag);
	}
	
	public static void main(String[] args) {
		RentSysem rent=new RentSysem();
		rent.welcom();
		rent.rentCar();
	}

}
