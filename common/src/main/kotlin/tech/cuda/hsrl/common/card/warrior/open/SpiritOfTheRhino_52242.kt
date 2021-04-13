package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritOfTheRhino_52242 : Card() {
    override val id = 52242
    override val name = "犀牛之灵"
    override val description = "<b>潜行</b>一回合。你的具有<b>突袭</b>的随从在它被召唤的回合获得<b>免疫</b>。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "我头上有犄角，我身后有尾巴。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1045459e2e5fa768aa3996879d956b68a5b84be35c77f6520f8cc0e7fff0fce0.png"
}
