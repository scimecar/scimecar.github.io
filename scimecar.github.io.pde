int r = 255;
int dia = 10;

void setup() {
  size(640, 360);
  background(0);
}

void draw() {
  fill(r, 100, 200, 25);
  
  if (keyPressed) {
    if (key == '-' || key == '_') {
      dia--;
    } else if (key == '+' || key == '='){
      dia++;
    }
  }
  noStroke();
  circle(mouseX, mouseY, dia);
}

void mousePressed() {
  background(0);
}

