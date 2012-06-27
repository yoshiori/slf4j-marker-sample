package org.yoshiori.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.yoshiori.log.filter.MyMarker.*;

/**
 * @author yoshiori_shoji
 * 
 */
public class Main {

	static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		LOG.trace("trace");
		LOG.debug("debug");
		LOG.info("info");
		LOG.warn("warn");
		LOG.error("error");

		LOG.trace(HOGE, "trace");
		LOG.debug(HOGE, "debug");
		LOG.info(HOGE, "info");
		LOG.warn(HOGE, "warn");
		LOG.error(HOGE, "error");
		LOG.error(FOO, "error");
		LOG.error(ROOT, "error");
	}
}
