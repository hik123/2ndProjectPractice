package com.green.projrentalprac.User;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.green.projrentalprac.CharEncodingConfig;
import com.green.projrentalprac.common.ResVo;
import com.green.projrentalprac.user.UserController;
import com.green.projrentalprac.user.UserService;
import com.green.projrentalprac.user.model.UserSignupDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Import(CharEncodingConfig.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mvc;
    @Autowired
    private ObjectMapper mapper;
    @MockBean
    private UserService service;

    @Test
    void postSignup() throws Exception {
        ResVo result = new ResVo(2);

    given(service.postSignup(any())).willReturn(result);

    UserSignupDto dto = new UserSignupDto();

    mvc.perform(
            MockMvcRequestBuilders
                    .post("/api/user")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(mapper.writer().writeValueAsString(dto))
    )
            .andExpect(status().isOk())
            .andExpect(content().string(mapper.writeValueAsString(result)))
            .andDo(print());

    verify(service).postSignup(any());
    }
}
