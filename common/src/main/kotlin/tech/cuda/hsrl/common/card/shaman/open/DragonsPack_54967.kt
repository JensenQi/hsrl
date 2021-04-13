package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonsPack_54967 : Card() {
    override val id = 54967
    override val name = "巨龙的兽群"
    override val description = "召唤两只2/3并具有<b>嘲讽</b>的幽灵狼。如果你已经<b>祈求</b>过两次，则使它们获得+3/+3。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "每一个巨龙的兽群至少抵得上一张稀有卡牌。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/87346a9c9c0c596851278d3fa9971c49cf9be9c7c7b3662ad7b224763f7c4e1e.png"
}
