package KeyPoint7;

public class PauseState implements State {
	
	public PauseState() {
		System.out.println("Pause");
	}

	@Override
	public void play(AudioPlayer audioPlayer) {
		audioPlayer.setState(new PauseState());
		
	}

	@Override
	public void stop(AudioPlayer audioPlayer) {
		audioPlayer.setState(new PauseState());
		
	}

	@Override
	public void pause(AudioPlayer audioPlayer) {
		
		
	}

}
