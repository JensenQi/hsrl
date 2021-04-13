package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Khadgar_52502 : Card() {
    override val id = 52502
    override val name = "卡德加"
    override val description = "你的召唤随从的卡牌召唤数量翻倍。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“一次召唤两个的随从叫什么呢？双生随从，哈哈！等等……你别走啊！”"
    override val artist = "Evgeniy Zagumennyy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84a5478488a4b342cf48bb5b1152a247fca1dfe3df20ef72f0e7e49b957d154f.png"
}
