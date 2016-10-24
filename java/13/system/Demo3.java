package cn.jonson.lin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*日期类 Date
Calendar
日期的格式化类 	SimpleDataFormat
*/

public class Demo3 {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();	//获取当前的系统时间
		System.out.println("年份：" + date.getYear());

		Calendar calendar = Calendar.getInstance();//获取当前系统时间
		System.out.println("年" + calendar.get(Calendar.YEAR));
		System.out.println("月" + (calendar.get(Calendar.MONTH)+1));
		System.out.println("日" + calendar.get(Calendar.DATE));

		System.out.println("时" + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分" + calendar.get(Calendar.MINUTE));
		System.out.println("秒" + calendar.get(Calendar.SECOND));

	}
}