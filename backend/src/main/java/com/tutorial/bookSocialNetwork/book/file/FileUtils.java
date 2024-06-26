package com.tutorial.bookSocialNetwork.book.file;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
    private static final Logger log = LoggerFactory.getLogger(FileUtils.class);

    public static byte[] readFileFromLocation(String fileUrl) {
        if (StringUtils.isBlank(fileUrl)) {
            return null;
        }

        try {
            Path filepath = new File(fileUrl).toPath();

            return Files.readAllBytes(filepath);

        } catch (IOException e) {
            log.warn("No file found in the path {}", fileUrl);
        }

        return null;


    }
}
