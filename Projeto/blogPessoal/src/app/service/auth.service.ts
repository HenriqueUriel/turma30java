import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';
import { User } from '../model/User';
import { UserLogin } from '../model/UserLogin';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(
    private http: HttpClient
  ) { }

  token = {
    headers: new HttpHeaders().set('Authorization', environment.token)
  }

  entrar(userLogin: UserLogin): Observable<UserLogin> {
    return this.http.post<UserLogin>('https://blogdouriel.herokuapp.com/usuarios/logar', userLogin)
  }

  cadastrar(user: User): Observable<User> {
    return this.http.post<User>('https://blogdouriel.herokuapp.com/usuarios/cadastrar', user)
  }

  atualizar(user: User): Observable<User>{
    this.token = {
      headers: new HttpHeaders().set('Authorization', environment.token)
    }
    return this.http.put<User>('https://blogdouriel.herokuapp.com/usuarios/atualizar', user, this.token)
  }

  getByIdUser(id: number): Observable<User>{
    return this.http.get<User>(`https://blogdouriel.herokuapp.com/usuarios/${id}`)
  }

  logado() {
    let ok = false

    if(environment.token != ''){
      ok = true
    }

    return ok
  }

  adm(){
    let ok = false

    if(environment.tipo != 'adm'){
      ok = true
    }

    return ok
  }
}
