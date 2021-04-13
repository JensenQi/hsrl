package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheBlackKnight_1656 : Card() {
    override val id = 1656
    override val name = "黑骑士"
    override val description = "<b>战吼：</b>消灭一个具有<b>嘲讽</b>的敌方随从。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "巫妖王派他来阻止银色锦标赛的进行。可以说那是个失败。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/100c8232f8d011257b5429c45075ba9ab78103bba20e53f2d6d177515aae3463.png"
}
