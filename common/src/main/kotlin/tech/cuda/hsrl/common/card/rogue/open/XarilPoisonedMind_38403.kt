package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class XarilPoisonedMind_38403 : Card() {
    override val id = 38403
    override val name = "毒心者夏克里尔"
    override val description = "<b>战吼，亡语：</b>随机将一张毒素牌置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Wotog
    override val background = "什么！螳螂妖给你的东西你也敢喝？真是自寻死路。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e813dad79dca7cacc7552c4acdc9e2003d4e4938173788c70653318dac280bb2.png"
}
