
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimeToWordsTest {

	@Test
	public void testMidnight() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("Its Midnight", timeToWords.printTimeToWords(0, 0));
	}

	@Test
	public void testMidday() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("Its Midday", timeToWords.printTimeToWords(12, 0));
	}

	@Test
	public void testOnTheHour() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("two o' clock ", timeToWords.printTimeToWords(2, 0));
	}

	@Test
	public void testOneMinutePast() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("one minute past five", timeToWords.printTimeToWords(5, 1));
	}

	@Test
	public void testOneMinuteTo() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("one minute to six", timeToWords.printTimeToWords(5, 59));
	}

	@Test
	public void testQuarterPast() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("quarter past three", timeToWords.printTimeToWords(3, 15));
	}

	@Test
	public void testHalfPast() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("half past nine", timeToWords.printTimeToWords(9, 30));
	}

	@Test
	public void testQuarterTo() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("quarter to five", timeToWords.printTimeToWords(4, 45));
	}

	@Test
	public void testMinutesPast() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("twenty two minutes past four", timeToWords.printTimeToWords(4, 22));
	}

	@Test
	public void testMinutesTo() {
		TimeToWords timeToWords = new TimeToWords();
		assertEquals("thirteen minutes to eleven", timeToWords.printTimeToWords(10, 47));
	}
	
	

}
