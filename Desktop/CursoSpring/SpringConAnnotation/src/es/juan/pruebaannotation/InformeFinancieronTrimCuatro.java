package es.juan.pruebaannotation;
import org.springframework.stereotype.Component;

@Component
public class InformeFinancieronTrimCuatro implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Informe financiero del trimestre cuatro";
	}

}
