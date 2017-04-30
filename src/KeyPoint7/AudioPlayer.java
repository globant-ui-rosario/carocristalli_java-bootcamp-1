package KeyPoint7;

public class AudioPlayer {
	
	private State state;
	
	

	public AudioPlayer() {
		PlayState play = new PlayState();
		this.setState(play);
	}
	
	public void play() {
	    state.play(this);
	  }
	  
	  public void stop() {
		    this.setState(new StopState());
		  }
	  
	  public void pause() {
		    state.pause(this);
}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	

}
