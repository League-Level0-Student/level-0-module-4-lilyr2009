PImage face;
void setup() {
  
  face = loadImage("face.jpeg");
  size(800,600);
  face.resize(800,600);
}

void draw() {
  image(face,0,0);
  fill(#F7F0F0);
  ellipse(290,300,350,380);
  ellipse(350, 250, 15,20);
  
 
}
