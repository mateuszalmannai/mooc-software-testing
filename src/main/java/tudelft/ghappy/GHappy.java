package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                // not first character && one before is also g
                if (i > 0 && str.charAt(i-1) == 'g') {
                    continue;
                }
                // not last character && next character is also g
                if (i+1 < str.length() && str.charAt(i+1) == 'g') {
                    continue;
                }
                return false;
            }
        }

        return true;

    }
}
