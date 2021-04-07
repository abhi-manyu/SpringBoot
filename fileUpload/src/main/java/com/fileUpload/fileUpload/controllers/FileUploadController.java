package com.fileUpload.fileUpload.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class FileUploadController
{
    @PostMapping("/upload")
    public ModelAndView HandleUploadedFile(@RequestParam("file") MultipartFile file,
    		Model mod) throws IOException
    {
    	if(file.isEmpty())
    		System.out.println("no files chooosen, at least one file need to be selected");

        byte[] bytes = file.getBytes();
        Path path = Paths.get(file.getOriginalFilename());
        Files.write(path, bytes);
        System.out.println("the file uploaded succesfully: "+file.getOriginalFilename());
        mod.addAttribute("file_Name",file.getOriginalFilename());
        return new ModelAndView("uploadSuccess");
    }
}
