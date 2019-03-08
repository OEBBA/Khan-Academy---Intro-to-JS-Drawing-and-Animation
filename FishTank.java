ar bodyLength = 118;
    var bodyHeight = 74;
    var bodyColor = random(color(51, 58, 184));
    var eyeColor = random(color(107, 34, 34));

    stroke(232, 237, 250);
    strokeWeight(5);
    fill(bodyColor);
    // body
    ellipse(x, y, bodyLength, bodyHeight);
    // tail
    var tailWidth = bodyLength/4;
    var tailHeight = bodyHeight/2;
    triangle(x-bodyLength/2, y,x-bodyLength/2-tailWidth, y-tailHeight,x-bodyLength/2-tailWidth, y+tailHeight);
    // eye
    fill(eyeColor);
    ellipse(x+bodyLength/4, y, bodyHeight/5, bodyHeight/5);

};

drawFish(random(100,400),532);
drawFish(random(100,400),300);
drawFish(random(100,400),197);
drawFish(random(100,400),554);
drawFish(random(100,400),563);
drawFish(random(100,400),364);
drawFish(random(100,400),44);
