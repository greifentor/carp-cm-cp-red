package de.ollie.carp.cm.cp.red.core.service.port.print;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

public interface PrintPort {
	@EqualsAndHashCode
	@Getter
	@RequiredArgsConstructor
	@ToString
	public static class Details {

		private final String id;
		private final String description;
	}

	Details getDetails();

	byte[] print(Punk punk, Map<String, Object> parameters);
}
