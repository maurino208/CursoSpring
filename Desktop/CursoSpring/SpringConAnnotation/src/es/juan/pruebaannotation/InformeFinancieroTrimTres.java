package es.juan.pruebaannotation;
import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrimTres implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion del informe del trimestre tres";
	}

}
