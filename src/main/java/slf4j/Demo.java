package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
	private static final Logger LOG = LoggerFactory.getLogger(Demo.class);
	
	public static void ceshi() {
		LOG.error("Error ceshi!");
		LOG.warn("Warn ceshi!");
		LOG.info("Info ceshi!");
		LOG.debug("Debug ceshi!");
		LOG.trace("Trace ceshi!");
	}
	public static void main(String[] args) {
		ceshi();
	}

}
