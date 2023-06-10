class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        fillColor(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private void fillColor(int[][]image, int sr, int sc, int color, int newColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) return;
        image[sr][sc] = newColor;
        fillColor(image, sr-1, sc, color, newColor);
        fillColor(image, sr+1, sc, color, newColor);
        fillColor(image, sr, sc-1, color, newColor);
        fillColor(image, sr, sc+1, color, newColor);
    }
    
}
