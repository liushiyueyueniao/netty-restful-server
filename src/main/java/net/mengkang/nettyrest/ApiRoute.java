package net.mengkang.nettyrest;

import java.util.HashMap;
import java.util.Map;

/**
 * api route map, read from routeMap.xml
 */
public class ApiRoute {

	private static final String routeName = "/routeMap.xml";

	public static final Map<String, String> apiMap = new HashMap<String, String>();

	static {
		init();
	}

	public static void init() {

	}
}
