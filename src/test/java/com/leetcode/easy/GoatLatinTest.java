package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoatLatinTest {

	@Test
	public void example1() {
		String input = "I speak Goat Latin";
		String expected = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
		String actual = new GoatLatin().toGoatLatin(input);
		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		String input = "The quick brown fox jumped over the lazy dog";
		String expected = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
		String actual = new GoatLatin().toGoatLatin(input);
		assertEquals(expected, actual);
	}
	

	@Test
	public void inputStringwithOnevovwel() {
		String input = "I";
		String expected = "Imaa";
		String actual = new GoatLatin().toGoatLatin(input);
		assertEquals(expected, actual);
	}

	@Test
	public void onewordwithconsonent() {
		String input = "goat";
		String expected = "oatgmaa";
		String actual = new GoatLatin().toGoatLatin(input);
		assertEquals(expected, actual);
	}

}
