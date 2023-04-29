package Slack.T05_ManytoOneDeleteExample.service;

import java.util.List;
import section06_JavaJDBC.topic04_INNERJOIN.T05_ManytoOneDeleteExample.model.LiteraryFormat;

public interface LiteraryFormatService {
    List<LiteraryFormat> getAll();

    LiteraryFormat create(LiteraryFormat format);

    LiteraryFormat get(Long id);

    LiteraryFormat update(LiteraryFormat format);

    boolean delete(Long id);
}
