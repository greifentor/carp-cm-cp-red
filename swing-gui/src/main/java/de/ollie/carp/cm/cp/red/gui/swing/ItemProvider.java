package de.ollie.carp.cm.cp.red.gui.swing;

import java.util.List;

@FunctionalInterface
public interface ItemProvider<T> {
	List<T> getItem();
}
