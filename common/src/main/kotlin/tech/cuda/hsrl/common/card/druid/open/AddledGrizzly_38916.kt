package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AddledGrizzly_38916 : Card() {
    override val id = 38916
    override val name = "腐化灰熊"
    override val description = "在你召唤一个随从后，使其获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Wotog
    override val background = "腐化灰熊曾在森林里袭击过一个猎人。后来那个猎人奇迹般活了下来，并转行做了演员，听说最近还得了奖。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7f345923c1758dbf023d50f91c8c3d769a9e16745d22a6806624975eec1d4b3c.png"
}
