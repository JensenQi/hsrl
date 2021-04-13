package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerInfusion_60067 : Card() {
    override val id = 60067
    override val name = "能量灌注"
    override val description = "使一个随从获得+2/+6。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "能量灌体，让人雄起，让人欢喜！"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1939e4a3ef670a0d96cf64e7c88151727b8c340c5ba8cdaf396c29b8aec4a26a.png"
}
