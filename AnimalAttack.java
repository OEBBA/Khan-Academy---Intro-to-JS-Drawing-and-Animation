background(190, 224, 237);

   stroke(105, 84, 86);
   strokeWeight(9);

   //tail
    noFill();
   arc(201, 195, 220, 214, -12, 133);

     fill(204, 156, 45);
   arc(234, 152, 154, 209, -97, 120);//body

    //ears
   ellipse(headX-50, headY-2, ears, ears);
   ellipse(headX+50, headY-2, ears, ears);

   //head
   ellipse(headX, headY, headW, 106);

   //eyes

   ellipse(headX+20,headY,eyes,eyes);
   ellipse(headX-23,headY,eyes , eyes);

   eyes +=1/50;


};
