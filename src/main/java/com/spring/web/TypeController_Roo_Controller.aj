// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.spring.web;

import com.spring.domain.Type;
import com.spring.web.TypeController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect TypeController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String TypeController.create(@Valid Type type, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, type);
            return "types/create";
        }
        uiModel.asMap().clear();
        type.persist();
        return "redirect:/types/" + encodeUrlPathSegment(type.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String TypeController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Type());
        return "types/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String TypeController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("type", Type.findType(id));
        uiModel.addAttribute("itemId", id);
        return "types/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String TypeController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("types", Type.findTypeEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) Type.countTypes() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("types", Type.findAllTypes(sortFieldName, sortOrder));
        }
        return "types/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String TypeController.update(@Valid Type type, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, type);
            return "types/update";
        }
        uiModel.asMap().clear();
        type.merge();
        return "redirect:/types/" + encodeUrlPathSegment(type.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String TypeController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Type.findType(id));
        return "types/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String TypeController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Type type = Type.findType(id);
        type.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/types";
    }
    
    void TypeController.populateEditForm(Model uiModel, Type type) {
        uiModel.addAttribute("type", type);
    }
    
    String TypeController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
