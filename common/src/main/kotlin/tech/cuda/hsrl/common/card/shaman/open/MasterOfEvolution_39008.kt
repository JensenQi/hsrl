package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MasterOfEvolution_39008 : Card() {
    override val id = 39008
    override val name = "异变之主"
    override val description = "<b>战吼：</b>将一个友方随从随机变形成为一个法力值消耗增加（1）点的随从。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Wotog
    override val background = "在新游戏《炉石宝贝》中一定会大放异彩。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68284f0e52c719719bbe86144949da718407731ee697fa2a98292c8e98a532b4.png"
}
