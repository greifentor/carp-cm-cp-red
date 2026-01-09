package de.ollie.carp.cm.cp.red.core.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TpServiceImplTest {

	@InjectMocks
	private TpServiceImpl unitUnderTest;

	@Nested
	class getAnfaenglicheTp_int {

		@ParameterizedTest
		@CsvSource({ "2,10", "3,15", "4,20", "5,25", "6,30", "7,35", "8,40", "9,45", "10,50" })
		void returnsTheCorrectTpValue(int kraft, int expected) {
			assertEquals(expected, unitUnderTest.getAnfaenglicheTp(kraft));
		}
	}

	@Nested
	class getSchwerVerwundet_int {

		@ParameterizedTest
		@CsvSource({ "2,5", "3,8", "4,10", "5,13", "6,15", "7,18", "8,20", "9,23", "10,25" })
		void returnsTheCorrectTpValue(int kraft, int expected) {
			assertEquals(expected, unitUnderTest.getSchwertVerwundet(kraft));
		}
	}

	@Nested
	class getTraumaprobe_int {

		@ParameterizedTest
		@CsvSource({ "2,2", "3,3", "4,4", "5,5", "6,6", "7,7", "8,8", "9,9", "10,10" })
		void returnsTheCorrectTpValue(int kraft, int expected) {
			assertEquals(expected, unitUnderTest.getTraumaprobe(kraft));
		}
	}
}
