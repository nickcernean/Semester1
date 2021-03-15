public class File
{

  private String filename;
  private String extension;

  public File(String filename, String extension)
  {
    this.filename = filename;
    this.extension = extension;
  }

  public boolean isPDF()
  {
    return extension.equals("PDF") || extension.equals("pdf");
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof File))
    {
      return false;
    }
   File other=(File)obj;
    return filename.equals(other.filename)&&extension.equals(other.extension);
  }

  @Override public String toString()
  {
    return "\nFile: " + filename +"."+ extension ;
  }
}