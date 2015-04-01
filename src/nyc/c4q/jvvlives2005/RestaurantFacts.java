package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/31/15.
 */
import java.util.ArrayList;
import java.util.HashMap;


    public class RestaurantFacts {

        public static void main(String[] args) {

            // Step 1. Use FileParser's static method getLines() to get a nested
            //         ArrayList representing the CSV file.

            ArrayList<ArrayList<String>> facts = FileParser.getLines("/Users/c4q-joshelynvivas/Desktop/AccessCode/AC_03-31/src/nyc/c4q/jvvlives2005/nycRestaurant.csv",14);
            //         For now, use "nyc-restaurants-small.csv".
            //
            //         Use a parameter to specify which column you're interested
            //         in. For now, use the int 14, which will give you the
            //         restaurant's grade.

            // Step 2. Build a HashMap named "restaurants".
            HashMap<String,String> restaurantFacts = new HashMap<String, String>();
            for (ArrayList<String> fact : facts){
                System.out.println(fact.get(1));
            }

            //         Loop over every line and add the appropriate data to your
            //         HashMap.

            // Step 3. Create a Scanner and prompt the user for a restaurant.
            //         If the restaurant has a relevant fact, print it. Otherwise
            //         print "Restaurant not found.".
        }
    }
