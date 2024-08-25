package kadai_015;

public class Car_Chapter15 {
	
		//フィールド(内部データ)
		private int previousGear = 1;
		private int gear = 1;//1速から5速のギアを表す
		private int speed = 10;//ギアチェンジ後の速度を表す
		
		//コンストラクタ(初期化処理)
		public Car_Chapter15( int gear, int speed ) {
			this.gear = gear;
			this.speed = gear;
		}
		
		public void gearChange( int afterGear) {
			this.previousGear = this.gear;
			this.gear = afterGear;
			switch (this.gear) {
				case 1 -> this.speed = 10;
				case 2 -> this.speed = 20;
				case 3 -> this.speed = 30;
				case 4 -> this.speed = 40;
				case 5 -> this.speed = 50;
				default -> this.speed = 10;
			}
			
		}
		
		public void run() {
			System.out.println("ギア" + this.gear );
			System.out.println("時速" + this.speed + "㎞");
		}
}
