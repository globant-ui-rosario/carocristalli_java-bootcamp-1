package KeyPoint7;

public class StopState implements State {
	
	public StopState() {
		System.out.println("Stop");
	}

	@Override
	public void play(AudioPlayer audioPlayer) {
		audioPlayer.setState(new PlayState());
		
	}

	@Override
	public void stop(AudioPlayer audioPlayer) {
		
		
	}

	@Override
	public void pause(AudioPlayer audioPlayer) {
		audioPlayer.setState(new PauseState());
		
	}

}
