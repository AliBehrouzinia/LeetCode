package problems.p0290_word_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
	private final Solution solution = new Solution();
	
	@Test
	void example1() {
		assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
	}
	
	@Test
	void example2() {
		assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
	}
	
	@Test
	void example3() {
		assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
	}

	@Test
	void singleLetterSingleWord() {
		assertTrue(solution.wordPattern("a", "dog"));
	}

	@Test
	void sameLetterSameWord() {
		assertTrue(solution.wordPattern("aaa", "dog dog dog"));
	}

	@Test
	void allDistinct() {
		assertTrue(solution.wordPattern("abc", "dog cat fish"));
	}

	@Test
	void differentLettersSameWord() {
		assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
	}

	@Test
	void moreWordsThanLetters() {
		assertFalse(solution.wordPattern("ab", "dog cat fish"));
	}

	@Test
	void fewerWordsThanLetters() {
		assertFalse(solution.wordPattern("abc", "dog cat"));
	}

	@Test
	void wordSharesPrefixWithAnother() {
		assertTrue(solution.wordPattern("ab", "dog dogs"));
	}
}
