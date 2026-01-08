package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.print.PrintPort;
import java.util.List;
import java.util.Map;

public interface ReportPrintService {
	List<PrintPort.Details> getDetails();

	byte[] printPunk(Punk punk, String printPortId, Map<String, Object> parameters);
}
