PImage face;
void setup() {
  
  face = loadImage("face.jpeg");
  size(800,600);
  face.resize(800,600);
}

void draw() {
  image(face,0,0);
  fill(#F7F0F0);
  ellipse(330,230,175,200);
  fill(#080000);
  ellipse(mouseX,mouseY, 15,20);
  
  fill(#FAF5F5);
  ellipse(480,250,170,200);
  fill(#0F0101);
  ellipse(mouseX+100,mouseY,15,20);
  println(mouseX+", "+mouseY);
 //right
 if(mouseX<450){
    mouseX=450;
   
  }
  //left
  if(mouseX<300){
    mouseX=300;
  }
  //up
  if(mouseY<100){
    mouseY=100;
  
  }
  //down
  if(mouseY>150);{
    mouseY=150;
  }
 
 
}
