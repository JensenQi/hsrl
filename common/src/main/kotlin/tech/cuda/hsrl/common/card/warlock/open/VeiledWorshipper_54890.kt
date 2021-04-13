package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VeiledWorshipper_54890 : Card() {
    override val id = 54890
    override val name = "暗藏的信徒"
    override val description = "<b>战吼：</b> 如果你已经<b>祈求</b>过两次，则抽三张牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "你要是不穿信徒的显眼制服，迦拉克隆怎么知道你是自己人？怎么把你留到最后再吃掉？"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5521f696be2eeac48b0cddb3830c916a9a34784d5fc87202be214f3a65f1f01b.png"
}
