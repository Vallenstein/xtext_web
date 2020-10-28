/**
 * generated by Xtext 2.23.0.M3
 */
package org.xtext.example.landingpagedsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.landingpagedsl.lPDSL.AboutMe;
import org.xtext.example.landingpagedsl.lPDSL.ContactInformation;
import org.xtext.example.landingpagedsl.lPDSL.Items;
import org.xtext.example.landingpagedsl.lPDSL.LinkItem;
import org.xtext.example.landingpagedsl.lPDSL.Links;
import org.xtext.example.landingpagedsl.lPDSL.PageBody;
import org.xtext.example.landingpagedsl.lPDSL.PageFooter;
import org.xtext.example.landingpagedsl.lPDSL.PageHeader;
import org.xtext.example.landingpagedsl.lPDSL.Picture;
import org.xtext.example.landingpagedsl.lPDSL.PictureCarousel;
import org.xtext.example.landingpagedsl.lPDSL.Resume;
import org.xtext.example.landingpagedsl.lPDSL.ResumeItems;
import org.xtext.example.landingpagedsl.lPDSL.ResumeSection;
import org.xtext.example.landingpagedsl.lPDSL.Sections;
import org.xtext.example.landingpagedsl.lPDSL.TabItems;
import org.xtext.example.landingpagedsl.lPDSL.TimeSpecifier;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class LPDSLGenerator extends AbstractGenerator {
  private StringConcatenation builder = new StringConcatenation();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    StringConcatenation _stringConcatenation = new StringConcatenation();
    this.builder = _stringConcatenation;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<title>Landin Page</title>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<meta name=\"author\" content=\"\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("body {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("background-color: grey;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<div class=\"container\">");
    this.builder.append(_builder);
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(resource.getAllContents());
    for (final EObject component : _iterable) {
      {
        if ((component instanceof PageHeader)) {
          this.genHeader(((PageHeader)component));
        }
        if ((component instanceof PageBody)) {
          this.genBody(((PageBody)component));
        }
        if ((component instanceof PageFooter)) {
          this.genFooter(((PageFooter)component));
        }
      }
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("</div>");
    _builder_1.newLine();
    _builder_1.append("</body>");
    _builder_1.newLine();
    _builder_1.append("</html>");
    _builder_1.newLine();
    this.builder.append(_builder_1);
    fsa.generateFile("huh.html", this.builder);
  }
  
  private void genHeader(final PageHeader header) {
    this.builder.newLine();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!--Navbar-->");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("<nav class=\"navbar  navbar-dark bg-dark mb-3\">");
    _builder.newLine();
    this.builder.append(_builder);
    EList<Items> _title = header.getTitle();
    for (final Items title : _title) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<div class=\"navbar-brand\">");
      String _value = title.getDescription().get(0).getValue();
      _builder_1.append(_value);
      _builder_1.append("</div>");
      _builder_1.newLineIfNotEmpty();
      this.builder.append(_builder_1);
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.newLine();
    _builder_2.append("<div class=\"nav-scroller py-1 mb-2\">");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("<nav class=\"nav d-flex justify-content-between\">");
    _builder_2.newLine();
    this.builder.append(_builder_2);
    EList<TabItems> _tabs = header.getTabs();
    for (final TabItems tab : _tabs) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("<a class=\"p-2 text-muted\" href=\"#");
      String _name = tab.getName();
      _builder_3.append(_name);
      _builder_3.append("\">");
      String _value_1 = tab.getDescription().get(0).getValue();
      _builder_3.append(_value_1);
      _builder_3.append("</a>");
      _builder_3.newLineIfNotEmpty();
      this.builder.append(_builder_3);
    }
    this.builder.newLine();
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("    ");
    _builder_4.append("</nav>");
    _builder_4.newLine();
    _builder_4.append("  ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("</nav>");
    this.builder.append(_builder_4);
  }
  
  private void genBody(final PageBody body) {
    EList<Sections> _sections = body.getSections();
    for (final Sections section : _sections) {
      {
        if ((section instanceof Resume)) {
          this.genResume(((Resume)section));
        }
        if ((section instanceof AboutMe)) {
          this.genAboutMe(((AboutMe)section));
        }
        if ((section instanceof PictureCarousel)) {
          this.genPictureCarousel(((PictureCarousel)section));
        }
        if ((section instanceof ContactInformation)) {
          this.genContactInformation(((ContactInformation)section));
        }
        if ((section instanceof Links)) {
          this.genLinks(((Links)section));
        }
      }
    }
  }
  
  private void genResume(final Resume res) {
    this.builder.newLine();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!--Resume-->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"row mb-3\">");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<div class=\"col\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div class=\"card\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<div class=\"card-header\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Resume");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<div class=\"card\">");
    _builder.newLine();
    this.builder.append(_builder);
    EList<ResumeSection> _resumesections = res.getResumesections();
    for (final ResumeSection e : _resumesections) {
      {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<div class=\"card\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t              ");
        _builder_1.append("<div class=\"card-body\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t                ");
        _builder_1.append("<h5 class=\"card-title\">");
        String _name = e.getName();
        _builder_1.append(_name, "\t\t\t                ");
        _builder_1.append("</h5>");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t                ");
        _builder_1.append("<div class=\"card-text\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t                  ");
        _builder_1.append("<ul class=\"list-group list-group-flush\">");
        _builder_1.newLine();
        this.builder.append(_builder_1);
        EList<ResumeItems> _resumeitems = e.getResumeitems();
        for (final ResumeItems resItem : _resumeitems) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("<li class=\"list-group-item\">");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("<div class=\"row justify-content-end\">");
          _builder_2.newLine();
          _builder_2.append("\t\t");
          _builder_2.append("<div class=\"col\">");
          String _value = resItem.getDate().get(0).getDescription().get(0).getValue();
          _builder_2.append(_value, "\t\t");
          _builder_2.append("</div>");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t\t");
          _builder_2.append("<div class=\"col-lg-8\">");
          _builder_2.newLine();
          _builder_2.append("            \t                          ");
          _builder_2.append("<div>");
          String _value_1 = resItem.getTitle().get(0).getDescription().get(0).getValue();
          _builder_2.append(_value_1, "            \t                          ");
          _builder_2.append("</div>");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("            \t                          ");
          _builder_2.append("<div class=\"text-muted\">");
          _builder_2.newLine();
          _builder_2.append("            \t                          ");
          String _value_2 = resItem.getDescription().get(0).getDescription().get(0).getValue();
          _builder_2.append(_value_2, "            \t                          ");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("            \t                          ");
          _builder_2.append("</div>");
          _builder_2.newLine();
          _builder_2.append("            \t                        ");
          _builder_2.append("</div>");
          _builder_2.newLine();
          _builder_2.append("            \t                      ");
          _builder_2.append("</div>");
          _builder_2.newLine();
          _builder_2.append("            \t                    ");
          _builder_2.append("</li>");
          _builder_2.newLine();
          this.builder.append(_builder_2);
        }
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("      ");
        _builder_3.append("</ul>");
        _builder_3.newLine();
        _builder_3.append("    ");
        _builder_3.append("</div>");
        _builder_3.newLine();
        _builder_3.append("  ");
        _builder_3.append("</div>");
        _builder_3.newLine();
        _builder_3.append("</div>");
        _builder_3.newLine();
        this.builder.append(_builder_3);
      }
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("      ");
    _builder_1.append("</div>");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("</div>");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("</div>");
    _builder_1.newLine();
    _builder_1.append("</div>");
    _builder_1.newLine();
    this.builder.append(_builder_1);
  }
  
  private void genAboutMe(final AboutMe ab) {
    this.builder.newLine();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"row mb-3\" id=\"");
    String _name = ab.getName();
    _builder.append(_name);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("<div class=\"col\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div class=\"card\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<div class=\"col-md-5\">");
    _builder.newLine();
    this.builder.append(_builder);
    EList<Picture> _picture = ab.getPicture();
    for (final Picture pic : _picture) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<img src=\"");
      String _value = pic.getImagepath().get(0).getValue();
      _builder_1.append(_value);
      _builder_1.append("\" class=\"card-img\" alt=\"...\">");
      _builder_1.newLineIfNotEmpty();
      this.builder.append(_builder_1);
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("</div>");
    _builder_2.newLine();
    _builder_2.append("<div class=\"col-md-7\">");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("<div class=\"card-body\">");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("<h5 class=\"card-title\">About Me</h5>");
    _builder_2.newLine();
    this.builder.append(_builder_2);
    EList<Items> _description = ab.getDescription();
    for (final Items desc : _description) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("<p class=\"card-text\">");
      String _value_1 = desc.getDescription().get(0).getValue();
      _builder_3.append(_value_1);
      _builder_3.append("</p>");
      _builder_3.newLineIfNotEmpty();
      this.builder.append(_builder_3);
    }
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("          ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("  ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("</div>");
    _builder_4.newLine();
    this.builder.append(_builder_4);
  }
  
  private void genPictureCarousel(final PictureCarousel car) {
    this.builder.newLine();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"row mb-3\" id=\"");
    String _name = car.getName();
    _builder.append(_name);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("<div class=\"col\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div class=\"card\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<div class=\"card-header\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Pictures");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<div class=\"col card-body text-center\">");
    _builder.newLine();
    this.builder.append(_builder);
    EList<TimeSpecifier> _timer = car.getTimer();
    for (final TimeSpecifier time : _timer) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<div id=\"carouselExampleIndicators\" class=\"carousel slide ride\" data-ride=\"carousel\" data-interval=\"");
      int _value = time.getTime().get(0).getValue();
      _builder_1.append(_value);
      _builder_1.append("\">");
      _builder_1.newLineIfNotEmpty();
      this.builder.append(_builder_1);
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("<ol class=\"carousel-indicators\">");
    _builder_2.newLine();
    this.builder.append(_builder_2);
    int counter = 0;
    EList<Picture> _picture = car.getPicture();
    for (final Picture pic : _picture) {
      {
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"");
        _builder_3.append(counter);
        _builder_3.append("\"");
        {
          if ((counter == 0)) {
            _builder_3.append(" class=\"active\"");
          }
        }
        _builder_3.append("></li>");
        _builder_3.newLineIfNotEmpty();
        this.builder.append(_builder_3);
        counter++;
      }
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("</ol>");
    _builder_3.newLine();
    _builder_3.append("<div class=\"carousel-inner\">");
    _builder_3.newLine();
    this.builder.append(_builder_3);
    counter = 0;
    EList<Picture> _picture_1 = car.getPicture();
    for (final Picture pic_1 : _picture_1) {
      {
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("<div class=\"carousel-item");
        {
          if ((counter == 0)) {
            _builder_4.append(" active ");
          }
        }
        _builder_4.append("\">");
        _builder_4.newLineIfNotEmpty();
        _builder_4.append("  ");
        _builder_4.append("<img src=\"");
        String _value_1 = pic_1.getImagepath().get(0).getValue();
        _builder_4.append(_value_1, "  ");
        _builder_4.append("\" class=\"d-block w-100\" alt=\"...\">");
        _builder_4.newLineIfNotEmpty();
        _builder_4.append("</div>");
        _builder_4.newLine();
        this.builder.append(_builder_4);
        counter++;
      }
    }
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("          ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("        ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("      ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("    ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("  ");
    _builder_4.append("</div>");
    _builder_4.newLine();
    _builder_4.append("</div>");
    _builder_4.newLine();
    this.builder.append(_builder_4);
  }
  
  private void genContactInformation(final ContactInformation con) {
    this.builder.newLine();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"row mb-3\" id=\"");
    String _name = con.getName();
    _builder.append(_name);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("<div class=\"col\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div class=\"card\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<div class=\"card-header\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Contact Me");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<form class=\"mb-3 mt-3\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<div class=\"form-group col-4\">");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<label for=\"exampleFormControlInput1\">");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<h5>Your Email Address</h5>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"name@example.com\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<div class=\"form-group col-11\">");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<label for=\"exampleFormControlTextarea1\">");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<h5>Message</h5>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<textarea class=\"form-control\" id=\"message\" rows=\"3\"></textarea>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<div class=\"d-flex justify-content-center\">");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<button class=\"btn btn-primary btn-lg\" type=\"submit\">Send</button>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</form>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    this.builder.append(_builder);
  }
  
  private void genLinks(final Links links) {
    this.builder.newLine();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"row mb-3\" id=\"");
    String _name = links.getName();
    _builder.append(_name);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<div class=\"col\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"card\">");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<div class=\"card-header\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Links");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<div class=\"card-group\">");
    _builder.newLine();
    this.builder.append(_builder);
    EList<LinkItem> _links = links.getLinks();
    for (final LinkItem l : _links) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<div class=\"card text-center\">");
      _builder_1.newLine();
      _builder_1.append("              ");
      _builder_1.append("<div class=\"card-body\">");
      _builder_1.newLine();
      _builder_1.append("                ");
      _builder_1.append("<a class=\"btn btn-info\" href=\"");
      String _value = l.getLink().get(0).getPath().get(0).getValue();
      _builder_1.append(_value, "                ");
      _builder_1.append("\" role=\"button\">");
      String _value_1 = l.getText().get(0).getDescription().get(0).getValue();
      _builder_1.append(_value_1, "                ");
      _builder_1.append("</a>");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("              ");
      _builder_1.append("</div>");
      _builder_1.newLine();
      _builder_1.append("            ");
      _builder_1.append("</div>");
      _builder_1.newLine();
      this.builder.append(_builder_1);
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("      ");
    _builder_2.append("</div>");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("</div>");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("</div>");
    _builder_2.newLine();
    _builder_2.append("</div>");
    _builder_2.newLine();
    this.builder.append(_builder_2);
  }
  
  private void genFooter(final PageFooter footer) {
    this.builder.newLine();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<nav class=\"navbar navbar-light navbar-expand-lg bg-light\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">");
    _builder.newLine();
    this.builder.append(_builder);
    EList<LinkItem> _links = footer.getLinks();
    for (final LinkItem l : _links) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<li class=\"nav-item\">");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<a class=\"nav-link\" href=\"");
      String _value = l.getLink().get(0).getPath().get(0).getValue();
      _builder_1.append(_value, "\t");
      _builder_1.append("\">");
      String _value_1 = l.getText().get(0).getDescription().get(0).getValue();
      _builder_1.append(_value_1, "\t");
      _builder_1.append("</a>");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("</li>");
      _builder_1.newLine();
      this.builder.append(_builder_1);
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("  ");
    _builder_2.append("</ul>");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("<p class=\"float-right\">");
    _builder_2.newLine();
    _builder_2.append("    ");
    _builder_2.append("<a href=\"#\">Back to top</a>");
    _builder_2.newLine();
    _builder_2.append("  ");
    _builder_2.append("</p>");
    _builder_2.newLine();
    _builder_2.append("</nav>");
    _builder_2.newLine();
    this.builder.append(_builder_2);
  }
}
