package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheBlackKnight_69805 : Card() {
    override val id = 69805
    override val name = "黑骑士"
    override val description = "<b>战吼：</b>消灭一个具有<b>嘲讽</b>的敌方随从。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "巫妖王派他来阻止银色锦标赛的进行。可以说那是个失败。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b5d5d6eb1298dbca9eb71badf1aad8dd16f135e4456b64fdce92d3af50a71c8e.png"
}
