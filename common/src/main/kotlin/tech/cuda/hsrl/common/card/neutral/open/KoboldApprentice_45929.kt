package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldApprentice_45929 : Card() {
    override val id = 45929
    override val name = "狗头人学徒"
    override val description = "<b>战吼：</b>造成3点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "可怕的秘密：奥术飞弹对黑暗之主不起作用。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/95c623d051bd16957af5446597c698496f23ab7c9dea9b416d13ee7ab906ef66.png"
}
