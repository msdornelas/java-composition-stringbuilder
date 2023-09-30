package entities;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Post {

	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}

	public void removeComment(Comment comment) {
		this.comments.remove(comment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(this.moment) + "\n");
		sb.append(this.content + "\n");
		sb.append("Comments:");

		for (Comment c : this.comments) {
			sb.append("\n" + c.getText());
		}

		return sb.toString();
	}

}
