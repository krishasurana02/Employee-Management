import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private serverUrl = 'http://localhost:8080/employee';

  constructor(private http: HttpClient) { }

  public getAllEmployee(): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.serverUrl}/all`);
  }

  public getEmployeeById(id) {
    return this.http.get(`${this.serverUrl}/find/${id}`);
  }

  public addEmployee(employee: Employee) {
    return this.http.post(`${this.serverUrl}/add`, employee);
  }

  public updateEmployee(employee: Employee) {
    return this.http.put(`${this.serverUrl}/update`, employee);
  }

  public deleteEmployee(id) {
    return this.http.delete(`${this.serverUrl}/delete/${id}`);
  }

}
