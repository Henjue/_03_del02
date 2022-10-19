public class Die {

    private int faceValue;  // current value showing on the die

        //  Constructor: Sets the initial face value.
        public Die()
        {
            faceValue = 1;
        }
        //  Rolls the die and returns the result.
        public int roll()
        {
            // maximum face value
            int MAX = 6;
            faceValue = (int)(Math.random() * MAX) + 1;

            return faceValue;
        }
        //  Face value mutator.
        public void setFaceValue (int value)
        {
            faceValue = value;
        }
        //  Face value accessor.
        public int getFaceValue()
        {
            return faceValue;
        }
        //  Returns a string representation of this die.
        public String toString()
        {

            return Integer.toString(faceValue);
        }
}
