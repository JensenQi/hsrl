package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StolenSteel_50749 : Card() {
    override val id = 50749
    override val name = "盗取武器"
    override val description = "<b>发现</b>一张<i>（另一职业的）</i> 武器牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "谁叫萨尔不肯<i>借</i>我毁灭之锤的。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c141cf641876aacece599ac26992a76fee993e9751767f37861f06b42c7fe520.png"
}
