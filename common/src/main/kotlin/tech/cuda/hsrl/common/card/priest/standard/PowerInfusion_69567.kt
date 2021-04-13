package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerInfusion_69567 : Card() {
    override val id = 69567
    override val name = "能量灌注"
    override val description = "使一个随从获得+2/+6。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "能量灌体，让人雄起，让人欢喜！"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3ded00a22c83b80dbd68b8c80dc5752fab79146c806cd63239ffa475e2da04bf.png"
}
