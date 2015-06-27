package com.example.t61dbsqlite;

public interface Query {
	 public static final String CRIARE_TABLE= "create table mytable(id integer primary key autoincrement, name text);";
	 public static final String DROP_TABLE="drop table mytable";
	 public static final String INSERT= "insert into mytable (name) values('seo')";
	 public static final String SELECT ="select * from mytable";
	 public static final String UPDATE= "";
}
