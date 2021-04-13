package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MillhouseManastorm_70092 : Card() {
    override val id = 70092
    override val name = "米尔豪斯·法力风暴"
    override val description = "<b>战吼：</b>下个回合敌方法术的法力值消耗为（0）点。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“我要把你们烤熟了，宝贝儿们！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a8e0b80cdc7456bb300b53bc1aee9a66e4c13e83c93639e8be1a060731d637c8.png"
}
