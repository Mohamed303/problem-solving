 
 // replace all string spaces with %02 
 ////////////////////////////////////////////////////////////////////////
 public char[] replacespaces(String s)
    {
        int lastIndex=s.length()-1;
        int firstIndex=0;
        int spaceCount=0;
        while (s.charAt(lastIndex)==' ')lastIndex--;
        while (s.charAt(firstIndex)==' ')firstIndex++;
        //count spaces
        for(int i=firstIndex;i<lastIndex;i++)if(s.charAt(i)==' ')spaceCount++;

        char[] newString=new char[(lastIndex-firstIndex)+(spaceCount*2)+1];
        int newString_counter=0;
        for(int i=firstIndex;i<=lastIndex;i++){
            if(s.charAt(i)==' ')
            {
                newString[newString_counter]='%';
                newString[newString_counter+1]='0';
                newString[newString_counter+2]='2';
                newString_counter+=3;
            }
            else {
                newString[newString_counter] = s.charAt(i);
                newString_counter++;
            }
        }

        return newString;
    }