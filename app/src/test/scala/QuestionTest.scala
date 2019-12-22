class QuestionTest extends org.scalatest.FunSuite {


  test("Question.1") {
    assert(Question.last(List(1,2,3)) === 3)
  }

  test("Question.1.a") {
    assertThrows[NoSuchElementException] {
        Question.last(List())
    }
  }



}
