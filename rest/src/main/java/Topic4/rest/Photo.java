package Topic4.rest;

public class Photo {
	
	
	private int likes;

	public Photo() {
		this.likes = 0;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	
	public void addLike() {
		this.likes++;
}

}
