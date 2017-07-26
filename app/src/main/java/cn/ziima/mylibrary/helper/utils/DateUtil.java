package cn.ziima.mylibrary.helper.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 格式化时间工具类
 */
public class DateUtil {
  public static final SimpleDateFormat SDF=new SimpleDateFormat("HH:mm");
	public static String parseTime(long date) {
		//描述当前时间
		Calendar now = Calendar.getInstance();
		//描述的参数时间
		Calendar other= Calendar.getInstance();
		other.setTimeInMillis(date);
		//判断是不是同一天
		if(now.get(Calendar.YEAR)==other.get(Calendar.YEAR)&&now.get(Calendar.DAY_OF_YEAR)==other.get(Calendar.DAY_OF_YEAR)){
			return SDF.format(other.getTime());
		}

		//判断是否是昨天
		now.add(Calendar.DAY_OF_YEAR, -1);
		if(now.get(Calendar.YEAR) == other.get(Calendar.YEAR)
				&&now.get(Calendar.DAY_OF_YEAR) ==
				other.get(Calendar.DAY_OF_YEAR)){
			return "昨天"+SDF.format(other.getTime());
		}
		//返回星期几
		int day = other.get(Calendar.DAY_OF_WEEK);
		String d = "";
		switch (day) {
			case Calendar.MONDAY:
				d = "星期一";
				break;
			case Calendar.TUESDAY:
				d = "星期二";
				break;
			case Calendar.WEDNESDAY:
				d = "星期三";
				break;
			case Calendar.THURSDAY:
				d = "星期四";
				break;
			case Calendar.FRIDAY:
				d = "星期五";
				break;
			case Calendar.SATURDAY:
				d = "星期六";
				break;
			case Calendar.SUNDAY:
				d = "星期日";
				break;
		}

		return d;
	}

}
