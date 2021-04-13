package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NetherBreath_54892 : Card() {
    override val id = 54892
    override val name = "虚空吐息"
    override val description = "造成 2点伤害。如果你的手牌中有龙牌，则改为造成 4点伤害并具有<b>吸血</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "我似乎曾在卡拉赞的虚空中感受过这种吐息，但又略有不同。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/be0d1043060baa37d55e32d8151b4939c8c4ec4325328af719cc4c3199615daf.png"
}
