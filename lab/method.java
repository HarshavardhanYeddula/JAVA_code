package lab;

public class method
        {
            int l,b,h;
            void setval(int x,int y,int z)
            {
                l=x;
                b=y;
                h=z;
            }
            int area()
            {
                return (l*b*h);
            }
        };
        class CalculateAreaofcuboid
        {

            public static void main (String args[])
            {
                method cub = new method();
                cub.setval (2,3,2);
                System.out.println("Area of cuboid is : "+cub.area());
            }

    }
