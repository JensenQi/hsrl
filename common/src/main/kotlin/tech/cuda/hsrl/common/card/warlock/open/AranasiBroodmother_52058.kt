package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AranasiBroodmother_52058 : Card() {
    override val id = 52058
    override val name = "阿兰纳丝蛛后"
    override val description = "<b>嘲讽</b> 当你抽到该牌时，为你的英雄恢复 4点生命值。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "孩子多了，脾气也大。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f30a2d555308875fde083c6ff00252d47a7f92748bf519beaed1bceb3d899f34.png"
}
