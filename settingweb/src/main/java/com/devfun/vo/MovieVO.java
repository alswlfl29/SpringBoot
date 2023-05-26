package com.devfun.vo;

//**중간 Quiz**
//
//- 현재 [MovieVO.java](http://movievo.java) 파일을 작성해 놓치 않았습니다.
//- 현재까지의 코드들을 보고 MovieVO.java를 작성해봅니다.
public class MovieVO {
	private int movie_id;
	private String movie_name;
	private String director;
	private String type;
	private String moviecol;
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMoviecol() {
		return moviecol;
	}
	public void setMoviecol(String moviecol) {
		this.moviecol = moviecol;
	}

}
