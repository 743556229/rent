package cn.edu.qdu.rent;

import java.util.Scanner;

public class RentSysem {
	Scanner input=new Scanner(System.in);
	
	
	//欢迎系统
	public void welcom(){
		System.out.println("--------您好，欢迎光临--------");
	}
	
	
	
	
	//说明租赁天数，计算价格
	public void rentCarDays(int fee){
		Scanner input=new Scanner(System.in);
		System.out.print("您需要租几天？");
		int days=input.nextInt();
		System.out.println("费用为："+days*fee+"元");
	}
	
	
	//租车系统
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
			System.out.print("请问您要租哪种类别的车（1.轿车 2.汽车）:");
			int choice=input.nextInt();
//			String[] type1={"轿车","汽车"};
			if(choice==1){
				System.out.print("请选择您想要的轿车类型(1.bmw 2.Audi 3.benc):");
				String[] typeCar={"bmw","Audi","benc"};
				int[] feeCar={500,400,600};
				Auto c=new Car("鲁B888888");
				int i=input.nextInt();
				((Car) c).setType(typeCar[i-1]);
				type[j]="轿车";
				typec[j]=typeCar[i-1];
				feec[j]=feeCar[i-1];
				System.out.print("您需要租几天？");
				int days=input.nextInt();
				day[j]=days;
				fee=c.rent(days);
				fee1=fee1+fee;
			}
			else if(choice==2){
				System.out.print("请选择您想要的轿车类型(1.<=16 2.>16):");
				int[] typeBus={16,22};
				String[] typeBus1={"<=16",">16"};
				int[] feeBus={1000,2000};
				Auto b=new Bus("鲁B688888");
				int i=input.nextInt();
				((Bus) b).setSeatCount(typeBus[i-1]);
				type[j]="客车";
				typec[j]=typeBus1[i-1];
				feec[j]=feeBus[i-1];
				System.out.print("您需要租几天？");
				int days=input.nextInt();
				day[j]=days;
				fee=b.rent(days);
				fee1=fee1+fee;
			}
			System.out.print("您是否要继续 y/n:");
			String cont=input.next();
			if(cont.equals("n")){
				for(int k=0;k<=j;k++){
					System.out.println("类别为:"+type[k]+"  车型为："+typec[k]+"  日租价为："+feec[k]
							+"  天数为："+day[k]);
				}
				flag=false;
				System.out.println("总费用为："+fee1+"元");
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
