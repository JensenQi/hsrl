package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritEcho_41879 : Card() {
    override val id = 41879
    override val name = "灵魂回响"
    override val description = "使你的所有随从获得“<b>亡语：</b>将该随从移回你的手牌”。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "死亡不是终点，而是新的开始。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e4c43ad6041ea6f306eca5442302edfc37e85591ecdfe3314ab7ef0d3afd190.png"
}
