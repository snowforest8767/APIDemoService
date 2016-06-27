/**
 * Created by lizonglin on 2015/7/7.
 */
var json_editor = null;
var json_result = null;
$(document).ready(function() {
    loadJsonEditor();
    $('#json_input_editor').bind('textchange', evaluate);
    $('#jsonpath_input').bind('textchange', evaluate);
    evaluate();
});

function loadJsonEditor() {
    json_editor = new jsoneditor.JSONEditor(
        $('#json_input_editor')[0],
        {
            mode: 'code',
            modes: ['code', 'tree', 'view']
        });
    json_editor.set();
    json_editor.focus();
    json_result = new jsoneditor.JSONEditor(
        $('#json_result_editor')[0],
        {
            mode: 'code',
            modes: ['code', 'tree', 'view']
        });
    json_result.set();
}

function evaluate(){
    var query = $("#jsonpath_input").val();
    var json = JSON.parse(JSON.stringify(json_editor.get()).replace(/(\r\n|\n|\r)/gm,""));
    var result = jsonPath(json, query);
    json_result.set();
    if(result) {
        json_result.set(result[0]);
    }
}
