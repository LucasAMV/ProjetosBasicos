import java.awt.Frame;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

/**
 * https://docs.oracle.com/javase/tutorial/uiswing/components/formattedtextfield.html
 * @author lucas.vilhagra
 */
public class Main {

	public static void main(String[] args) {
		estilo1();
	}

	public static void estilo1() {
		LocalTime hora1 = LocalTime.parse(JOptionPane.showInputDialog("Entrada"));
		LocalTime hora2 = LocalTime.parse(JOptionPane.showInputDialog("Início almoço"));
		LocalTime hora3 = LocalTime.parse(JOptionPane.showInputDialog("Fim almoço"));

		hora2 = hora2.minus(hora1.getHour(), ChronoUnit.HOURS);
		hora2 = hora2.minus(hora1.getMinute(), ChronoUnit.MINUTES);
		System.out.println("Horas da manhã: " + hora2);

		LocalTime hora4 = LocalTime.of(8, 0).minus(ChronoField.MINUTE_OF_DAY.getFrom(hora2), ChronoUnit.MINUTES);

		StringBuilder sb = new StringBuilder();
		sb.append("Horas faltando: " + hora4);
		sb.append("\n");
		sb.append("Saída às " + hora3.plus(ChronoField.MINUTE_OF_DAY.getFrom(hora4), ChronoUnit.MINUTES));

		JOptionPane.showMessageDialog(new Frame(), sb.toString());
	}

}
