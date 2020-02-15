package com.daniel.codingexercises.challenges.FlippingImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlippingImageTest {

    @Test
    void flipAndInvertImage() {
        FlippingImage flippingImage = new FlippingImage();
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flippingImage.flipAndInvertImage(image);
    }
}