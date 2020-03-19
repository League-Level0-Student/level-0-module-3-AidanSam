void setup() {
  ellipseMode(CENTER);
     size(1000, 500);
     
}
int rightX = 750;
int leftX =250;
int j = 0;
void draw() {
  background(160, 160, 160);
  for(int j=0; j<30; j++) {
  fill(#000000);
 
noFill();
  ellipse(leftX, 250, j*16, j*16);
  
  ellipse(rightX, 250, j*16, j*16);

  }
  
  leftX ++;
  rightX --;
  if(leftX ==500){
    panik();
    }
}
void panik(){
 
  for(int d=0; d<250; d++) {
     background(160, 160, 160);
       leftX--;
  rightX++;
    noFill();
  ellipse(leftX, 250, j*16, j*16);
  
  ellipse(rightX, 250, j*16, j*16);
  }
}
