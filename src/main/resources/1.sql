create table log(
  id INT UNSIGNED NOT NULL  AUTO_INCREMENT PRIMARY KEY ,
  user VARCHAR(32),
  action VARCHAR(32),
  time TIMESTAMP DEFAULT current_timestamp ON UPDATE current_timestamp
);

SELECT *
FROM log;

alter table log MODIFY   time TIMESTAMP DEFAULT current_timestamp ON UPDATE current_timestamp
;

show create table log;
show create table blog;

alter table blog add UNIQUE  index idx_title(title);

SELECT *
FROM blog;
delete from blog where id>2;