package myPackage
import org.scalatest.FunSuite


class MyTestSuite extends FunSuite {
  
  test("square(-1)=1") {
    assert(MyLib.square(-1)==1);
  }
  
  test("square(0)=0") {
    assert (MyLib.square(0)==0);
  }
}
