import java.util.*;
class Main
{
public static void main(String[] args)
{
System.out.println("Enter the password");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=UserMainCode.validatePassword(s);
if(n==1)
System.out.println("Valid Password");
else
System.out.println("Invalid Password");
}
}

class UserMainCode
{
static int validatePassword(String s)
{
int l=s.length();
if(l>=8)
{
 if (s.contains("#") || s.contains("@") || s.contains("_")) {
        char c = s.charAt(0);
if (Character.isAlphabetic(c)) {
          char dd = s.charAt(s.length() - 1);
          
          if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd)))
          {
            if (s.matches(".*[0-9]{1,}.*")
                || s.matches(".*[a-zA-Z]{1,}.*"))
 {
              return 1;
            }

else{
              return -1;
            }
          } else{
            return -1;
          }
        }
         else{
            return -1;
          }
      } else{
        return -1;
      }
    } else{
     return -1;
    }
  }
}
