package de.ollie.carp.cm.cp.red.gui.swing;

import javax.swing.SwingUtilities;
import lombok.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Generated
@SpringBootApplication
@ComponentScan("de.ollie.carp.cm.cp.red")
@EntityScan("de.ollie.carp.cm.cp.red.persistence.jpa.dbo")
@EnableJpaRepositories(basePackages = "de.ollie.carp.cm.cp.red.persistence.jpa.repository")
public class CarpCmCpRedSwingGUIStarter {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CarpCmCpRedSwingGUIStarter.class);
		app.setHeadless(false); // GUI erlauben
		ConfigurableApplicationContext context = app.run(args);

		// GUI aus dem Spring Context holen
		CarpCmCpRedMainFrame mainFrame = context.getBean(CarpCmCpRedMainFrame.class);
		SwingUtilities.invokeLater(mainFrame::showFrame);
	}
}
