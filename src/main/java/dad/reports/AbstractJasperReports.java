package dad.reports;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public abstract class AbstractJasperReports {
	private static JasperReport report;
	private static JasperPrint reportFilled;
	private static JasperViewer viewer;

	public static void createReport(Connection connection, String path) {
		try {
			JasperReport report = JasperCompileManager.compileReport("C:\\Users\\bzjua\\IdeaProjects\\Wiki_Pokemon\\target\\classes\\Leaf_Green_Table_Based.jrxml");
			JasperPrint print = JasperFillManager.fillReport(report,null,connection);
			reportFilled = JasperFillManager.fillReport(report, new HashMap<>(), connection);
			String salida = System.getenv("USERPROFILE")+ "/PokeDex/pokedexReport.pdf";
			JasperExportManager.exportReportToPdfFile(reportFilled, salida);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}

	public static void showViewer() {
		viewer = new JasperViewer(reportFilled);
		viewer.setVisible(true);
	}

	public static void exportToPDF(String destination) {
		try {
			JasperExportManager.exportReportToPdfFile(reportFilled, destination);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}

}
