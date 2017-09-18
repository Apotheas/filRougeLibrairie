
package com.cdi.g3.common.utiles;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author youssef
 */
public class Utility {
    
    public static java.sql.Date formatStringToSQLDate(String strDate) throws Exception{

       Date utilDate = new Date(); //DateFormat

       SimpleDateFormat dfFormat = new SimpleDateFormat("yyyy-MM-dd"); // parse string into a DATE format      

       utilDate = dfFormat.parse(strDate); // convert a util.Date to milliseconds via its getTime() method        

       long time = utilDate.getTime(); // get the long value of java.sql.Date

       java.sql.Date sqlDate = new java.sql.Date(time);

       return sqlDate;  

   }
    
    
}
