package pe.edu.cibertec.backoffice_mvc_s.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.backoffice_mvc_s.dto.LanguageDto;
import pe.edu.cibertec.backoffice_mvc_s.entity.Language;
import pe.edu.cibertec.backoffice_mvc_s.repository.LanguageRepository;
import pe.edu.cibertec.backoffice_mvc_s.service.LanguageService;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public List<LanguageDto> getAllLanguages() {
        List<LanguageDto> languages = new ArrayList<LanguageDto>();
        Iterable<Language> iterable = languageRepository.findAll();
        iterable.forEach(lang -> {
            LanguageDto languageDto = new LanguageDto(lang.getLanguageId(),
                    lang.getName());
            languages.add(languageDto);
        });

        return languages;
    }

}
