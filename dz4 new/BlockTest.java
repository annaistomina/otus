import java.util.List;

public class BlockTest {
    private final List<Question>questions;
    BlockTest(List<Question>questions)
    {
        this.questions=questions;
    }
    public List<Question>getAllBlocks(){
        return questions;
    }

}
