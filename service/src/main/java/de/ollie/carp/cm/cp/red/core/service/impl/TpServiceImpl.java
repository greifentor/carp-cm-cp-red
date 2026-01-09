package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.TpService;
import jakarta.inject.Named;

@Named
class TpServiceImpl implements TpService {

	@Override
	public int getAnfaenglicheTp(int kraft) {
		return kraft * 5;
	}

	@Override
	public int getSchwertVerwundet(int kraft) {
		return (getAnfaenglicheTp(kraft) + 1) / 2;
	}

	@Override
	public int getTraumaprobe(int kraft) {
		return kraft;
	}
}
