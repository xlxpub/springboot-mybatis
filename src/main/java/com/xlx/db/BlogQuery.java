package com.xlx.db;

/**
 * @author xueleixi
 * @date 2019-08-21 15:36
 */
public class BlogQuery
{
  private String title;
  private String content;

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

  @Override
  public String toString()
  {
    return "BlogQuery{" +
           "title='" + title + '\'' +
           ", content='" + content + '\'' +
           '}';
  }
}
