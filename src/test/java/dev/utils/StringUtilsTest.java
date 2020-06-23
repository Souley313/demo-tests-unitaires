/**
 * 
 */
package dev.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author souleymaneTHIAM
 *
 */
public class StringUtilsTest {

	private static final Logger LOG = LoggerFactory.getLogger(StringUtilsTest.class);

	StringUtils stringUtils;

	@Before
	public void init() {
		stringUtils = new StringUtils();
	}

	@Test
	public void levenshteinDistancenull() {

		int rsltt = StringUtils.levenshteinDistance(null, null);
		assertEquals(0, rsltt);

	}
	
	@Test
	public void levenshteinDistanceavironavion() {

		int rsltt = StringUtils.levenshteinDistance("aviron", "avion");
		assertEquals(1, rsltt);

	}
	
	@Test
	public void levenshteinDistanceinstancedistance() {

		int rsltt = StringUtils.levenshteinDistance("instance", "distance");
		assertEquals(2, rsltt);

	}
	
	@Test
	public void levenshteinDistancechinechien() {

		int rsltt = StringUtils.levenshteinDistance("chien", "chine");
		assertEquals(2, rsltt);

	}
	
	@Test
	public void levenshteinDistancenichechien() {

		int rsltt = StringUtils.levenshteinDistance("chien", "niche");
		assertEquals(4, rsltt);

	}

}
