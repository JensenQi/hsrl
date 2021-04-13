package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KabalOutfitter_63215 : Card() {
    override val id = 63215
    override val name = "暗金教物资官"
    override val description = "<b>战吼，亡语：</b>随机使另一个友方随从获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "不要问她你项链上的羽毛是哪来的。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c78029ef2304795e0faf71529c965a3fe7f57ca8876b980e33daef8805a08dab.png"
}
