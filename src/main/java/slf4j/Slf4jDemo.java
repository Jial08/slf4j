package slf4j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jDemo {
	private static final Logger LOG = LoggerFactory.getLogger(Slf4jDemo.class);

	public static void main(String[] args) {
		try {
			Demo.ceshi();
			int a = 1/0;
		} catch (Exception e) {
			long time = System.currentTimeMillis();
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
			System.out.println(sdf.format(date));
			LOG.error(e.toString());
			LOG.error("Error Message!");
//			for (int i = 0; i< 10000; i++) {
//				LOG.warn("Warn Message!");
//			}
			LOG.warn("Warn Message!");
			LOG.info("Info Message!");
			LOG.debug("Debug Message!");
			LOG.trace("Trace Message!");
			long time1 = System.currentTimeMillis();
			Date date1 = new Date(time1);
			System.out.println(sdf.format(date1));
			System.out.println(time1 - time);
		}
	}
}