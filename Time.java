class Time{
	int hours,minutes,seconds;
	
	public Time(int h, int m, int s)
	{
	hours=h;
	minutes=m;
	seconds=s;
	}
	
	void add(Time obj2)
	{
		this.hours+=obj2.hours;
		this.minutes+=obj2.minutes;
		this.seconds+=obj2.seconds;
	}
	
	void display()
	{
		if(this.seconds>60){
			this.minutes+=1;
			this.seconds-=60;
		}
		
		if(this.seconds>60){
			this.hours+=1;
			this.minutes-=60;
		}
		
		System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
	}
	
	public static void main(String[] args)
	{
		Time obj1=new Time(10, 30, 40);
		Time obj2=new Time(05, 60, 40);
		
		obj1.add(obj2);
		System.out.println("the addition of time is:");
		obj1.display();
	}
}