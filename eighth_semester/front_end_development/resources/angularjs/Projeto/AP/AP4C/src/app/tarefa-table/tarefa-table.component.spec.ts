import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TarefaTableComponent } from './tarefa-table.component';

describe('TarefaTableComponent', () => {
  let component: TarefaTableComponent;
  let fixture: ComponentFixture<TarefaTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TarefaTableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TarefaTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
