package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoknathalLion_56694 : Card() {
    override val id = 56694
    override val name = "莫克纳萨将狮"
    override val description = "<b>突袭，战吼：</b>选择一个友方随从，获得其<b>亡语</b>的复制。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "永远不要低估迎风傲立的狮将。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d300aaceb04284b457a67c3e4e994d87660ca6a9ff2050f51b2ce61e8205c99b.png"
}
