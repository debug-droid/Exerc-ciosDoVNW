import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) throws ParseException {
		
		try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dataContratacao = dateFormat.parse("2023-02-01");

            
            Colaborador devBack = new DevBackEnd("Diego Augusto", "12345", "6789", 2000.0, "3216", "M", dataContratacao, "CLT", "Jr", true);
            Colaborador designer = new Designer("João da Silva", "54321", "9874", 2500.0, "9510", "M", dataContratacao, "CLT", "Jr", true);
            Colaborador devFront = new DevFrontEnd("Mariana Dos Santos", "05983", "0356", 5000.0, "5874", "F", dataContratacao, "PJ", "Pleno", true);
            Colaborador techLeader = new TechLeader("Fernanda Martins", "96300", "1479", 8000.0, "4897", "F", dataContratacao, "PJ", "Senior", true);
            
            //Back-end
            devBack.calcularValeTransporte();
            devBack.calcularValeRefeicao();
            devBack.calcularFgts();
            devBack.visualizar();
            System.out.println("-------------------------------------------------");
            //Designer
            designer.calcularValeTransporte();
            designer.calcularValeRefeicao();
            designer.calcularFgts();
            designer.visualizar();
            System.out.println("-------------------------------------------------");
            //Front-End
            devFront.visualizar();
            System.out.println("-------------------------------------------------");
            //TechLeader
            techLeader.visualizar();
            System.out.println("-------------------------------------------------");
            
            
            
        } catch (ParseException e) {
            e.printStackTrace();
        }

	}

}

