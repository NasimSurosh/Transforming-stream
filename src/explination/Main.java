package explination;


import java.util.List;

class Color {
  private String color;

  public Color(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Color=" + color;
  }

}

public class Main {

  public static void main(String[] args) {
    
    var colors = List.of("white","blue","red","purple","pink");
    colors
    .stream()
    .map(Color:: new)         //    or map(c-> new Color(c))
    .forEach(System.out::println);; 
    
    long totalCount = colors.
        stream().
        count();
    System.out.println("Number of the element in the list are: "+ totalCount);
    

  }

}
