package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MillhouseManastorm_855 : Card() {
    override val id = 855
    override val name = "米尔豪斯·法力风暴"
    override val description = "<b>战吼：</b>下个回合敌方法术的法力值消耗为（0）点。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "“我要把你们烤熟了，宝贝儿们！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/85b1acdb72098268aeb0a90c1bcaebde8b108bb32bfe55842a2d6927bb150046.png"
}
