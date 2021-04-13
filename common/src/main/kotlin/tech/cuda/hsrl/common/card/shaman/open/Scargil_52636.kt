package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Scargil_52636 : Card() {
    override val id = 52636
    override val name = "斯卡基尔"
    override val description = "你的鱼人法力值消耗为（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "想知道这些疤痕是怎么来的吗？他也很想知道。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6f2815c4a4d79e08d1a1b4254bc553f70fdabc041247e271527264afeb2a1377.png"
}
