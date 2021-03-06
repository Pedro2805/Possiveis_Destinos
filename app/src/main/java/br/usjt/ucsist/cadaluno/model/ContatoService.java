package br.usjt.ucsist.cadaluno.model;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ContatoService {

    @GET("/api/b7bceb64c78b4b55b37ffbe9279e905d/contato")
    Call<List<Contato>> getAllContatos();

    @POST("/api/b7bceb64c78b4b55b37ffbe9279e905d/contato")
    Call<ResponseBody> salvarContato(
            @Body
                    Contato contato);

    @PUT("/api/b7bceb64c78b4b55b37ffbe9279e905d/contato/{id}")
    Call<ResponseBody> alterarContato(
            @Path("id") String id,
            @Body ContatoPut contatoPut);

    @DELETE("/api/b7bceb64c78b4b55b37ffbe9279e905d/contato/{id}")
    Call<ResponseBody> deletarContato(
            @Path("id") String id);
}
