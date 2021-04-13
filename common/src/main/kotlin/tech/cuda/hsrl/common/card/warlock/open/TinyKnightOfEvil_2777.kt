package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TinyKnightOfEvil_2777 : Card() {
    override val id = 2777
    override val name = "小鬼骑士"
    override val description = "每当你弃掉一张牌时，便获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Tgt
    override val background = "“别看我和我的坐骑个子小，我们坏起来可不比那些大块头们差。”"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d611ebb7b21f26dcc5d6a5f927d686c7b12002cc121363b7a4ea4629a2b30fa9.png"
}
