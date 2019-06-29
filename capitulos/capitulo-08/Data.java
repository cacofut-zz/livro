import java.util.HashMap;
import java.util.Map;

public class Data{

	private int day;
	private int month;
	private int year;


	private static final Map<String, Integer> months = new HashMap<String, Integer>(){{
		put("January",   1);
		put("February",  2);
		put("March",     3);
		put("April",     4);
		put("May",       5);
		put("June",      6);
		put("July",   	 7);
		put("August",    8);
		put("September", 9);
		put("October",   10);
		put("November",  11);
		put("December",  12);
	}};

	private static final int[] daysPerMonth = {
		0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	public Data(int day, int month, int year){				
		this.day   = day;
		this.month = month;
		this.year  = year;		
	}
	
	public Data( int day, String month, int year  ){		
		if(!months.containsKey(month)){
			throw new IllegalArgumentException("Invalid Month!");
		}		
		this.day   = day;
		this.month = months.get(month);
		this.year  = year;		
	}
	
	public Data( int days, int year ){
		if( year < 0 ){
			throw new IllegalArgumentException("year Must be greater than 0");
		}	
		if( days <= 0 && days > 365){
			throw new IllegalArgumentException("days Must be greater than 0 and less than 365");
		}		
		int new_day = 0;
		int new_month = 0;		
		int qtd_dias_mes = 0;
		int days_per_month = 0;

		for (int i = 1 ; i < daysPerMonth.length; i++) {
			qtd_dias_mes += daysPerMonth[i];
			days_per_month += daysPerMonth[i-1];
			if( i == 1 && qtd_dias_mes >= days ){
				new_day = days;
				new_month = i;
				break;
			}			
			if( i > 1 && qtd_dias_mes >= days ){		
				new_day = days % days_per_month;
				new_month = i;
				break;
			}			
		}
		
		this.day   = new_day;
		this.month = new_month;
		this.year  = year;

	}
	
	public String toStringA(){
		return String.format("%02d/%02d/%04d", day, month, year);
	}

	public String toStringB(){
		String aux_mes = "";
		for (String key : months.keySet()) {
			int value = months.get(key);
			if( value == month ){
				aux_mes = key;
			}			
		}
		return String.format("%02d %s, %04d", day, aux_mes, year);
	}
	
	public String toStringC(){
		int dias_ano = 0;
		if( month == 1 ){			
			dias_ano = day;
		}
		else if( month > 1 ){
			int qtd_dias_ano = 0;
			for( int i = (month - 1); i > 0; i-- ){
				qtd_dias_ano += daysPerMonth[i];				
			}
			qtd_dias_ano += day;
			dias_ano = qtd_dias_ano;
			
		}		
		return String.format("%03d %04d",dias_ano, year);
	}
	
	public static void main(String[] args){
		
		Data d1 = new Data(2, 12, 1986);
		Data d2 = new Data(6, "January", 1997);
		Data d3 = new Data(365, 1997);

		System.out.println(d1.toStringA());
		System.out.println(d1.toStringB());
		System.out.println(d1.toStringC());
		System.out.println("=====================================");

		System.out.println(d2.toStringA());
		System.out.println(d2.toStringB());
		System.out.println(d2.toStringC());
		System.out.println("=====================================");

		System.out.println(d3.toStringA());
		System.out.println(d3.toStringB());
		System.out.println(d3.toStringC());
		System.out.println("=====================================");

		
	}
}