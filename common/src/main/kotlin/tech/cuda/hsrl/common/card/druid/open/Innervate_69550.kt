package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Innervate_69550 : Card() {
    override val id = 69550
    override val name = "激活"
    override val description = "在本回合中，获得一个 法力水晶。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "有些德鲁伊做梦时都回响着陌生人的喊叫声：“给我个激活！”"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/51767bd64222cba04e81bbf5f80a08146662af2b0e76fc61820eb2c36c2ed759.png"
}
