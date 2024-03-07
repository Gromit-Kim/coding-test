def solution(players, callings):

    player_indices = {player : idx for idx, player in enumerate(players)}

    for calling in callings:
        calling_player_idx = player_indices[calling]

        player_indices[calling] = calling_player_idx - 1
        player_indices[players[calling_player_idx-1]] = calling_player_idx

        players[calling_player_idx-1], players[calling_player_idx] = players[calling_player_idx], players[calling_player_idx-1]

    return players