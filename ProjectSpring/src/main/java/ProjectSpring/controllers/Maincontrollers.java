//package ProjectSpring.controllers;
//
//import ProjectSpring.Service.ProjectService;
//import ProjectSpring.model.Projectmodel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
//
//@RestController
//public class Maincontrollers {
//
//    @Autowired
//    private ProjectService projectService;
//
//    private List<Projectmodel> projectmodelList = new ArrayList<>();
//    private AtomicInteger Id = new AtomicInteger();
//
//    @PostMapping ("/project")
//    public Projectmodel createProject(@RequestBody Projectmodel Projectmodel){
//        Projectmodel.setId(Id.incrementAndGet());
//        projectmodelList.add(Projectmodel);
//        return Projectmodel;
//    }
//
//    @GetMapping ("/project")
//    public ResponseEntity<List<Projectmodel>>  getProject(){
//        List<Projectmodel> projectModels = projectService.getProjectModels();
//        return new ResponseEntity<>(projectModels , HttpStatus.OK);
//    }
//
//    @GetMapping ("/project/{id}")
//    public Projectmodel getProjectById(@PathVariable("id") int id){
//        for (Projectmodel projectmodels : projectmodelList){
//            if (id == projectmodels.getId()){
//                return projectmodels;
//            }
//        }
//
//        throw new IllegalArgumentException();
//    }
//
//    @PutMapping ("/project/{id}")
//    public Projectmodel updateProject(
//        @PathVariable("id") int id,
//        @RequestBody Projectmodel newProject
//    ){
//        for (Projectmodel projectmodels : projectmodelList){
//            if (id == projectmodels.getId()){
//                projectmodelList.remove(projectmodels);
//                newProject.setId(id);
//                projectmodelList.add(newProject);
//                return projectmodels;
//            }
//        }
//
//        throw new IllegalArgumentException();
//    }
//
//    @DeleteMapping ("/project/{id}")
//    public Projectmodel deleteProject(@PathVariable("id") int id){
//        for (Projectmodel projectmodels : projectmodelList){
//            if (id == projectmodels.getId()){
//                projectmodelList.remove(projectmodels);
//                return projectmodels;
//            }
//        }
//
//        throw new IllegalArgumentException();
//    }
//
//
//}
