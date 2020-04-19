package com.xlx.db.model;

import java.util.Date;

/**
 * @author xueleixi
 * @date 2019-08-21 10:39
 */
public class Blog
{
  public int id;
  private String title;
  private String content;
  private Date time;

  public Blog()
  {
  }

  public Blog(String title, String content)
  {
    this.title = title;
    this.content = content;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getContent()
  {
    return content;
  }

  public void setContent(String content)
  {
    this.content = content;
  }

  public Date getTime()
  {
    return time;
  }

  public void setTime(Date time)
  {
    this.time = time;
  }

  @Override
  public String toString()
  {
    return "Blog{" +
           "id=" + id +
           ", title='" + title + '\'' +
           ", content='" + content + '\'' +
           ", time=" + time +
           '}';
  }
}
