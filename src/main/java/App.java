import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      model.put("cdlist", request.session().attribute("cdlist"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/cd", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     ArrayList<CD> cdlist = request.session().attribute("cdlist");
     if (cdlist == null) {
       cdlist = new ArrayList<CD>();
       request.session().attribute("cdlist", cdlist);
     }

     String title = request.queryParams("title");
     String artist = request.queryParams("artist");
     CD newCD = new CD(title, artist);
     cdlist.add(newCD);
     model.put("template", "templates/success.vtl");
     return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());

  }
}
