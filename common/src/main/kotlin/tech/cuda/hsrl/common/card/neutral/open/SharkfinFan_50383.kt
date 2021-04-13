package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SharkfinFan_50383 : Card() {
    override val id = 50383
    override val name = "鲨鳍后援"
    override val description = "在你的英雄攻击后，召唤一个1/1的海盗。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "他喜欢的那款汤违反了动物保护法。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c68e8476127cf6f38cbf057fde9b090e1a34e41fa50a057a2e824dc44e19dba1.png"
}
