
public class Ex10 {

	private int canal;
	private int volume;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if (volume <= 100 && volume >=0)
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (canal <= 200 && canal >=0)
		this.canal = canal;
	}
	
}


