package de.ollie.carp.cm.cp.red.print.jasper.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@NoArgsConstructor
public class FertigkeitPO {

	private String eigenschaft;
	private String name;
	private String wert;
}
