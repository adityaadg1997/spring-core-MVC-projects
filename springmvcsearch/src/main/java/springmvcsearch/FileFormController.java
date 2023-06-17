package springmvcsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileFormController {
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		
		String str = null;
		System.out.println(str.length());
		
		return "fileform";
	}
	
	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model model) {
		System.out.println("File upload handler");
		
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getContentType());
		
		byte[] data = file.getBytes();

		//save data to server
		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + 
															   File.separator + "resources" +
															   File.separator+"images" +
															   File.separator+
															   file.getOriginalFilename();
		System.out.println(path);
			
			try {
				FileOutputStream fos = new FileOutputStream(path);
				fos.write(data);
				fos.close();
				
				model.addAttribute("msg", "Image Upload");
				model.addAttribute("filename", file.getOriginalFilename());
				
			} catch (IOException e) {
				System.out.println("File Uploading Problem");
				e.printStackTrace();
			}
		
		return "filesuccess";
	}

}
