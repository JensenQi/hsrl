package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CommanderRhyssa_52500 : Card() {
    override val id = 52500
    override val name = "指挥官蕾撒"
    override val description = "你的<b>奥秘</b>会触发 两次。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "两个人也是可以保守秘密的，除非其中一个是蕾撒。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3a296ea780fef78dc968d92ccdf7b8b19f339d67b6ed8ebc71678e4a439e092.png"
}
