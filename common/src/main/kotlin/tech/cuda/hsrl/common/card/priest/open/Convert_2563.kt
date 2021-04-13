package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Convert_2563 : Card() {
    override val id = 2563
    override val name = "策反"
    override val description = "将一个敌方随从的一张复制置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Tgt
    override val background = "“我们这儿提供健全的福利保障……有兴趣吗？！”"
    override val artist = "Dan Dos Santos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b32cec99b3935841636e8bc693b5c2c7d1416d2357b844dbac7086f1f793695d.png"
}
