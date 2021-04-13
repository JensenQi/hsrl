package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RestlessMummy_53407 : Card() {
    override val id = 53407
    override val name = "焦躁的木乃伊"
    override val description = "<b>突袭，复生</b>"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "生命分离焦虑症患者。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dfbe6063640b348b6cfd948f9bc43ef308a34771e4408d13a73aa4d3fcea9e8b.png"
}
