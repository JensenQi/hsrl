package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritOfTheShark_49972 : Card() {
    override val id = 49972
    override val name = "鲨鱼之灵"
    override val description = "<b>潜行</b>一回合。你的随从的<b>战吼</b>和<b>连击</b>触发两次。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "这个出场自带BGM的家伙很难不暴露行踪。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a05de8e712c16d433ebb629a84e7bac97bbade7a2bab1d11b6b29a0953c3907c.png"
}
