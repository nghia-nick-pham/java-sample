package garbage_collection;

/**
 * Created by NghiaPV on 1/7/2018.
 */

    public class TestGarbage1 {
        public void finalize() {
            System.out.println("object is garbage collected");
        }

        public static void main(String args[]) {
            TestGarbage1 s1 = new TestGarbage1();
            TestGarbage1 s2 = new TestGarbage1();
            TestGarbage1 s3 = new TestGarbage1();

            s1 = null;
            s2 = s3;

            System.gc();
        }
    }


