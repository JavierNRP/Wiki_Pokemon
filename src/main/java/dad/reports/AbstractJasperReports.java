package dad.reports;

import java.sql.Connection;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public abstract class AbstractJasperReports {
	private static JasperReport report;
	private static JasperPrint reportFilled;
	private static JasperViewer viewer;

	public static void createReport(Connection connection, String path) {
		try {
			report = (JasperReport) JRLoader.loadObjectFromFile(path);
			reportFilled = JasperFillManager.fillReport(report, null, connection);
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
