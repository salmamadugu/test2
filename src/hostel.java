
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SALAMA HAMIDAN
 */
public class hostel {
    static String HMS_RoomNo,HMS_RoomCategory,HMS_PRICE;
    private static String RoomNo;
    
    public static String getRoomNo() {
        return RoomNo;
    }
     public static void setRoomNO(String RoomNo) throws IOException {
        if(RoomNo.length() == 10)
        {
        hostel.RoomNo = RoomNo;
        writeFile(HMS_RoomNo +" "+ HMS_RoomCategory +" "+ HMS_PRICE);
        }
        else
        {
          HMS.writeError();
        }
    
    

    public static String getHMS_RoomCategory() {
        return HMS_RoomCategory;
    }

    public static void setHMS_RoomCategory(String HMS_RoomCategory) {
        hostel.HMS_RoomCategory = HMS_RoomCategory;
    }

    public static String getHMS_PRICE() {
        return HMS_PRICE;
    }

    public static void setHMS_PRICE(String HMS_PRICE) {
        hostel.HMS_PRICE = HMS_PRICE;
    }

    private static void writeFile(String string) throws IOException, IOException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
      public static void writeFile(String content)
    {
    try
    }
    


    BufferedWriter myBF; 
        try {
            myBF = new BufferedWriter(new FileWriter("HMS.txt", true));
        } catch (IOException ex) {
            Logger.getLogger(hostel.class.getName()).log(Level.SEVERE, null, ex);
        }
