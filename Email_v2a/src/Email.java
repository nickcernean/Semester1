public class Email
{
  private String user;
  private String host;
  private String domain;

  public Email(String user, String host, String domain)
  {
    if (trueOrFalse(user))
    {
      this.user = user;
    }
    else
      this.user = "wrong email";

    if (trueOrFalse(host))
    {
      this.host = host;
    }
    else
      this.host = "wrong email";
    if (trueOrFalse(domain))
    {
      this.domain = domain;
    }
    else
      this.domain = "wrong email";

  }

  public boolean trueOrFalse(String test)
  {
    if (!(test.length() >= 1 && test.length() < 64))
    {
      return false;
    }

    for (int i = 0; i < test.length(); i++)
    {
      char ch = test.charAt(i);

      if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'
          || ch >= '0' && ch <= '9'))
      {
        return false;
      }
    }
    return true;
  }

  public String getUser()
  {
    return user;
  }

  public String getHost()
  {
    return host;
  }

  public String getDomain()
  {
    return domain;
  }

  public String toString()
  {
    String s = user + "@" + host + "." + domain;
    if (s.contains("wrong email"))
      return "Wrong format";
    else
      return s;

  }

}
