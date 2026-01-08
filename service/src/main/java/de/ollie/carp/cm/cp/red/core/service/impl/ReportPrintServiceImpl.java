package de.ollie.carp.cm.cp.red.core.service.impl;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.ReportPrintService;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.print.PrintPort;
import de.ollie.carp.cm.cp.red.core.service.port.print.PrintPort.Details;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Named;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
class ReportPrintServiceImpl implements ReportPrintService {

	private final List<PrintPort> printPortList;

	private final Map<String, PrintPort> printPorts = new HashMap<>();

	@PostConstruct
	void postConstruct() {
		printPortList.forEach(p -> printPorts.put(p.getDetails().getId(), p));
	}

	@Override
	public List<Details> getDetails() {
		return printPorts
			.entrySet()
			.stream()
			.map(Entry::getValue)
			.map(PrintPort::getDetails)
			.sorted(this::compareTo)
			.toList();
	}

	private int compareTo(Details dt0, Details dt1) {
		return dt0.getId().compareTo(dt1.getId());
	}

	@Override
	public byte[] printPunk(Punk punk, String printPortId, Map<String, Object> parameters) {
		ensure(parameters != null, "parameters cannot be null!");
		ensure(printPortId != null, "print port id cannot be null!");
		ensure(punk != null, "punk cannot be null!");
		PrintPort printPort = printPorts.get(printPortId);
		ensure(printPort != null, "print port id is not found in configured print ports!");
		return printPort.print(punk, parameters);
	}
}
