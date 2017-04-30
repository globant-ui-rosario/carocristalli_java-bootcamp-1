package KeyPoint7;

public class PlayState implements State {
	
	public PlayState() {
		System.out.println("Listening to music");
	}

	@Override
	public void play(AudioPlayer audioPlayer) {
		
		
	}

	@Override
	public void stop(AudioPlayer audioPlayer) {
		audioPlayer.setState(new StopState());
		
	}

	@Override
	public void pause(AudioPlayer audioPlayer) {
		audioPlayer.setState(new PauseState());
		
	}

}
