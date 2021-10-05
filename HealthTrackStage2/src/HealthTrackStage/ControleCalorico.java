package HealthTrackStage;

public class ControleCalorico {

	public double gastoCalorico(double c) {
		Atividade caloria = new Atividade();
		caloria.setCalorias(c);	
		double result = caloria.getCalorias();
		return result;
	}
	
	
}
      