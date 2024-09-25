//problem with encode/decode
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 * @author Ria Galanos (TJHSST), Doug Oberle (WTW)...
 */
public class Picture extends SimplePicture {
    ///////////////////// constructors ///////////////////////////////////**
    /**
     * Constructor that takes no arguments 
     */
    public Picture () {
        /* not needed but use it to show the implicit call to super()
        * child constructors always call a parent constructor 
        */
        super();  
    }


    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName) {
        // let the parent class handle this fileName
        super(fileName);
    }


    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width) {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture) {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image) {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return the Picture from the Picture
     * @return the picture (this)
     */
    public Picture getPicture() {
        return this;
    }	

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString() {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;
    }

    /** 
     * Method to set the red to 0  
     * @author Andrew Kim
     */
    public void zeroRed() {
        Pixel[][] pixels = this.getPixels2D();
        for(int row = 0; row< pixels.length; row++) {
            for(int col = 0; col<pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                pixelObj.setRed(0);
            }
        }
    }
    
    /** 
     * Method to set the green to 0  
     * @author Andrew Kim
     */   
    public void zeroGreen() {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                pixelObj.setGreen(0);
            }
        }
    }	
    
    /** 
     * Method to set the blue to 0  
     * @author Andrew Kim
     */
    public void zeroBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                pixelObj.setBlue(0);
            }
        }
    }	
    
    /** 
     * Method to keep just the red  
     * @author Andrew Kim
     */    
    public void keepOnlyRed() {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                pixelObj.setGreen(0);
                pixelObj.setBlue(0);
            }
        }
    } 
    
    /** 
     * Method to keep just the green  
     * @author Andrew Kim
     */    
    public void keepOnlyGreen() {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                pixelObj.setRed(0);
                pixelObj.setBlue(0);
            }
        }
    }  

    /** 
     * Method to keep just the blue  
     * @author Andrew Kim
     */       
    public void keepOnlyBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                pixelObj.setRed(0);
                pixelObj.setGreen(0);
            }
        }
    }  
    
    /** 
     * Method to modify red by some percentage parameter between 0% and 200%
     * modifyRed(100) nets no change, modifyRed(50) decreases the red to 50% of its original value
     * modifyRed(200) increases the red by 100% 
     * @param x the percentage by which we want to modify the red pixels by
     * @author Andrew Kim
     */  
    public void modifyRed(int x) {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                if (x < 0 || x > 200) {
                    return;
                }
                int newRed = pixelObj.getRed();
                newRed = newRed + ((int) newRed * x / 100);
                if (newRed > 255) {
                    newRed = 255;
                }
                pixelObj.setRed(newRed);
            }
        }
    }
    
    /** 
     * Method to modify green by some percentage parameter between 0% and 200%
     * modifyGreen(100) nets no change, modifyGreen(50) decreases the green to 50% of its original value
     * modifyGreen(200) increases the green by 100% 
     * @param x the percentage by which we want to modify the blue pixels by
     * @author Andrew Kim
     */    
    public void modifyGreen(int x) {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                if (x < 0 || x > 200) {
                    return;
                }
                int newGreen = pixelObj.getGreen();
                newGreen = newGreen + ((int) newGreen * x / 100);
                if (newGreen > 255) {
                    newGreen = 255;
                }
                pixelObj.setRed(newGreen);
            }
        }
    }
    
    /** 
     * Method to modify blue by some percentage parameter between 0% and 200%
     * modifyBlue(100) nets no change, modifyBlue(50) decreases the blue to 50% of its original value
     * modifyBlue(200) increases the blue by 100% 
     * @param x the percentage by which we want to modify the blue pixels by 
     * @author Andrew Kim
     */   
    public void modifyBlue(int x) {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                if (x < 0 || x > 200) {
                    return;
                }
                int newBlue = pixelObj.getBlue();
                newBlue = newBlue + ((int) newBlue * x / 100);
                if (newBlue > 255) {
                    newBlue = 255;
                }
                pixelObj.setRed(newBlue);
            }
        }
    }
    
    /** 
     * Method to place a rainbow filter over the picture 
     */
    public void rainbowBar() {
        Pixel pixel = null;
        Pixel[][] pixels = this.getPixels2D();
        int numRows = pixels.length/6;
        for(int row = 0; row< pixels.length; row++) {
            for(int col = 0; col<pixels[row].length; col++) {
                pixel = pixels[row][col];
                //red orange yellow green blue purple
                if (row<numRows) { //red
                pixel.setRed((pixel.getRed()+255)/2);
                } else if (row<numRows*2) { //orange
                    pixel.setRed((pixel.getRed()+255)/2);
                    pixel.setGreen((pixel.getGreen()+127)/2);
                    pixel.setBlue((pixel.getBlue()+44)/2);   
                } else if (row<numRows*3) { //yellow
                    pixel.setRed((pixel.getRed()+255)/2);
                    pixel.setGreen((pixel.getGreen()+255)/2);
                } else if (row<numRows*4) { //green
                    pixel.setGreen((pixel.getGreen()+255)/2); 
                } else if (row<numRows*5) { //blue
                    pixel.setBlue((pixel.getBlue()+255)/2); 
                } else { //purple
                    pixel.setRed((pixel.getRed()+143)/2);
                    pixel.setBlue((pixel.getBlue()+255)/2);
                }
            }
        }          
    }
    
    /** 
     * Method to negate the picture - change the color of every pixel to its inverse
     */
    public void negate() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        for(int row = 0; row< pixels.length; row++) {
            for(int col = 0; col<pixels[row].length; col++) {
                pixel = pixels[row][col];
                pixel.setRed(255-pixel.getRed());
                pixel.setGreen(255-pixel.getGreen());
                pixel.setBlue(255-pixel.getBlue()); 
            }
        }
    }            
    
    /** 
     * Method to grayscale the picture - change every pixel to its equvalently bright or dark shade of gray
     * @author Andrew Kim
     */
    public void grayscale() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        for(int row = 0; row< pixels.length; row++) {
            for(int col = 0; col<pixels[row].length; col++) {
                pixel = pixels[row][col];
                int temp =(pixel.getRed()+pixel.getGreen()+pixel.getBlue())/3;
                pixel.setRed(temp);
                pixel.setGreen(temp);
                pixel.setBlue(temp); 
            }
        }
    }              
    
    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        for(int row = 0; row< pixels.length; row++) {
            for(int col = 0; col<(pixels[row].length)/2; col++) {
                pixel = pixels[row][pixels[row].length-col-1];
                pixel.setColor(new Color(pixels[row][col].getRed(), pixels[row][col].getGreen(), pixels[row][col].getBlue()));
            }
        }
        
    }
    
    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from right to left */   
    public void mirrorVerticalRightToLeft() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        for(int row = 0; row< pixels.length; row++) {
            for(int col = (pixels[row].length)/2; col<pixels[row].length; col++) {
                pixel = pixels[row][pixels[row].length-col-1];
                pixel.setColor(new Color(pixels[row][col].getRed(), pixels[row][col].getGreen(), pixels[row][col].getBlue()));
            }
        }
    } 
    
    /** Method that mirrors the picture around a 
     * horizontal mirror in the center of the picture
     * from top to bottom */   
    public void mirrorHorizontal() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        for(int row = 0; row< pixels.length/2; row++) {
            for(int col = 0; col<pixels[row].length; col++) {
                pixel = pixels[pixels.length-row-1][col];
                pixel.setColor(new Color(pixels[row][col].getRed(), pixels[row][col].getGreen(), pixels[row][col].getBlue()));
            }
        }
    }
    
    /** Method that mirrors the picture around a 
     * horizontal mirror in the center of the picture
     * from bottom to top */   
    public void mirrorHorizontalBotToTop() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        for(int row = pixels.length/2; row< pixels.length; row++) {
            for(int col = 0; col<pixels[row].length; col++) {
                pixel = pixels[pixels.length-row-1][col];
                pixel.setColor(new Color(pixels[row][col].getRed(), pixels[row][col].getGreen(), pixels[row][col].getBlue()));
            }
        }
    }
        
    /** Method that mirrors the picture around a 
     * diagonal mirror from the upper-left corner
     * to the lower-right  */   
    public void mirrorDiagonal() {
        int max;
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        if (pixels.length>pixels[0].length) {
            max = pixels[0].length;
        } else {
            max = pixels.length;
        }
        for(int row = 0; row< max; row++) {
            for(int col = 0; col<max-row; col++) {
                pixel = pixels[pixels.length-col-1-(pixels.length-max)][pixels[row].length-row-1-(pixels[row].length-max)];
                pixel.setColor(new Color(pixels[row][col].getRed(), pixels[row][col].getGreen(), pixels[row][col].getBlue()));
            }
        }
    }
    
    /** Method that mirrors the picture around a 
     * diagonal mirror from the upper-right corner
     * to the lower-left  */   
    public void mirrorDiagonalOpposite() {
        int max;
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        if (pixels.length>pixels[0].length) {
            max = pixels[0].length;
        } else {
            max = pixels.length;
        }
        for(int row = 0; row< max; row++) {
            for(int col = row; col<max; col++) {
                pixel = pixels[col][row];
                pixel.setColor(new Color(pixels[row][col].getRed(), pixels[row][col].getGreen(), pixels[row][col].getBlue()));
            }
        }
    }	
        
    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, int startRow, int startCol) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
            fromRow < fromPixels.length &&
            toRow < toPixels.length; 
            fromRow++, toRow++) {

            for (int fromCol = 0, toCol = startCol; 
                fromCol < fromPixels[0].length &&
                toCol < toPixels[0].length;  
                fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }
    
    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture to a specific location
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy
     * @param startCol the start col to copy
     * @param finRow the finish row to copy
     * @param finCol the finish col to copy
     * @param startToRow the start row location to copy to
     * @param startToCol the start col location to copy to
     */ 
    public void copySection(Picture fromPic, int startRow, int startCol, 
                            int finRow, int finCol, int startToRow, int startToCol) {
        Pixel fromPixel=null;
        Pixel toPixel=null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for( int fromRow = startRow, toRow = startToRow; fromRow < (finRow) 
                    && toRow < toPixels.length; fromRow ++,toRow++) {
            for(int fromCol = startCol, toCol = startToCol; fromCol < finCol
                &&  toCol < toPixels[0].length; fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }
        
    /** 
    * Method to sepia tone the picture
    @author Andrew Kim
    */
    public void sepiatone() {
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel pixelObj = pixels[row][col];
                int currentRed = pixelObj.getRed();
                int currentGreen = pixelObj.getGreen();
                int currentBlue = pixelObj.getBlue();

                pixelObj.setRed((int) ((currentRed * 0.393) + (currentGreen * 0.769) + (currentBlue * 0.189)));
                pixelObj.setGreen((int) ((currentRed * 0.349) + (currentGreen * 0.686) + (currentBlue * 0.168)));
                pixelObj.setBlue((int) ((currentRed * 0.272) + (currentGreen * 0.534) + (currentBlue * 0.131)));
            }
        }
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist) {
        Pixel[][] pixels = this.getPixels2D();
        int minR;
        int minG;
        int minB;
        int maxR;
        int maxG;
        int maxB;
        int colordiff = 50;
        boolean edge = false;
        Pixel temp;
        int width = 5;
        for (int row= 0; row +width<pixels.length;row+=width) {
            for (int col=0; col+width<pixels[0].length;col+=width) {
                    minR = pixels[row][col].getRed();
                    maxR = pixels[row][col].getRed();
                    minG = pixels[row][col].getGreen();
                    maxG = pixels[row][col].getGreen();
                    minB = pixels[row][col].getBlue();
                    maxB = pixels[row][col].getBlue();
                for (int scanrow=row; scanrow<row+width; scanrow++) {
                    for (int scancol=col; scancol<col+width;scancol++) {
                        if (pixels[scanrow][scancol].getRed()<minR) {
                            minR = pixels[scanrow][scancol].getRed();
                        }
                        if (pixels[scanrow][scancol].getGreen()<minG) {
                            minG = pixels[scanrow][scancol].getGreen();
                        }
                        if (pixels[scanrow][scancol].getBlue()<minB) {
                            minB = pixels[scanrow][scancol].getBlue();
                        }
                        if (pixels[scanrow][scancol].getRed()>maxR) {
                            maxR = pixels[scanrow][scancol].getRed();
                        }
                        if (pixels[scanrow][scancol].getGreen()>maxG) {
                            maxG = pixels[scanrow][scancol].getGreen();
                        }
                        if (pixels[scanrow][scancol].getBlue()>maxB) {
                            maxB = pixels[scanrow][scancol].getBlue();
                        }
                    }
                }
                if (maxB-minB>colordiff) {
                    edge = true;
                }
                if (maxG-minG>colordiff) {
                    edge = true;
                }
                if (maxR-minR>colordiff) {
                    edge = true;
                }
                if (edge) {
                    for (int scanrow=row; scanrow<row+width; scanrow++) {
                    for (int scancol=col; scancol<col+width;scancol++) {
                        temp = pixels[scanrow][scancol];
                        temp.setColor(new Color(255,255,255));
                    }
                }
                edge = false;
                } else {
                    for (int scanrow=row; scanrow<row+width; scanrow++) {
                        for (int scancol=col; scancol<col+width;scancol++) {
                            temp = pixels[scanrow][scancol];
                            temp.setColor(new Color(0,0,0));
                        }
                    } 
                }
                
            }
        }
    }
        
    /** 
    * Method to pixelate the picture (low bit video game effect)
    * @param resolution the block size that we simulate for each pixel
    @author Andrew Kim
    */
    public void pixelate(int resolution) {
        Pixel[][] pixels = this.getPixels2D();
        int length = pixels.length;
        int width = pixels[0].length;
        for (int rowBlock = 0; rowBlock < length / resolution + 1; rowBlock++) {
            for (int colBlock = 0; colBlock < width / resolution + 1; colBlock++) {
                // pixel values
                int red = 0;
                int green = 0;
                int blue = 0;

                // max
                int rowMax = (rowBlock + 1) * resolution;
                if (rowMax > length) {
                    rowMax = length;
                }
                int colMax = (colBlock + 1) * resolution;
                if (colMax > width) {
                    colMax = width;
                }

                // traverse grid
                for (int row = rowBlock * resolution; row < rowMax; row++) {
                    for (int col = colBlock * resolution; col < colMax; col++) {
                        red += pixels[row][col].getRed();
                        green += pixels[row][col].getGreen();
                        blue += pixels[row][col].getBlue();
                    }
                }

                red = red / (resolution * resolution);
                green = green / (resolution * resolution);
                blue = blue / (resolution * resolution);
                System.out.println(red + " " + green + " " + blue);
                // assign grid
                for (int row = rowBlock * resolution; row < rowMax; row++) {
                    for (int col = colBlock * resolution; col < colMax; col++ ) {
                        pixels[row][col].setColor(new Color(red, green, blue));
                    }
                }
            }
        }
    }
    
    /** 
     * Method to blur the picture
     * @author Andrew Kim
     */
    public void blur() {
        Pixel[][] fromPixels = this.getPixels2D();
        int length = fromPixels.length;
        int width = fromPixels[0].length;
        Pixel[][] toPixels = this.getPixels2D();
        for (int row = 1; row < length - 1; row++) {
            for (int col = 1; col < width - 1; col++) {
                int red = 0;
                int green = 0;
                int blue = 0;
                for (int nRow = row - 1; nRow < row + 2; nRow++) {
                    for (int nCol = col - 1; nCol < col + 2; nCol++) {
                        red += fromPixels[nRow][nCol].getRed();
                        blue += fromPixels[nRow][nCol].getBlue();
                        green += fromPixels[nRow][nCol].getGreen();
                    }
                }
                toPixels[row][col].setColor(new Color(red / 9, green / 9, blue / 9));
            }
        }

        for (int row = 0; row < length; row++) {
            for (int col = 0; col < width; col++) {
                fromPixels[row][col] = toPixels[row][col];
            }
        }
    }

    /** 
    * Method to calculate the distance between two colors
    * @param p the pixel we want to find the color distance from
    * @param c the color we want to find the color distance from pixel
    * @return the color distance between p and c
    */        
    public double distance(Pixel p, Color c) {
    
        return Math.sqrt( Math.pow ( Math.abs (p.getRed()-c.getRed() ),2 ) +
                    Math.pow ( Math.abs (p.getGreen()-c.getGreen() ),2 ) +
                        Math.pow ( Math.abs (p.getBlue()-c.getBlue() ),2 ) );	
    }

    /** 
    * Method to posterize the picture - reduce to only 3-4 colors of your choice
    * @author Andrew Kim
    */
    public void posterize() {
        Color[] colors = {new Color(120,0,0), new Color(193,18,31), new Color(253,240,213), new Color(0,48,73), new Color(102,155,188)};
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                pixel = pixels[row][col];
                int closestIndex = 0;
                double[] distances = new double[colors.length];
                for (int i = 0; i < colors.length; i++) {
                    distances[i] = distance(pixel, colors[i]);
                    if (i != 0 && distances[i] < distances[closestIndex]) {
                        closestIndex = i;
                    }
                }
                pixel.setColor(colors[closestIndex]);
            }
        }
    }
    /**
    * Method for copying the no-green pixels from left side of a picture (with green background) to the right side
    * @author Andrew Kim
    */  
    public void greenScreen() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length / 2; col++) {
                pixel = pixels[row][col];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                if ((green < blue || green < red) || (green - blue < 50 || green - red < 50)) {
                    pixels[row][pixels[0].length - 1 - col].setColor(pixel.getColor());
                }
            }
        }
    }			

    /** 
    * Method to color splash a picture
    * Keeps any pixel close to Color c, but casts all other pixels to its gray-scale equivalent
    * @param c the color we want to keep
    */  	
    public void colorSplash(Color c) {
        Pixel[][] pixels = this.getPixels2D();
        Pixel pixel = null;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                pixel = pixels[row][col];
                if (distance(pixel, c) > 50) {
                    int grayscale = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
                    pixel.setColor(new Color(grayscale, grayscale, grayscale));
                    
                }
            }
        }
    }	
        
    /** Hide a black and white message in the current
        * picture by changing the red to even and then
        * setting it to odd if the message pixel is black 
        * @param messagePict the picture with a message
        @author Matthew Lee
        */
    public void encode(Picture messagePict) {
        Pixel[][] pixels = this.getPixels2D();
        Pixel[][] messagePictPixels = messagePict.getPixels2D();
        Pixel pixel;
        for (int row=0;row<pixels.length;row++) {
            if (row<messagePictPixels.length) {
            for (int col=0;col<pixels[0].length;col++) {
                if (col < messagePictPixels[0].length) {
                pixel = pixels[row][col];
                System.out.println(row + " " + col);
                if (messagePictPixels[row][col].getRed() == 0) {
                    if (pixel.getRed()%2==0) {
                        pixel.setRed(pixel.getRed()+1);
                    }
                } else {
                    if (pixel.getRed()%2==1) {
                        pixel.setRed(pixel.getRed()+1);
                    }
                }
            }
            }
        }
        }
    }
    
    /**
     * Method to decode a message hidden in the
     * red value of the current picture
     * @return the picture with the hidden message (this)
     * @author Matthew Lee
     */
    public Picture decode() {
        Pixel[][] pixels = this.getPixels2D();
        Picture rpic = new Picture(pixels.length, pixels[0].length);
        Pixel[][] rpix = rpic.getPixels2D();
        Pixel thepixel;
        for (int row=0;row<pixels.length;row++) {
            if (row<rpix.length) {
            for (int col=0;col<pixels[0].length;col++) {
                if (col<rpix[0].length) {
                thepixel = rpix[row][col];
                if (pixels[row][col].getRed()%2 != 0) {
                    thepixel.setColor(new Color(0,0,0));
                } 
            }
            }
        }
        }
        return rpic;
    }


    /**
     * Surprise
     * @author Andrew Kim
     */
    public void surprise() {
        posterize();
        pixelate(4);
        
    }
    
    /** 
     * Main method for testing - each class in Java can have a main method
     * @param args 'cause, you know...we need this 
     */
    public static void main(String[] args) {
        //Picture pix = new Picture(); // rg - this doesn't open a picture
        Picture pix = new Picture("640x480.jpg"); //- rg this explores the 640x480 in the images directory
        pix.explore();
    }

}
