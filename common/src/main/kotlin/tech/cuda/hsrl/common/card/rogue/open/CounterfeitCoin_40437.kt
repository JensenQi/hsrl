package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CounterfeitCoin_40437 : Card() {
    override val id = 40437
    override val name = "伪造的幸运币"
    override val description = "在本回合中，获得一个法力 水晶。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "这些伪造的幸运币…似乎是玉莲帮的杰作。"
    override val artist = "Joe Wilson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7bec2d11caf37b0830442d41d13f7ca329301079d4b12b7472b4159c4166d923.png"
}
