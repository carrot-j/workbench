package cloud.carrotj.workbench.controller;

import cloud.carrotj.workbench.service.SignUpService;
import cloud.carrotj.workbench.service.WorkspaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign-up")
@RequiredArgsConstructor
public class SignUpController {

    private final SignUpService signUpService;
    private final WorkspaceService workspaceService;

    @GetMapping(value = "/workspaces/v1")
    public Object getWorkspaces() {
        var workspaces = workspaceService.getPublicWorkspaces();
        return workspaces;
    }
}
