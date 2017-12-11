package me.hitit.api.domains;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TimelineComment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idx")
	private long idx;

	@ManyToOne
	@JoinColumn(name = "tidx")
	private Timeline timeline;

	@ManyToOne
	@JoinColumn(name = "uidx")
	private User user;

	@Column(name = "contents")
	private String contents;

	@Column(name = "ts", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp ts;

	public TimelineComment() {

	}

	public TimelineComment(Timeline timeline, User user, String contents){
		this.timeline = timeline;
		this.user = user;
		this.contents = contents;
	}




}
