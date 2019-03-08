fill(0, 0, 0);
ellipse(200, 200, 375, 375);
fill(60, 0, 255);
triangle(200, 104, 280, 280, 120, 280);
fill(255, 255, 255);
var answer = floor(random(1, 6));
if (answer === 1) {
    textSize(20);
    text("Yes", 182, 220);
}else if(answer === 2){
    fill(0, 0, 0);
    textSize(20);
    text("No",185, 220);
}else if(answer === 3){
    fill(72, 255, 0);
    textSize(20);
    text("Possibly",165,220);
}else if(answer === 4){
    fill(235, 76, 235);
    textSize(20);
    text("I do not know",144, 220);
}else if(answer === 5){
    fill(191, 209, 222);
    textSize(20);
    text("Try Again Later",136, 220);
}
