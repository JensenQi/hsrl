package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stowaway_55102 : Card() {
    override val id = 55102
    override val name = "偷渡者"
    override val description = "<b>战吼：</b>如果你的牌库中有对战开始时不在牌库中的牌，则抽取其中的两张。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "理解理解他吧，这些天就连经济舱都贵得飞起。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4452af2f5bb3894fa1ada1baf97f1f41e9cb12b91ed3f750acc63cf6ed4d9e5d.png"
}
