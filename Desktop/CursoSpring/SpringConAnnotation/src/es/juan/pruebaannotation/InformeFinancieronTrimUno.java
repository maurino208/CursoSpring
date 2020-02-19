package es.juan.pruebaannotation;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieronTrimUno implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion del informe financiero del trimestre uno";
	}

}
