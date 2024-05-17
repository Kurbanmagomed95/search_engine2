package searchengine.dto.Response;
import lombok.Getter;
import lombok.Setter;
import searchengine.dto.statistics.SearchDto;

import java.util.List;

@Setter
@Getter
public class SearchResponse {
    private boolean result;
    private int count;
    private List<SearchDto> data;
    private String error;

    public SearchResponse(boolean result, int count, List<SearchDto> data) {
        this.result = result;
        this.count = count;
        this.data = data;
    }

    public SearchResponse(boolean result, String error) {
        this.result = result;
        this.error = error;
    }
}