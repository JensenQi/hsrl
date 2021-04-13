package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForlornStalker_38875 : Card() {
    override val id = 38875
    override val name = "狼人追猎者"
    override val description = "<b>战吼：</b>使你手牌中所有<b>亡语</b>随从牌获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Wotog
    override val background = "他喜欢将猎物追得精疲力竭，再慢慢将其折磨致死。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f6814f42d27d55343bfc59fd40cbd70720cb068c77d84f2adecdb7b035fa097.png"
}
